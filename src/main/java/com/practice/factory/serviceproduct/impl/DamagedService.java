package com.practice.factory.serviceproduct.impl;

import com.practice.factory.serviceproduct.AbstractService;

public class DamagedService extends AbstractService {
    @Override
    public void addService(String serviceName) {
        this.id = 1L;
        this.name = serviceName;
    }
}
