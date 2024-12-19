package com.batu.action.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderByIdRequest {
    // Todo:  Why i have to make this request class like record class?
    @NotNull
    private UUID orderId;
}
