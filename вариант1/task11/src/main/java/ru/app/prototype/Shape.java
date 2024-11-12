package ru.app.prototype;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return Objects.equals(id, shape.id) &&
                Objects.equals(type, shape.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}