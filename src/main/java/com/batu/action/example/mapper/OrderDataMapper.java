package com.batu.action.example.mapper;

import com.batu.action.example.dto.CreateOrderRequest;
import com.batu.action.example.dto.GetOrderResponse;
import com.batu.action.example.dto.OrderResponse;
import com.batu.action.example.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDataMapper {

    public Order createOrderRequestToOrder(CreateOrderRequest createOrderRequest) {
        return Order.builder()
                .orderAmount(createOrderRequest.getOrderAmount())
                .orderName(createOrderRequest.getOrderName())
                .shippingAddress(createOrderRequest.getShippingAddress())
                .build();

    }

    public OrderResponse orderToOrderResponse(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getOrderStatus().getStatus(),
                order.getShippingAddress()
        );
    }

    public GetOrderResponse orderToGetOrderResponse(Order order) {
       return new GetOrderResponse(
               order.getOrderAmount(),
               order.getOrderStatus().getStatus()
       );
    }
}
