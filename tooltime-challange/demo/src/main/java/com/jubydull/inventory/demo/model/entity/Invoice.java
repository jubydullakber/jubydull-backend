package com.jubydull.inventory.demo.model.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Invoice {
    private UUID id;
    private String code;
    private String title;
    private String description;
    private LocalDateTime issuedAt;
    private Customer customer;
    private InvoicePosition[] positions;
    private BigDecimal totalAmount;
}
