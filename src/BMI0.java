import java.util.Scanner;

public class BMI0 {


    public static void main (String[] args) {

    String weight,height;


    Scanner Radar;
    Radar = new Scanner(System.in);

    System.out.println("Hello and welcome to the BMI Calculator");
        System.out.println("First can I get you height in meters leave out the Units");
        height = Radar.nextLine();
        System.out.println("First can I get you weight in KG leave out the Units");
        weight = Radar.nextLine();
        System.out.println("Your BMI is "+ (height/weight));



    }
}
