package random;


import java.time.*;
public class Employee extends Person
{
    private String name;
    private double salary;
    private LocalDate hireDay;

   public Employee(String name, double salary, int year, int month, int day)
   {
      super(name);
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
        
   public String getDescription()
   {
      return String.format("an employee with a salary of $%.2f", salary);
   }

}
