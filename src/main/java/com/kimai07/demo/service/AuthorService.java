package com.kimai07.demo.service;

import com.kimai07.demo.entity.AuthorEntity;
import com.kimai07.demo.mapper.AuthorMapper;
import com.kimai07.demo.value.Id;
import com.kimai07.demo.value.Name;
import com.kimai07.demo.type.Author;
import com.kimai07.demo.type.RegisterAuthorResponse;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthorService {
    private final AuthorMapper authorMapper;

    public AuthorService(AuthorMapper authorMapper) {
        this.authorMapper = authorMapper;
    }

    public Author getAuthorById(Id id) {
        AuthorEntity authorEntity = authorMapper.getAuthorById(id.getValue());
        return (Objects.nonNull(authorEntity))
                ? Author.builder().id(authorEntity.getId()).name(authorEntity.getName()).build() : null;
    }

    public RegisterAuthorResponse registerAuthor(Name name) {
        boolean registered = false;
        String errorMessage = null;

        try {
            authorMapper.registerAuthor(name.getValue());
            registered = true;
        } catch (Exception ex) {
            errorMessage = ex.getMessage();
        }

        return RegisterAuthorResponse.builder().name(name.getValue()).registered(registered).errorMessage(errorMessage)
                .build();
    }
}
