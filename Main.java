import java.lang.Math.*;

public class Main{

    public static void main(String[] args){
        System.out.println(area(2));

    }

    public static double area(double radius){
        double ar = radius*radius*Math.PI ;
        if (radius<0){
            return "Invalid value";
        } else {
            return ar;
            System.out.println("Area = " + area);
        }
    }
