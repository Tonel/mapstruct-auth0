package com.mapstruct.demo.mapstruct.mappers;

import com.mapstruct.demo.entities.Author;
import com.mapstruct.demo.entities.Book;
import com.mapstruct.demo.entities.User;
import com.mapstruct.demo.mapstruct.dtos.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {

    BookSlimDto bookToBookSlimDto(
            Book book
    );

    BookDto bookToBookDto(
            Book book
    );

    AuthorDto authorToAuthorDto(
            Author author
    );

    AuthorAllDto authorToAuthorAllDto(
            Author author
    );

    List<AuthorAllDto> authorsToAuthorAllDtos(
            List<Author> authors
    );

    UserGetDto userToUserGetDto(
            User user
    );

    User userPostDtoToUser(
            UserPostDto userPostDto
    );
}
