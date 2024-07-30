package com.practice.factory;

import com.practice.factory.enums.ServiceProductType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceProductFactoryTest {

    @Test
    void getServiceProductInstance() {
        ServiceProduct productInstance = ServiceProductFactory.getServiceProductInstance(ServiceProductType.PRODUCT);
        Assertions.assertTrue(productInstance instanceof ProductFactory);

        ServiceProduct serviceInstance = ServiceProductFactory.getServiceProductInstance(ServiceProductType.SERVICE);
        Assertions.assertTrue(serviceInstance instanceof ServiceFactory);
    }
}