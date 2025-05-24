package com.batu.action.example.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class CreateOrderRequest {
    @NotNull
    @NotEmpty
    private final String orderName;

    @NotNull
    @NotEmpty
    private final String shippingAddress;

    @NotNull
    @NotEmpty
    @Size.List({
            @Size(min=1, message = "Order quantity must be greater then 0!"),
            @Size(max=100, message = "Order quantity must be lesser then 0100!")
    })
    private final Long orderAmount;

}
