package Java8;

interface Anonim{
    int call(int a,int b);
}

class Test{
    public int fork(int a,int b,Anonim anonim){
        return anonim.call(a,b) * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.fork(2,3, (a,b) -> a - b));
    }
}
