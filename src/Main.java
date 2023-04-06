public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department dep1 = new Department("Accounting");

        Employee emp1 = new Employee("Wilfred", 23, 1, dep1);

        Employee clone = (Employee) emp1.clone();

        emp1.department.setName("Engineering");

        System.out.println(emp1.getDepartment().getName());
        System.out.println(clone.getDepartment().getName());

        System.out.println("Hello world!");
    }
}