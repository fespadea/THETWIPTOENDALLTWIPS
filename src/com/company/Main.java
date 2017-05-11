package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Person> lty = new ArrayList<>();
        BufferedReader lines = new BufferedReader(new FileReader("rawDataU6.txt"));
        ArrayList<Scanner> listOfLines = new ArrayList<>();
        for (int i = 0; i < 55; i++) {
            String s = lines.readLine();
            Scanner nower = new Scanner(s);
            listOfLines.add(nower);
            System.out.println(s);
        }
        listOfLines.remove(0);
        listOfLines.remove(6);
        listOfLines.remove(26);
        listOfLines.remove(26);
        int index = -1;
        for (int i = 0; i < 51; i++) {
            int c = 0;
            double pi = -1;
            while(c < 1){
                try{
                    pi = listOfLines.get(i).nextDouble();
                    c++;
                }catch (Exception e){
                    System.out.println(listOfLines.get(i).next());
                }
            }
            System.out.println("pi: " + pi);
            try{
            if(pi != lty.get(index).person) {
                Person now = new Person(pi);
                System.out.println("pi: " + pi);
                lty.add(now);
                index++;
            }} catch (Exception e){
                Person now = new Person(pi);
                lty.add(now);
                index++;
            }
            int sc = 0;
            String current = "";
            String previous = "";
            double cur = 0;
            int x = 0;
            while(sc < 1){
                try {
                    current = listOfLines.get(i).next();
                    System.out.println("current2: " + current);
                } catch(Exception e){
                    sc++;
                }
                try {
                    cur = Double.parseDouble(current);
                    System.out.println("count: " + x++);
                    if(previous.contains("+")){
                        lty.get(index).score1 += cur;
                        System.out.println("score: " + lty.get(index).score1);
                    }
                    else {
                        lty.get(index).score1 -= cur/4;
                        sc++;System.out.println("score: " + lty.get(index).score1);
                    }
                } catch(Exception e){
                }
                previous = current;
                System.out.println("previous: " + previous);
            }
            sc = 0;
            while(sc < 1){
                try {
                    current = listOfLines.get(i).next();
                    System.out.println("current2: " + current);
                } catch(Exception e){
                    sc++;
                }
                try {
                    cur = Double.parseDouble(current);
                    System.out.println("count2: " + x++);
                    if(previous.contains("+")){
                        lty.get(index).score2 += cur;
                        System.out.println("score2: " + lty.get(index).score2);
                    }
                    else {
                        lty.get(index).score2 -= cur/4;
                        sc++;System.out.println("score2: " + lty.get(index).score2);
                    }
                } catch(Exception e){
                }
                previous = current;
                System.out.println("previous2: " + previous);
            }
            System.out.println(lty.get(index).score1);
            System.out.println(lty.get(index).score2);
        }
    }
}
