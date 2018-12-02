package com.pl.jwojcik.restfulapiapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jrwoj
 * createdOn 02.12.2018
 */

@Entity
@Getter
@Setter
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String description;

    private Integer value;

    @ManyToMany(mappedBy = "keywords")
    private Set<Disk> disks = new HashSet<>();
}
