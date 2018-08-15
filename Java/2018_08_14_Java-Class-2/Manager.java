public class Manager extends Employee
{
   private double bonus;

   /**
    * @param n the employee's name
    * @param s the salary
    * @param year the hire year
    * @param month the hire month
    * @param day the hire day
    */
   public Manager(String n, double s, int year, int month, int day)
   {
      super(n, s, year, month, day);
      bonus = 0;
   }

   // Method Overriding
   public double getSalary()
   {
      // super.getSalary() to call SuperClass getSalary method ....
      double baseSalary = super.getSalary();
      return baseSalary + bonus;
   }

   public void setBonus(double b)
   {
      bonus = b;
   }

   // A method only for Objects of Manager type.
   public void doShowOff(){
      System.out.println("I am Manger and only I have power to call this showOff function.");
   }

}

