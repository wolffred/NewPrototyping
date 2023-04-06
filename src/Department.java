public class Department implements Cloneable{
    String name;

    public Department(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
