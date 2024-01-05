package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String args[]) throws Exception{
        FileReader lib = new FileReader("src\\main\\resources\\lib.txt");
        Scanner s = new Scanner(lib);
        int i = 1;
        while (s.hasNextLine()){
            String word = s.nextLine();
            if (i == 7){
                System.out.println(word);
                break;
            }
            i++;
        }
        lib.close();
    }
}