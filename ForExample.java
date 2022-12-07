package org.example.reflections;

import java.util.Objects;

public class ForExample extends AnotherClass implements SomeInterface {
    private int first;
    private boolean second;
    private String third;

    public ForExample(String father, int first, boolean second, String third) {
        super(father);
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public ForExample() {
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public boolean isSecond() {
        return second;
    }

    public void setSecond(boolean second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public void someMethod() {
        first = 1 + 1;
    }

    @Override
    public String toString() {
        return "ForExample{" +
                "first=" + first +
                ", second=" + second +
                ", third='" + third + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ForExample that = (ForExample) o;
        return first == that.first && second == that.second && Objects.equals(third, that.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), first, second, third);
    }
}
