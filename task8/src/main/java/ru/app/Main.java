package ru.app;

import ru.app.editor.TextEditor;
import ru.app.memento.Caretaker;
import ru.app.memento.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.type("Hello ");
        System.out.println(editor.toString());

        caretaker.addMemento(editor.save());
        editor.type(", World!");
        System.out.println(editor.toString());

        Memento previousState = caretaker.getMemento(caretaker.getHistorySize() - 1);
        editor.restore(previousState);

        System.out.println(editor.toString());
    }
}