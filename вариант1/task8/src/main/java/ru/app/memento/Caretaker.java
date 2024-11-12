package ru.app.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> history = new ArrayList<>();

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento getMemento(int index) {
        if (index >= 0 && index < history.size()) {
            return history.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid snapshot index");
    }

    public int getHistorySize() {
        return history.size();
    }
}