package Java8;

interface Anonim{
    int call(int a,int b);
    default void method(){
        System.out.println("Hello world");
    }
    void sendMessage(String item);

}

abstract class A implements Anonim{
    @Override
    public int call(int a, int b) {
        return a + b + 10;
    }

}


class B extends A{

    @Override
    public void sendMessage(String item) {

    }
}

class Test {
    private Anonim anonim;

    public void setAnonim(Anonim anonim) {
        this.anonim = anonim;
    }

    public int fork(int a, int b, Anonim anonim){
        return anonim.call(a,b) * 2;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
