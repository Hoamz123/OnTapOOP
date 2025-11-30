//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface Pay{
    String NAME = "hoa";
    default void in(){
        System.out.println("hwa");
    }
}

abstract class Person{
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println("Hello world");
    }

    public void in(){
        System.out.println(name);
    }
}


class Employee extends Person{
    public Employee(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Employee emp = (Employee) obj;
        return this.name.equals(emp.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("hoa");
        Employee b = new Employee("hoa");
        if(a.equals(b)) System.out.println("Yes");
        else System.out.println("No");
    }
}