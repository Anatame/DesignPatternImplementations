package com.company.visitor;

public class HeadingNode implements HtmlNode{

    @Override
    public void exectue(Operation operation) {
        operation.apply(this);
    }
}
