package com.batu.action.example.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
public class CreateOrderRequest {
    @NotNull
    //@Min(value = 10)
    private final String orderName;
    @NotNull
    @Min(value = 1)
    //@Max(value = 100)
    private final Long orderAmount;
    @NotNull
    //@Min(value = 20)
    private final String shippingAddress;
}
