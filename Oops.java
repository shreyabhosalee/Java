class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Oops {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Shreya ");
        emp1.salary;
        System.out.println(emp1.getName());
    }
}