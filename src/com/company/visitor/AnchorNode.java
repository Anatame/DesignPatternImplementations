package com.company.visitor;

public class AnchorNode implements HtmlNode{

    @Override
    public void exectue(Operation operation) {
        operation.apply(this);
    }
}
