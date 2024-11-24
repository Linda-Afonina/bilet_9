package org.example;

import org.example.exceptions.MyException;

public class Main {
    public static void main(String[] args) {
        getValue(85);
        getValue(-85);
    }

    public static void getValue(int value) {
        try {
            if (value > 0) {
                System.out.println("Value is " + value);
            } else
                throw new MyException("Value cannot be < 0");
        } catch (MyException e) {
            System.out.println("My Exception: " + e.getMessage());
        }
    }
}