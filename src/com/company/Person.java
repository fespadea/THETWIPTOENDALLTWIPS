package com.company;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by fs279 on 4/19/17.
 */
public class Person implements Comparable{
    public Person(double p){
        person = p;
    }
    public double person;
    public String name;
    public double score1 = 0;
    public double score2 = 0;
    public int compareTo(Object o){
        Person p = (Person)o;
        if(name.compareTo(p.name) < 0){
            return -1;
        }
        else if(name.compareTo(p.name) > 0){
            return 1;
        }
        else {
            return 0;
        }
    }
}
