package com.practice.factory.serviceProduct.impl;

import com.practice.factory.serviceProduct.AbstractService;

public class RepairService extends AbstractService {
    @Override
    public void addService(String serviceName) {
        this.id = 2L;
        this.name = serviceName;
    }
}
