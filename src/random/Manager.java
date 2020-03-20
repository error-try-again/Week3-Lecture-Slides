/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author root
 */
public class Manager extends Employee {
    
    
    private double bonus;

   /**
    * @param name the employee's name
    * @param salary the salary
    * @param year the hire year
    * @param month the hire month
    * @param day the hire day
    */
    
    
   public Manager(String name, double salary, int year,
			 int month, int day)
   {
      super(name, salary, year, month, day);
      bonus = 0;
   }
   

    public double getSalary()
       {
          double baseSalary = super.getSalary();
          return baseSalary + bonus;
       }

       public void setBonus(double b)
       {
          bonus = b;
       }
    }

         

