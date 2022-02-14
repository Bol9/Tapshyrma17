package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animals[] animals = {new Shark(), new Turtle(), new Eage()};

        Animals[] sharks ={};
        Animals[] turtles ={};
        Animals[] eages={};


        for (Animals animal:animals) {
            System.out.println(animal.getClass());
            if(animal instanceof Shark){
                sharks = new Animals[]{animal};

            }else if(animal instanceof Turtle){
                turtles = new Animals[]{animal};
            }else {
                eages = new Animals[]{animal};
            }
        }

        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eages));





    }
}
