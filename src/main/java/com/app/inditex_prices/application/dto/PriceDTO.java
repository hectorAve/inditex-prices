package com.app.inditex_prices.application.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PriceDTO {
    @NotNull
    Date searchDate;

    @NotNull
    @Positive
    @Max(9999999)
    Long prodcutId;

    @NotNull
    @Positive
    @Max(99999)
    Long brandId;
}
