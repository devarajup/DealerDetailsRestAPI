package com.cjss.DealerDetails.model;

public class Car {
            private String modelName;
            private Integer Quantity;
            private Integer price;

    public Car(String modelName, Integer quantity, Integer price) {
        this.modelName = modelName;
        Quantity = quantity;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
