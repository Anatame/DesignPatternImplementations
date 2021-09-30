package com.company;

import com.company.chainOfResponsibility.*;
import com.company.mediator.ArticlesDialogBox;
import com.company.visitor.AnchorNode;
import com.company.visitor.HeadingNode;
import com.company.visitor.HtmlDocument;

public class Main {

    public static void main(String[] args) {
        // write your code here
       var document = new HtmlDocument();
       document.add(new HeadingNode());
       document.add(new AnchorNode());
       document.highlight();

    }
}
