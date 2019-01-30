package models;

import java.util.Objects;

public class Right {

    private long id;
    private String name;

    @Override
    public String toString() {
        return "Right{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Right)) return false;
        Right right = (Right) o;
        return getId() == right.getId() &&
                Objects.equals(getName(), right.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Right(String name) {
        this.name = name;
    }

    public Right() {
    }

    public Right(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
