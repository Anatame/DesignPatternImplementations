package com.company.momento;

public class EditorState {
    public String getContent() {
        return content;
    }

    private final String content; //final so we don't accidentally change it

    public EditorState(String content){
        this.content = content;
    }
}
