package com.practice.factory.serviceproduct.impl;

import com.practice.factory.serviceproduct.AbstractService;

public class RepairService extends AbstractService {
    @Override
    public void addService(String serviceName) {
        this.id = 2L;
        this.name = serviceName;
    }
}
