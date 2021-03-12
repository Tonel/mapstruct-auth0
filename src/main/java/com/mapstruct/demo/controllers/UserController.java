package com.mapstruct.demo.controllers;

import com.mapstruct.demo.mapstruct.dtos.BookDto;
import com.mapstruct.demo.mapstruct.dtos.UserGetDto;
import com.mapstruct.demo.mapstruct.dtos.UserPostDto;
import com.mapstruct.demo.mapstruct.mappers.MapStructMapper;
import com.mapstruct.demo.repositories.BookRepository;
import com.mapstruct.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private MapStructMapper mapstructMapper;

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    public ResponseEntity<Void> create(
            @Valid @RequestBody UserPostDto userPostDto
    ) {
        userRepository.save(
                mapstructMapper.userPostDtoToUser(userPostDto)
        );

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserGetDto> getById(
            @PathVariable(value = "id") int id
    ) {
        return new ResponseEntity<>(
                mapstructMapper.userToUserGetDto(
                        userRepository.findById(id).get()
                ),
                HttpStatus.OK
        );
    }
}
