package com.practice.factory;

import com.practice.factory.enums.ProductType;
import com.practice.factory.serviceProduct.AbstractProduct;
import com.practice.factory.serviceProduct.impl.AbstractProductDamaged;
import com.practice.factory.serviceProduct.impl.AbstractProductRepair;

import java.util.Objects;

public class ProductFactory implements ServiceProduct {
    public AbstractProduct getProductInstance(ProductType type) {
        Objects.requireNonNull(type);
        return switch (type) {
            case REPAIR -> new AbstractProductRepair();
            case DAMAGED -> new AbstractProductDamaged();
        };
    }
}
