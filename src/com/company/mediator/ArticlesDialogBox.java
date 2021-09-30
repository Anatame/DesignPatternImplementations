package com.company.mediator;

import java.util.List;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button button = new Button();

    public ArticlesDialogBox() {
        articlesListBox.attach(this::articleSelected);
        textBox.attach(this::textBoxChanged);
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
        textBox.setContent("");
        System.out.println("Textbox: " + textBox.getContent());
        System.out.println(button.isEnabled());
    }


    private void articleSelected(){
        textBox.setContent(articlesListBox.getSelection());
        button.setEnabled(true);
    }

    private void textBoxChanged(){
        var content = textBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }
}
