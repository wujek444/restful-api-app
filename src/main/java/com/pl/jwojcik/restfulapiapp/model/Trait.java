package com.pl.jwojcik.restfulapiapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jrwoj
 * createdOn 02.12.2018
 */

@Entity
@Getter
@Setter
public class Trait {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "traits")
    private Set<Disk> disks = new HashSet<>();
}
