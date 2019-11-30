package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String str = input();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flag = true;
                while (flag)
                {
                    try {
                        String str = input();
                        if (str.equalsIgnoreCase("exit")) {
                            System.out.println(Thread.currentThread().getName());
                            flag = false;
                        }
                    }catch (IOException e){
                        e.printStackTrace();

                    }
                }
            }
        });
    thread.start();
    System.out.println(Thread.currentThread().getName());
    }
    private static String input() throws IOException{
        System.out.println("Enter Text:");
        String str = Console.getInstance().readLine();
        return str;



    }
}
