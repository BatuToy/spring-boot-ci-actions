package com.batu.action.example.mapper;

import com.batu.action.example.dto.CreateOrderRequest;
import com.batu.action.example.dto.GetOrderResponse;
import com.batu.action.example.dto.OrderResponse;
import com.batu.action.example.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDataMapper {

    public Order createOrderRequestToOrder(CreateOrderRequest createOrderRequest){
        return Order.builder()
                .orderAmount(createOrderRequest.getOrderAmount())
                .orderName(createOrderRequest.getOrderName())
                .shippingAddress(createOrderRequest.getShippingAddress())
                .build();

    }

    public OrderResponse orderToOrderResponse(Order order){
        return OrderResponse.builder()
                .id(order.getId())
                .orderStatus(order.getOrderStatus())
                .shippingAddress(order.getShippingAddress())
                .build();
    }

    public GetOrderResponse orderToGetOrderResponse(Order order){
        return GetOrderResponse.builder()
                .orderStatus(order.getOrderStatus())
                .amount(order.getOrderAmount())
                .build();
    }
}
