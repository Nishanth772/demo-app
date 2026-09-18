package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, CI/CD Pipeline!");
        System.out.println("Result: " + add(5, 7));
	System.out.println("Automatic build triggered succeessfully");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}