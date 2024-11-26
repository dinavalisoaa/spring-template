package com.train.integration.model;

import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Getter
@Table(name="gender")
public class Gender {
   
    @Id
    private  Long id;
    private  String name;
    public Gender(){}
    public Gender(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }
}

