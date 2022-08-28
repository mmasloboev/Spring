package ru.masloboev.springcourse.models;

import org.springframework.stereotype.Component;


@Component
public class Calculator {
    private long a;
    private long b;

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

    public long addition(long a, long b) {
        return a + b;
    }

    public long division(long a, long b) {
        return a / b;
    }

    public long subtraction(long a, long b) {
        return a - b;
    }

    public long multiplication(long a, long b) {
        return a * b;
    }
}