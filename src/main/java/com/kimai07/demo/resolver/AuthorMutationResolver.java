package com.kimai07.demo.resolver;

import com.kimai07.demo.value.Name;
import com.kimai07.demo.service.AuthorService;
import com.kimai07.demo.type.RegisterAuthorResponse;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthorMutationResolver implements GraphQLMutationResolver {
    private final AuthorService authorService;

    public RegisterAuthorResponse registerAuthor(String name) {
        return authorService.registerAuthor(new Name(name));
    }
}
