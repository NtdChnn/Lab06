/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02;

/**
 *
 * @author notda
 */
public class Course {
    private int numOfStudent;
    int positionOfArrays;
    int[] courseID = new int[0];
    String[] courseName = new String[0];
    boolean drop;
    
    Course()
    {
        numOfStudent = 0;
        positionOfArrays= 0;
        drop = false;
    }
    
    public void addStudent(int ID, String Name)
    {
        if(numOfStudent <= courseID.length)
        {
            int[] x = new int[(courseID.length)+1];
            System.arraycopy(courseID, 0, x, 0, courseID.length);
            courseID = x;
        }
   
        if(numOfStudent <= courseName.length)
        {
            String[] x = new String[(courseName.length)+1];
            System.arraycopy(courseName, 0, x, 0, courseName.length);
            courseName = x;
        }
        
        courseID[numOfStudent] = ID;
        courseName[numOfStudent] = Name;
        numOfStudent++;
    }
    
    public void dropStudent(int ID)
    {
        for(int i = 0 ; i < courseID.length ; i++)
        {
            if(ID == courseID[i])
            {
                int k = 0;
                positionOfArrays = i;
                int[] x = new int[courseID.length-1];
                String[] y = new String[courseName.length-1];
                for(int j = 0; j < courseID.length ; j++)
                {
                    if(ID == courseID[j])
                    {
                        j++;
                    }
                    if(j< courseID.length)
                    {
                        x[k] = courseID[j];
                        y[k] = courseName[j];
                        k++;
                    }

                }
                courseID = x;
                courseName = y;
                drop = true;
            }
        }
        
        if(drop == true)
        {
            System.out.println("Drop complete");
        } else System.out.println("Drop Incomplete");
    }
    
    public void showStudent()
    {
        System.out.println("Now Showing Student in course");
        if(courseID.length == 0)
        {
            System.out.println("No Student in course");
        } else
        {
        for(int i = 0 ; i < courseID.length ; i++)
        {
        System.out.println(i+1 + ". ID : " + courseID[i]+ " Name : " + courseName[i]);
        }
        }
    }
    
    public void clear()
    {
        courseID = new int[0];
        courseName = new String[0];
        numOfStudent = 0;
        positionOfArrays= 0;
    }
}
