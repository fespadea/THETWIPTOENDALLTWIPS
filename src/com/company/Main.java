package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner raw = new Scanner(new File("rawDataU6.txt"));
        ArrayList<Person> lty = new ArrayList<>();
        for (int i = 0; i < 91; i++) {
            raw.next();
        }
        int index = -1;
        while(raw.hasNext()){
            int c = 0;
            double pi = -1;
            while(c < 1){
                try{
                    pi = raw.nextDouble();
                    c++;
                }catch (Exception e){
                    System.out.println(raw.next());
                }
            }
            System.out.println("pi: " + pi);
            try{
            if(pi != lty.get(index).person) {
                Person now = new Person(pi);
                lty.add(now);
                index++;
            }} catch (Exception e){
                Person now = new Person(pi);
                lty.add(now);
                index++;
            }
            int sc = 0;
            String current;
            String previous = "";
            double cur;
            int x = 0;
            while(sc < 1){
                current = raw.next();
                System.out.println("current: " + current);
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
            while(sc < 2){
                current = raw.next();
                System.out.println("current2: " + current);
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
