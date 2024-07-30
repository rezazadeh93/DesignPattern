package com.practice.factory.serviceproduct;

import com.practice.factory.dto.DetailOutput;

public abstract class AbstractProduct {
    protected float price = 0f;
    protected float basePrice = 0f;

    public abstract DetailOutput getOutputDetail();
}
