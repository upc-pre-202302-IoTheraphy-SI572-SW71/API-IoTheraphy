package com.digitalholics.iotheraphy.Security.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),

    USER_READ("user:read"),

    PATIENT_READ("patient:read"),
    PATIENT_UPDATE("patient:update"),
    PATIENT_CREATE("patient:create"),
    PATIENT_DELETE("patient:delete"),

    PHYSIOTHERAPIST_READ("physiotherapist:read"),
    PHYSIOTHERAPIST_UPDATE("physiotherapist:update"),
    PHYSIOTHERAPIST_CREATE("physiotherapist:create"),
    PHYSIOTHERAPIST_DELETE("physiotherapist:delete")

    ;

    private final String permission;

}
