package com.batu.action.example.controller;

import com.batu.action.example.dto.*;
import com.batu.action.example.services.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrdersController {

    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<AppResponse<OrderResponse>> createOrder(@RequestBody CreateOrderRequest req) {
        log.info("Creating order!");
        OrderResponse response = orderService.createOrder(req);
        return ResponseEntity.ok(new AppResponse<>(
                response,
                HttpStatus.OK,
                "Order created successfully with order id= " +response.getId().toString()
                ));
    }

    @GetMapping
    public ResponseEntity<AppResponse<List<GetOrderResponse>>> getAllOrders(){
        log.info("All orders are pulling from the persist store!");
        return ResponseEntity.ok( new AppResponse<>(
                orderService.getAllOrders(),
                HttpStatus.ACCEPTED,
                "Orders are pulled from persist store successfully!"
        ));
    }

    @PostMapping("/getOrderByOrderId")
    public ResponseEntity<AppResponse<GetOrderResponse>> getOrderByOrderId(@RequestBody GetOrderByIdRequest req){
        log.info("Order with orderId= {} started to pull the order from the persist store!", req.getOrderId().toString());
        GetOrderResponse response = orderService.getOrderById(req);
        return ResponseEntity.ok(new AppResponse<>(
                response,
                HttpStatus.OK,
                "Order did pull from persist store with order id= " + req.getOrderId().toString()
        ));
    }


}
