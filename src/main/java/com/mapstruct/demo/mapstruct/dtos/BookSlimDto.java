package com.mapstruct.demo.mapstruct.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class BookSlimDto {
    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;
}
