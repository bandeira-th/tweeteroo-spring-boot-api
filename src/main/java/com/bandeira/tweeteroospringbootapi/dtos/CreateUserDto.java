package com.bandeira.tweeteroospringbootapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public record CreateUserDto(
        @NotBlank @NotNull @Size(min = 3, max = 30)
        String username,

        @NotBlank @NotNull @URL
        String avatar
) {

}
