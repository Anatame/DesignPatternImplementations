package com.company.strategy;

public class HighContrast implements Filter{
    @Override
    public void apply() {
        System.out.println("Applying black and white filter");
    }
}
