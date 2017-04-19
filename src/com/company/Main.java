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
            String current = raw.next();
            while(current.contains()){

            }
        }
    }
}
