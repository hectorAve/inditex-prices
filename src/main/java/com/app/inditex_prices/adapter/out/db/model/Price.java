package com.app.inditex_prices.adapter.out.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "PRICES")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @ManyToOne
    @JoinColumn(name="BRAND_ID", referencedColumnName="id")
    Brand brand;

    @Column(name = "START_DATE")
    @DateTimeFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    Date startDate;

    @Column(name = "END_DATE")
    @DateTimeFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    Date endDate;

    @ManyToOne
    @JoinColumn(name="PRICE_LIST", referencedColumnName="id")
    @JoinColumn(name="PRIORITY", referencedColumnName="priority")
    Tariff tariff;

    @ManyToOne
    @JoinColumn(name="PRODUCT_ID", referencedColumnName="id")
    Product product;

    @Column(name = "PRICE")
    BigDecimal cost;

    @Column(name = "CURR")
    @Enumerated(EnumType.STRING)
    Currency currency;
}
