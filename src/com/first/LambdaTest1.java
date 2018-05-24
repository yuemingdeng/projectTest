package com.first;

interface ILambdaTest1{

    void print(String s);
}  

public class LambdaTest1 {
    public static void main(String[] args) {
        //��ͳ�ڲ����ʵ��  
        LambdaUse(s -> System.out.println(s), "Hello world.");
    }

    public static void LambdaUse(ILambdaTest1 lambda, String string) {
        lambda.print(string);
    }
}