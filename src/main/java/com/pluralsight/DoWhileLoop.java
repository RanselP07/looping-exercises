package com.pluralsight;

public class DoWhileLoop {

    static void main(String[] args) throws InterruptedException {
        int i = 1;

        do{
            System.out.println(i + ". I love Java!");
            Thread.sleep(1000);
            i++;
        }while (i <= 5);
    }

}
