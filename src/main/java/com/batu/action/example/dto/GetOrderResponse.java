package com.batu.action.example.dto;

import com.batu.action.example.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class GetOrderResponse {
    private final Long amount;
    private final String orderStatus;

}
