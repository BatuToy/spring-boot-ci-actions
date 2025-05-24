package com.batu.action.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
public class GetOrderByIdRequest {
    @NotNull
    private UUID orderId;
}
