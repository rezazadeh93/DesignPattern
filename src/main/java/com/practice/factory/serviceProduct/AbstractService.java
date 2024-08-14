package com.practice.factory.serviceProduct;

public abstract class AbstractService {
    protected Long id;
    protected String name;

    public abstract void addService(String serviceName);
}
