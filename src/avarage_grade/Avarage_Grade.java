
package avarage_grade;

import java.util.Scanner;


public class Avarage_Grade {

    public static void main(String[] args) {
        
        
            //define the variables
            int math, phy, chem, bio, art;
            Scanner inp = new Scanner(System.in);
        
            System.out.print("Enter the Math Grade: ");
            math = inp.nextInt();
            System.out.print("Enter the Physics Grade: ");
            phy = inp.nextInt();
            System.out.print("Enter the Chemistry Grade: ");
            chem = inp.nextInt();
            System.out.print("Enter the Biology Grade: ");
            bio = inp.nextInt();
            System.out.print("Enter the Art Class Grade: ");
            art = inp.nextInt();
        
            double avarage, result;
            avarage = math + phy + chem + bio + art;
            result = avarage / 5;
            System.out.println("Your Avarage:" + result);
            
           
            
        }
    
        
        
    }
    

