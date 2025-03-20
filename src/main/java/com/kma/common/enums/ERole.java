package com.kma.common.enums;

import lombok.Getter;

@Getter
public enum ERole {
    ADMIN("All permissions"),
    TEACHER("Teacher"),
    USER("Normal permissions");

    private final String description;

    ERole(String description) {
        this.description = description;
    }

}

