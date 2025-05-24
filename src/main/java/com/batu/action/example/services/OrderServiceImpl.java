package com.batu.action.example.services;

import com.batu.action.example.dto.CreateOrderRequest;
import com.batu.action.example.dto.GetOrderByIdRequest;
import com.batu.action.example.dto.GetOrderResponse;
import com.batu.action.example.exception.OrderNotFoundException;
import com.batu.action.example.mapper.OrderDataMapper;
import com.batu.action.example.model.enums.OrderStatus;
import com.batu.action.example.repository.OrderRepository;
import com.batu.action.example.dto.OrderResponse;
import com.batu.action.example.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Validated
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderDataMapper orderDataMapper;

    @Override
    public OrderResponse createOrder(CreateOrderRequest createOrderRequest) {
        Order order = orderDataMapper.createOrderRequestToOrder(createOrderRequest);
        order.setId(UUID.randomUUID());
        order.setOrderStatus(OrderStatus.PACKAGING);
        log.info("Order status= {}",order.getOrderStatus());
        orderRepository.save(order);
        return orderDataMapper.orderToOrderResponse(order);
    }
    @Override
    public List<GetOrderResponse> getAllOrders(){
        return orderRepository.findAll().stream()
                .map(orderDataMapper::orderToGetOrderResponse)
                .sorted().toList();
    }

    @Override
    public GetOrderResponse getOrderById(GetOrderByIdRequest getOrderByIdRequest) {
        return orderRepository.findById(getOrderByIdRequest.getOrderId())
                .map(orderDataMapper::orderToGetOrderResponse)
                .orElseThrow(
                        () -> new OrderNotFoundException
                                ("Order not found with order id= " + getOrderByIdRequest.getOrderId().toString())
                );
    }

}
