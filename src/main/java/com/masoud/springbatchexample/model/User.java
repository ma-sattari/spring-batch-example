package com.masoud.springbatchexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private int id;
    private String name;
    private String dept;
    private int salary;
}
