package com.pl.jwojcik.restfulapiapp.controller;

import com.pl.jwojcik.restfulapiapp.model.Disk;
import com.pl.jwojcik.restfulapiapp.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */

@RestController
@RequestMapping("/disk")
public class DiskController {

    private final DiskService diskService;

    @Autowired
    public DiskController(DiskService diskService) {
        this.diskService = diskService;
    }

    @GetMapping
    public ResponseEntity<List<Disk>> findAll(){
        return ResponseEntity.ok(diskService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findOne(@PathVariable(value = "id") Long id){
            return ResponseEntity.ok(diskService.findOne(id));
    }

    @PostMapping(headers="Accept=application/json")
    public ResponseEntity create(@RequestBody Disk newEntity) {
        return ResponseEntity.ok(diskService.create(newEntity));
    }

    @PutMapping(headers="Accept=application/json")
    public ResponseEntity update(@RequestBody Disk updatedEntity){
        return ResponseEntity.ok(diskService.update(updatedEntity));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(diskService.delete(id));
    }
}
