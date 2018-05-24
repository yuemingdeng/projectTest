package com.first;

interface ILambdaTest1{

    void print(String s);
}  

public class LambdaTest1 {
    public static void main(String[] args) {
        //传统内部类的实现  
        LambdaUse(s -> System.out.println(s), "Hello world.");
    }

    public static void LambdaUse(ILambdaTest1 lambda, String string) {
        lambda.print(string);
    }
}