/**
 * This program demonstrates inheritance.
 * @version 1.01- 15-08-2018
 * @author Abhey Rana
 */
public class ManagerTest
{
   public static void main(String[] args)
   {
      // Construct a Manager object
      Manager boss = new Manager("Abhey Rana", 80000, 1987, 12, 15);
      // Setting the bonus of manager using mutator method
      boss.setBonus(5000);

      Employee[] staff = new Employee[3];

      // Fill the staff array with Manager and Employee objects

      staff[0] = boss;
      staff[1] = new Employee("Rohan Chhabra", 50000, 1989, 10, 1);
      staff[2] = new Employee("Avishek Santhaliya", 40000, 1990, 3, 15);

      // Print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

      Manager m = (Manager) staff[0]; // Allowed
      // m = (Manager) staff[1]; Runtime Error, Class Cast Exception
      // m = (Manager) new String("Hello Worl"); Compile Time Error

      // staff[0].doShowOff(); Compile Time Error
      boss.doShowOff(); // Allowed

   }
}