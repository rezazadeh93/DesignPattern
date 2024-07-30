package com.practice.factory.serviceproduct;

public abstract class AbstractService {
    protected Long id;
    protected String name;

    public abstract void addService(String serviceName);
}
