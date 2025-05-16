package com.pluralsight.model;

import java.time.LocalDateTime;

public class Cash extends Asset {
    public Cash(String description, LocalDateTime dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}
