package com.app.inditex_prices.adapter.out.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@IdClass(TariffID.class)
@Table(name = "TARIFF")
public class Tariff {
    @Id
    private Integer id;

    @Id
    private Integer priority;

    @Column(length = 50, nullable = false)
    private String name;
}
