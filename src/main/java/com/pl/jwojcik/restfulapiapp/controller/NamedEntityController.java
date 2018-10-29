package com.pl.jwojcik.restfulapiapp.controller;

import com.pl.jwojcik.restfulapiapp.model.NamedEntity;
import com.pl.jwojcik.restfulapiapp.service.NamedEntityService;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */

@RestController
@RequestMapping("/namedEntity")
public class NamedEntityController {

    private final NamedEntityService namedEntityService;

    @Autowired
    public NamedEntityController(NamedEntityService namedEntityService) {
        this.namedEntityService = namedEntityService;
    }

    @GetMapping
    public ResponseEntity<List<NamedEntity>> findAll(){
        return ResponseEntity.ok(namedEntityService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findOne(@PathVariable(value = "id") Long id){
            return ResponseEntity.ok(namedEntityService.findOne(id));
    }

    @PostMapping(headers="Accept=application/json")
    public ResponseEntity create(@RequestBody NamedEntity newEntity) {
        return ResponseEntity.ok(namedEntityService.create(newEntity));
    }

    @PutMapping(headers="Accept=application/json")
    public ResponseEntity update(@RequestBody NamedEntity updatedEntity){
        return ResponseEntity.ok(namedEntityService.update(updatedEntity));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(namedEntityService.delete(id));
    }
}
