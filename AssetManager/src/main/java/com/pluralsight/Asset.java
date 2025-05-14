package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asset {
    private String description;
    private LocalDateTime dateAcquired;
    private double originalCost;

    public Asset(String description, LocalDateTime dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(LocalDateTime dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
    public double getValue(){
        return originalCost;
    }
}
