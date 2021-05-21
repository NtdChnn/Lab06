/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise01;

/**
 *
 * @author notda
 */
public class BMI {
    String name;
    int age;
    double weight, feet, inches , BMI;
    boolean checkerror;
    
    BMI()
    {
        name = "";
        age = 0;
        weight = 0;
        feet = 0;
        inches = 0;
        BMI = 0;
        checkerror = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age <= 0)
        { checkerror = true ;}
        else this.age = age;
    }

    public void setWeight(double weight) {
        if(weight <= 0)
        { checkerror = true ;}
        else this.weight = weight;
    }

    public void setFeet(double feet) {
        if(feet <= 0)
        { checkerror = true ;}
        else this.feet = feet;
    }

    public void setInches(double inches) {
        if(inches <= 0)
        { checkerror = true ;}
        else this.inches = inches;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }
    
    public double getBMI() {
        BMI = (weight*0.45359237)/Math.pow((feet*12+inches)*0.0254,2) ;
        return BMI ;
    }
    
    public String getInterpretation() {
        if(BMI < 18.5)
        { return "Underweight" ;}
        else if (BMI < 25)
        { return "Normal" ;}
        else if (BMI < 30)
        { return "Overweight" ;}
        else return "Obese";
    }

    public boolean isCheckerror() {
        return checkerror;
    }
}