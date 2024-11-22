package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int a;
        try{
            a = 3/0;
        }catch(ArithmeticException e){
            System.out.println("ups");
        }
    }
}
