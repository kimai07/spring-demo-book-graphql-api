package com.kimai07.demo.resolver;

import com.kimai07.demo.value.Id;
import com.kimai07.demo.service.AuthorService;
import com.kimai07.demo.type.Author;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorQueryResolver implements GraphQLQueryResolver {
    private final AuthorService authorService;

    public Author getAuthorById(int id) {
        return authorService.getAuthorById(new Id(id));
    }
}
