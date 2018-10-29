package com.pl.jwojcik.restfulapiapp.service;

import com.pl.jwojcik.restfulapiapp.model.NamedEntity;

import java.util.List;
import java.util.Optional;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */
public interface NamedEntityService {
    List<NamedEntity> findAll();
    Optional<NamedEntity> findOne(Long id);
    void create(NamedEntity newNamedEntity);
    void update(NamedEntity updatedNamedEntity);
    void delete(Long id);
}
