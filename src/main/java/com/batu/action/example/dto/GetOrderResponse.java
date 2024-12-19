package com.batu.action.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
public class GetOrderResponse {
    private final Long amount;
    private final Boolean orderStatus;

}
