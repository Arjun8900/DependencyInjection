package org.example;

import com.google.inject.AbstractModule;
import data.Discountable;
import data.EarlyBirdDiscount;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Discountable.class).to(EarlyBirdDiscount.class);
    }
}
