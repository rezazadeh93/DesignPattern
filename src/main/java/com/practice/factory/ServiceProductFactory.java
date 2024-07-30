package com.practice.factory;

import com.practice.factory.enums.ServiceProductType;

import java.util.Objects;

public abstract class ServiceProductFactory {
    public static ServiceProduct getServiceProductInstance(ServiceProductType type) {
        Objects.requireNonNull(type);
        return switch (type) {
            case PRODUCT -> new ProductFactory();
            case SERVICE -> new ServiceFactory();
        };
    }
}
