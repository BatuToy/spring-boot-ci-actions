package com.batu.action.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class OrderResponse {
    private final UUID id;
    private final String orderStatus;
    private final String shippingAddress;
}


