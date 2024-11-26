package com.train.integration.generic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UtilGenericResponse {

    public static ResponseEntity<?> response(Object obj, HttpStatus status) {
        return new ResponseEntity<>(new GenericResponse(obj), status);
    }

}

