package com.example.Social.Media.Platform.mementos;

public class PostEditor {
    private String content;
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public DraftMemento save() {
        return new DraftMemento(content);
    }
    public void restore(DraftMemento memento) {
        this.content = memento.getContent();
    }
}
