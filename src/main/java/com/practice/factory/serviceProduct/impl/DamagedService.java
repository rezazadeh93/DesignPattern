package com.practice.factory.serviceProduct.impl;

import com.practice.factory.serviceProduct.AbstractService;

public class DamagedService extends AbstractService {
    @Override
    public void addService(String serviceName) {
        this.id = 1L;
        this.name = serviceName;
    }
}
