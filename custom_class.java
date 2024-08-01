
class Employee
{
    int id;
    int salary = 999;
    String name;
    public void printdtails()
    {
        System.out.println("my id is"+id);
        System.out.println("My name is "+name);
    }
    public int getsalary()
    {
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom_class");
        Employee shamim = new Employee();
        shamim.id = 123;
        shamim.name = "shamim khan";
        shamim.salary = 890;
        // System.out.println(shamim.id);
        // System.out.println(shamim.name);
        shamim.printdtails();

        Employee john = new Employee();
        john.id=456;
        john.name = "john shing";

        john.printdtails();

        int salary = shamim.getsalary();
        System.out.println(salary);
    }

    
}
