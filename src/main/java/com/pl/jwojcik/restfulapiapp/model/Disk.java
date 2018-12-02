package com.pl.jwojcik.restfulapiapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author jrwoj
 * createdOn 02.12.2018
 */

@Entity
@Getter
@Setter
public class Disk {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "lDiskKeyword")
    private List<Keyword> keywords;


    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "lDiskTrait")
    private List<Trait> traits;

    private String abilities;

    @Enumerated(EnumType.STRING)
    private DiskSize size;

    private Integer movement;

    private Integer attackStenght;

    private Integer counterStrenght;

    private Integer toughness;

    private Integer stamina;

    private Integer cost;

    private Integer recruitmentPoints;

    private Boolean isUnique;

    private Boolean isElite;

    @Enumerated(EnumType.STRING)
    private Race race;

    @Enumerated(EnumType.STRING)
    private Allegiance allegiance;

    @Enumerated(EnumType.STRING)
    private DiskSet set;
}
