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

    //OK
    @GetMapping
    public ResponseEntity<List<NamedEntity>> findAll(){
        List<NamedEntity> results = namedEntityService.findAll();
        return ResponseEntity.ok(results);
    }


    //OK
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findOne(@PathVariable(value = "id") Long id){
            Optional<NamedEntity> result = namedEntityService.findOne(id);
            return ResponseEntity.ok(result);
    }


    //OK
    @PostMapping(headers="Accept=application/json")
    public ResponseEntity create(@RequestBody NamedEntity newEntity) {
        namedEntityService.create(newEntity);
        return ResponseEntity.ok(newEntity);
    }
}
