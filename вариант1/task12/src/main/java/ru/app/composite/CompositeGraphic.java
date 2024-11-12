package ru.app.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements GraphicObject {
    private List<GraphicObject> children = new ArrayList<>();

    @Override
    public void draw() {
        for (GraphicObject child : children) {
            child.draw();
        }
    }

    public void add(GraphicObject graphicObject) {
        children.add(graphicObject);
    }

    public void remove(GraphicObject graphicObject) {
        children.remove(graphicObject);
    }

    public GraphicObject getChild(int index) {
        return children.get(index);
    }
}