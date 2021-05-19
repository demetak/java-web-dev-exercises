package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        try {
            do {
                System.out.print("Enter the radius of a circle: ");
                r = input.nextDouble();
                if (r<0){
                    System.out.print("Radius can not be negative number! ");
                }
            }
                while (r<0);
            System.out.println("The area of the circle is "+Circle.getArea(r));
        }catch (Exception e){
            System.out.println("Please enter a valid radius");
            System.out.println(e.toString());
        }
        input.close();
    }
}
