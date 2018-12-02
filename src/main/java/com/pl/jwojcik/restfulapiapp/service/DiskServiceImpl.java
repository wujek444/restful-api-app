package com.pl.jwojcik.restfulapiapp.service;

import com.pl.jwojcik.restfulapiapp.model.Disk;
import com.pl.jwojcik.restfulapiapp.repository.DiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */

@Service
public class DiskServiceImpl implements DiskService {

    private final DiskRepository diskRepository;

    @Autowired
    public DiskServiceImpl(DiskRepository diskRepository) {
        this.diskRepository = diskRepository;
    }

    @Override
    public List<Disk> findAll() {
        return diskRepository.findAll();
    }

    @Override
    public Optional<Disk> findOne(Long id) {
        return diskRepository.findById(id);
    }

    @Override
    public Disk create(Disk newDisk) {
        return diskRepository.save(newDisk);
    }

    @Override
    public Disk update(Disk updatedDisk) {
        if(exists(updatedDisk.getId())){
            diskRepository.save(updatedDisk);
            return updatedDisk;
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if(exists(id)){
            diskRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private boolean exists(Long id){
        return diskRepository.existsById(id);
    }
}
