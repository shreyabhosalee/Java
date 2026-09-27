class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        
    }

    public int getSalary(){
        return  salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
     Employee emp1 = new Employee(); // instantiating a new emp object
     Employee emp2 = new Employee();
    
     //Setting attributes
     emp1.id = 1001;
     emp1.name = "Arya Bhosale";
     emp1.salary=34000;

     emp2.id = 1002;
     emp2.name ="Neha Joshi";
     emp2.salary=50000;

    
//Printing the attributes
         // System.out.println(emp1.id);
    // System.out.println(emp1.name);  
    emp1.printDetails();
    emp2.printDetails();
    int salary= emp1.getSalary();
    System.out.println(salary);

    }
}
