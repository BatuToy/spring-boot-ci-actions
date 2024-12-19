package com.batu.action.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
public class OrderResponse {
    private final UUID id;
    private final Boolean orderStatus;
    private final String shippingAddress;
}


