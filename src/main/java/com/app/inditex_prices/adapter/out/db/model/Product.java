package com.app.inditex_prices.adapter.out.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(name = "ID")
    Long id;

    @NotBlank(message = "The product name cannot be empty")
    @NotNull(message = "The product name is required")
    @Column(length = 30, name = "NAME")
    String name;
}
