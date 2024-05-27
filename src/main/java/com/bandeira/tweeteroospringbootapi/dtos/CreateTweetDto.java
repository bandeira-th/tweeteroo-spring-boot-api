package com.bandeira.tweeteroospringbootapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public record CreateTweetDto(
        @NotBlank @NotNull @Size(min = 1, max = 60) String username,
        @NotBlank @NotNull @Size(min = 1, max = 250) String tweet) {
}
