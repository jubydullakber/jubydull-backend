package com.jubydull.inventory.demo.model.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvoicePosition {
    private String description;
    private BigDecimal amount;
}
