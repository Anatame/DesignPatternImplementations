package com.company.state;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw dash Rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }
}
