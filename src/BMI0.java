import java.util.Scanner;

public class BMI0 {


    public static void main (String[] args) {

    
    float Total,Problem,Problem2,weight,height;


    Scanner Radar;
    Radar = new Scanner(System.in);

    System.out.println("Hello and welcome to the BMI Calculator");
        System.out.println("First can I get you height in inches ");
        height = Radar.nextInt();
        System.out.println("First can I get you weight in Pounds ");
        weight = Radar.nextInt();
        Problem = weight/ height;
        System.out.println(Problem);
        Problem2 = Problem/height;
        System.out.println(Problem2);
        Total = Problem2*703;
        System.out.println("Your BMI is "+Total);




    }
}
