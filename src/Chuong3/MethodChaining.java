package Chuong3;

class Person{
    private String name;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return name + "  " + age;
    }
}

class Main1{
    public static void main(String[] args) {
        Person p = new Person();
        p = p.setName("hoa").setAge(12);
        System.out.println(p);
    }
}