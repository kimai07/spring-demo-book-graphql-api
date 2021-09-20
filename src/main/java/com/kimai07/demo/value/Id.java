package com.kimai07.demo.value;

import lombok.Value;

@Value
public class Id {
    private int value;

    public String toString() {
        return String.valueOf(value);
    }
}
