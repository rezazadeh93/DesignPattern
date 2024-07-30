package com.practice.factory;

import com.practice.factory.enums.ProductType;
import com.practice.factory.serviceproduct.AbstractProduct;
import com.practice.factory.serviceproduct.impl.AbstractProductDamaged;
import com.practice.factory.serviceproduct.impl.AbstractProductRepair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractProductFactoryTest {

    @Test
    void getProductInstance() {
        ProductFactory factory = new ProductFactory();
        AbstractProduct abstractProductInstance1 = factory.getProductInstance(ProductType.DAMAGED);
        Assertions.assertTrue(abstractProductInstance1 instanceof AbstractProductDamaged);
        Assertions.assertEquals(abstractProductInstance1.getOutputDetail().productID, 2);

        AbstractProduct abstractProductInstance2 = factory.getProductInstance(ProductType.REPAIR);
        Assertions.assertTrue(abstractProductInstance2 instanceof AbstractProductRepair);
        Assertions.assertEquals(abstractProductInstance2.getOutputDetail().productID, 1);
    }
}