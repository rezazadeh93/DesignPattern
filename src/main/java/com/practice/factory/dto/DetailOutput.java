package com.practice.factory.dto;

public class DetailOutput {
    public Long productID;
    public String productName;
    public Float price;
    public Float basePrice;

    public DetailOutput(Long productID, String productName, Float price, Float basePrice) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "DetailOutput{" +
                "serviceID=" + productID +
                ", serviceName='" + productName + '\'' +
                ", price=" + price +
                ", basePrice=" + basePrice +
                '}';
    }
}
