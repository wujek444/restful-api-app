package com.pl.jwojcik.restfulapiapp.service;

import com.pl.jwojcik.restfulapiapp.model.Disk;

import java.util.List;
import java.util.Optional;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */
public interface DiskService {
    List<Disk> findAll();
    Optional<Disk> findOne(Long id);
    Disk create(Disk newDisk);
    Disk update(Disk updatedDisk);
    boolean delete(Long id);
}
