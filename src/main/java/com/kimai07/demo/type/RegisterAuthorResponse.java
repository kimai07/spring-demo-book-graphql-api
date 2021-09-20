package com.kimai07.demo.type;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegisterAuthorResponse {
    private String name;
    private boolean registered;
    private String errorMessage;
}
