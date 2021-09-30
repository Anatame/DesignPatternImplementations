package com.company.state;

public class BruhTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Bruh icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
