package com.practice.factory.serviceproduct.impl;

import com.practice.factory.dto.DetailOutput;
import com.practice.factory.serviceproduct.AbstractProduct;

public class AbstractProductRepair extends AbstractProduct {
    @Override
    public DetailOutput getOutputDetail() {
        return new DetailOutput(1L, "service1", this.price,  this.basePrice);
    }
}
