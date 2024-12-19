package com.batu.action.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name =  "orders")
public class Order {
    @Id
    private UUID id;
    @Column(name = "ORDER_NAME")
    private String orderName;
    @Column(name = "ORDER_STATUS")
    private Boolean orderStatus;
    @Column(name = "ORDER_AMOUNT")
    private Long orderAmount;
    @Column(name = "SHIPPING_ADDRESS")
    private String shippingAddress;
    @CreatedDate
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
}
