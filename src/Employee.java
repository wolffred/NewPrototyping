public class Employee extends Person implements Cloneable{

    int id;
    Department department;



    public Employee(String name, int age, int id, Department department) {
        super(name, age);
        this.id = id;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee clone = (Employee) super.clone();
        clone.setDepartment((Department)  clone.getDepartment().clone());
        return clone;
    }
}
