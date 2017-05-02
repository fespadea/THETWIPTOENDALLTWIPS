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
            Person now = new Person(raw.nextInt());
            raw.next();
            String current = raw.next();
            while (!current.contains("\"")) {
                current = raw.next();
                try{
                    now.score1 += Double.parseDouble(current);
                } catch(Exception e){
                }
            }
            now.score1 -= raw.nextInt()/4.0;
            while (!current.contains("\"")) {
                current = raw.next();
            }
            while (!current.contains("\"")) {
                current = raw.next();
            }
        }
    }
}
