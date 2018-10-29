package com.pl.jwojcik.restfulapiapp.service;

import com.pl.jwojcik.restfulapiapp.model.NamedEntity;
import com.pl.jwojcik.restfulapiapp.repository.NamedEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */

@Service
public class NamedEntityServiceImpl implements NamedEntityService{

    private final NamedEntityRepository namedEntityRepository;

    @Autowired
    public NamedEntityServiceImpl(NamedEntityRepository namedEntityRepository) {
        this.namedEntityRepository = namedEntityRepository;
    }

    @Override
    public List<NamedEntity> findAll() {
        return namedEntityRepository.findAll();
    }

    @Override
    public Optional<NamedEntity> findOne(Long id) {
        return namedEntityRepository.findById(id);
    }

    @Override
    public NamedEntity create(NamedEntity newNamedEntity) {
        return namedEntityRepository.save(newNamedEntity);
    }

    @Override
    public NamedEntity update(NamedEntity updatedNamedEntity) {
        if(namedEntityRepository.existsById(updatedNamedEntity.getId())){
            namedEntityRepository.save(updatedNamedEntity);
            return updatedNamedEntity;
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if(namedEntityRepository.existsById(id)){
            namedEntityRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
