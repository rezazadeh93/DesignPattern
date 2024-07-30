package com.practice.factory;

import com.practice.factory.enums.ProductType;
import com.practice.factory.serviceproduct.AbstractService;
import com.practice.factory.serviceproduct.impl.DamagedService;
import com.practice.factory.serviceproduct.impl.RepairService;

import java.util.Objects;

public class ServiceFactory implements ServiceProduct {
    public AbstractService getServiceInstance(ProductType type) {
        Objects.requireNonNull(type);
        return switch (type) {
            case DAMAGED -> new DamagedService();
            case REPAIR -> new RepairService();
        };
    }
}
