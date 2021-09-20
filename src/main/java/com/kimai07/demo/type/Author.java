package com.kimai07.demo.type;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Author {
    private int id;
    private String name;
}
