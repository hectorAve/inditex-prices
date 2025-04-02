package com.app.inditex_prices.adapter.out.db.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
@Data
public class TariffID implements Serializable {
    private Integer id;
    private Integer priority;
}
