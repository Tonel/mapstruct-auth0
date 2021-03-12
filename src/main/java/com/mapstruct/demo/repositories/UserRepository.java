package com.mapstruct.demo.repositories;

import com.mapstruct.demo.entities.Book;
import com.mapstruct.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {}
