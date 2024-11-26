package com.train.integration.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResponse {
    private Object data;
    public GenericResponse(Object data){
        this.data=data; 
    }
}