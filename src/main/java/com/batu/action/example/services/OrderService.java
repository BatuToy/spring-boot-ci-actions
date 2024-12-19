package com.batu.action.example.services;

import com.batu.action.example.dto.CreateOrderRequest;
import com.batu.action.example.dto.GetOrderByIdRequest;
import com.batu.action.example.dto.GetOrderResponse;
import com.batu.action.example.dto.OrderResponse;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(@Valid CreateOrderRequest createOrderRequest);
    List<GetOrderResponse> getAllOrders();
    GetOrderResponse getOrderById(@Valid GetOrderByIdRequest getOrderByIdRequest);
}
