package com.pl.jwojcik.restfulapiapp.repository;

import com.pl.jwojcik.restfulapiapp.model.Disk;
import com.pl.jwojcik.restfulapiapp.model.NamedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jrwoj
 * createdOn 29.10.2018
 */

@Repository
public interface DiskRepository extends JpaRepository<Disk, Long> {
}
