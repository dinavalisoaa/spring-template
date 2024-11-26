package com.train.integration.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResponse {
    private Object data;
    public DataResponse(Object data){
        this.data=data; 
    }
}