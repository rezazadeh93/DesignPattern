package com.practice.factory.serviceproduct.impl;

import com.practice.factory.dto.DetailOutput;
import com.practice.factory.serviceproduct.AbstractProduct;

public class AbstractProductDamaged extends AbstractProduct {
    @Override
    public DetailOutput getOutputDetail() {
        return new DetailOutput(2L, "service2", this.price, this.basePrice);
    }
}
