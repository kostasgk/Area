import java.lang.Math.*;

public class AreaCalculator{

    public static void main(String[] args){
        System.out.println(ar(2));

    }

    public static double ar(double radius){
        double ar = radius*radius*Math.PI ;
        if (radius<0){
            return -1;
        } else {
            return ar;
            System.out.println("Area = " + ar);
        }
        
    }  
}
