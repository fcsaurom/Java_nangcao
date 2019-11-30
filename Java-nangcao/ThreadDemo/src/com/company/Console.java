package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    private final BufferedReader in;
    private static class Singleton{
        static final Console INSTACE = new Console();
    }
    public static Console getInstance() {return  Singleton.INSTACE;}
    private Console() {in = new BufferedReader(new InputStreamReader(System.in));}
    public String readLine() throws IOException{
        return in.readLine();
    }
}
