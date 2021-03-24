package com.mapstruct.demo.controllers;

import com.mapstruct.demo.mapstruct.dtos.AuthorAllDto;
import com.mapstruct.demo.mapstruct.mappers.MapStructMapper;
import com.mapstruct.demo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private MapStructMapper mapstructMapper;

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorController(
            MapStructMapper mapstructMapper,
            AuthorRepository authorRepository
    ) {
        this.mapstructMapper = mapstructMapper;
        this.authorRepository = authorRepository;
    }

    @GetMapping()
    public ResponseEntity<List<AuthorAllDto>> getAll() {
        return new ResponseEntity<>(
                mapstructMapper.authorsToAuthorAllDtos(
                        authorRepository.findAll()
                ),
                HttpStatus.OK
        );
    }

}
