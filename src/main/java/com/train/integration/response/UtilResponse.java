package com.train.integration.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.Getter;
import lombok.Setter;

public class UtilResponse {

    public static ResponseEntity<?> response(Object obj, HttpStatus status) {
        return new ResponseEntity<>(new DataResponse(obj), status);
    }

}

