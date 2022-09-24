package ru.masloboev.springcourse.models;

import org.springframework.stereotype.Component;


@Component
public class Calculator {
    private long a;
    private long b;

    private long c;

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public void addition(long a, long b) {
        c = a + b;
    }

    public void division(long a, long b) {
        c = a / b;
    }

    public void subtraction(long a, long b) {
        c = a - b;
    }

    public void multiplication(long a, long b) {
        c = a * b;
    }
}