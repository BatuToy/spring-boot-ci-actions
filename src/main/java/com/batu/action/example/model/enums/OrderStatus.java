package com.batu.action.example.model.enums;

public enum OrderStatus {
    PACKAGING(1L, "PACKAGING"),
    SHIPPING(2L, "SHIPPING"),
    DELIVERED(3L, "DELIVERED")
    ;
    private final long id;
    private final String status;

    OrderStatus(long id, String status){
        this.id = id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
