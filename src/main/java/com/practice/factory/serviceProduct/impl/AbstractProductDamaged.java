package com.practice.factory.serviceProduct.impl;

import com.practice.factory.dto.DetailOutput;
import com.practice.factory.serviceProduct.AbstractProduct;

public class AbstractProductDamaged extends AbstractProduct {
    @Override
    public DetailOutput getOutputDetail() {
        return new DetailOutput(2L, "service2", this.price, this.basePrice);
    }
}
