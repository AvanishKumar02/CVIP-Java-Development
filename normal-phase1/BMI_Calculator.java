import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Weight Unit(kg or lbs): ");

        String unit = sc.nextLine();

        System.out.println("Enter Your Weight: ");

        double weight = sc.nextDouble();

        double height = 0;

        if(unit.equals("kg")){
            System.out.println("Enter Your Height (in Meters): ");

            height = sc.nextDouble();
        }
        else if(unit.equals("lbs")){
            System.out.println("Enter your Height (in Inches): ");

            height = sc.nextDouble();
        }
    

    double bmi = 0;

    switch (unit){
        case "kg":

        bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi +"kg/m2");
        break;

        case "lbs":

        bmi = 703 * (weight/ (height*height));

        System.out.println("Your BMI is : "+bmi+"kg/m2");
        break;

        default:
        System.out.println("Please Choose Correct Weight Unit");
    }
        if(bmi < 15){
            System.out.println("You are in 'Very severely underweight' Category");

        }else if(bmi >= 15 && bmi < 16){
            System.out.println("You are in 'Severely underweight' Category");

        }else if(bmi >= 16 && bmi < 18.5){
            System.out.println("You are in 'Underweight' Category");

        }else if(bmi >= 18.5 && bmi < 25){
            System.out.println("You are in 'Normal (healthy weight)' Category");

        }else if(bmi >= 25 && bmi < 30){
            System.out.println("You are in 'Overweight' Category");

        }else if(bmi >= 30 && bmi < 35){
            System.out.println("You are in 'Moderately obese' Category");

        }else if(bmi >= 35 && bmi < 40){
            System.out.println("You are in 'Severely obese' Category");

        }else if(bmi > 40){
            System.out.println("You are in 'Very severely obese' Category");

        }

    }
} 