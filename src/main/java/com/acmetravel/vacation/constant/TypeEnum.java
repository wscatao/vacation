package com.acmetravel.vacation.constant;

import lombok.Getter;

@Getter
public enum TypeEnum {
    RESORT("RESORT"),
    CRUISE("CRUISE"),
    ;

    private final String typeEnum;

    TypeEnum(String typeEnum) {
        this.typeEnum = typeEnum;
    }
}
