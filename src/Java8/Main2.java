package Java8;

@FunctionalInterface
interface Foo{
    int apply(int a,int b);
}

public class Main2 {
    public static void main(String[] args) {
        Foo foo = (a,b) -> a * b;
        System.out.println(foo.apply(2,3));
    }
}
