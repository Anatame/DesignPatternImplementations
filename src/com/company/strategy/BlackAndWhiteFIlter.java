package com.company.strategy;

import java.util.SortedMap;

public class BlackAndWhiteFIlter implements Filter{

    @Override
    public void apply() {
        System.out.println("Applied B&W filter");
    }
}
