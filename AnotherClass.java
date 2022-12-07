package org.example.reflections;

import java.util.Objects;

public class AnotherClass {
    private String father;

    public AnotherClass(String father) {
        this.father = father;
    }

    public AnotherClass() {
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "AnotherClass{" +
                "father='" + father + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnotherClass that = (AnotherClass) o;
        return Objects.equals(father, that.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father);
    }
}
