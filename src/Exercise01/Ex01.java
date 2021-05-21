/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise01;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class Ex01 {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        
        System.out.print("Enter your name : ");
        Scanner nameInput = new Scanner(System.in);
        bmi.setName(nameInput.nextLine());
        
        System.out.print("Enter your age : ");
        Scanner ageInput = new Scanner(System.in);
        bmi.setAge(ageInput.nextInt());
        
        if(bmi.isCheckerror() == false)
        {
        System.out.print("Enter your weight (pound) : ");
        Scanner weightInput = new Scanner(System.in);
        bmi.setWeight(weightInput.nextDouble());
        }
        if(bmi.isCheckerror() == false)
        {
        System.out.print("Enter your height (feet) : ");
        Scanner feetInput = new Scanner(System.in);
        bmi.setFeet(feetInput.nextDouble());
        }
        if(bmi.isCheckerror() == false)
        {
        System.out.print("Enter your height (inches) : ");
        Scanner inchesInput = new Scanner(System.in);
        bmi.setInches(inchesInput.nextDouble());
        }
        if(bmi.isCheckerror() == false)
        {
        System.out.println("BMI : "+ bmi.getBMI());
        System.out.println("Interpretation : "+ bmi.getInterpretation());
        } else System.out.println("! E R R O R !");
    }
}
