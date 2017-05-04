package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner raw = new Scanner(new File("rawDataU6.txt"));
        ArrayList<Person> lty = new ArrayList<>();
        raw.nextLine();
        while(raw.hasNext()){
            Person now = new Person(raw.nextDouble());
            int sc = 0;
            String current;
            String previous = "";
            double cur;
            int x = 0;
            while(sc < 1){
                current = raw.next();
                try {
                    System.out.println(x++);
                    cur = Double.parseDouble(current);
                    if(previous.contains("\"")){
                        now.score1 += cur;
                    }
                    else {
                        now.score1 -= cur/4;
                        sc++;
                    }
                } catch(Exception e){
                }
                previous = current;
            }
            while(sc < 2){
                current = raw.next();
                try {
                    cur = Double.parseDouble(current);
                    if(previous.contains("\"")){
                        now.score2 += cur;
                    }
                    else {
                        now.score2 -= cur/4;
                        sc++;
                    }
                } catch(Exception e){
                }
                previous = current;
            }
            System.out.println(now.score1);
            System.out.println(now.score2);
        }
    }
}
