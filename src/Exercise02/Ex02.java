/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02;

import java.util.Scanner;

/**
 *
 * @author notda
 */
public class Ex02 {
    public static void main(String[] args) {
        Course OOP = new Course();
        
        System.out.println("Add Student");
        for(int i = 0; i < 3 ; i++)
        {
        System.out.print("Enter ID : ");
        Scanner IDinput = new Scanner(System.in);
        int ID = IDinput.nextInt();
        System.out.print("Enter Name : ");
        Scanner NameInput = new Scanner(System.in);
        OOP.addStudent(ID, NameInput.nextLine());
        }
        
        System.out.println("Drop Student");
        {
        System.out.print("Enter ID : ");
        Scanner dropIDInput = new Scanner(System.in);
        OOP.dropStudent(dropIDInput.nextInt());
        }
        
        OOP.showStudent();
    }
}
