package com.company.command.editor;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private History history;
    private HtmlDocument document;

    public BoldCommand(History history, HtmlDocument document) {
        this.history = history;
        this.document = document;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
