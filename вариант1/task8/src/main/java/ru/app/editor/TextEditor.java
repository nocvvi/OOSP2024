package ru.app.editor;

import ru.app.memento.Memento;

public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void type(String words) {
        this.text += words;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "text='" + text + '\'' +
                '}';
    }
}