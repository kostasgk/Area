import java.lang.Math.*;

public class Main {
    public static void main(String[] args){
        System.out.println(area(2));

    }

    public static double area(double radius){
        double Area ;
        if (radius<0){
            return "Invalid Value";
        } else {
            area = radius*radius*Math.PI;
            System.out.println("Area = " + Area);
        }
    }
}
