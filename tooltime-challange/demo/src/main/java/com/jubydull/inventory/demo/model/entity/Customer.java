package com.jubydull.inventory.demo.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.UUID;

@Data
public class Customer {
    private UUID id;
    private String name;
    private String address;
}
