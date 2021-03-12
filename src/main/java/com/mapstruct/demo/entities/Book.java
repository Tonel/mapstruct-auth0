package com.mapstruct.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Basic
    @Column(name = "title", nullable = false, length = 250)
    private String title;

    @Basic
    @Column(name = "release_date", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @ManyToMany(
            fetch = FetchType.LAZY,
            mappedBy = "books"
    )
    private Set<Author> authors = new HashSet<>();

    @ManyToMany(
            fetch = FetchType.LAZY,
            mappedBy = "books"
    )
    private Set<User> users = new HashSet<>();
}
