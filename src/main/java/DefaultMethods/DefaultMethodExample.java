package DefaultMethods;

/*
*
* 1.8 default and static methods are allowed
* 1.9 private methods are allowed
*
* Default methods = Virtual extension method = defender method
*
*/

interface I{

    public void m1();
    public void m2();
    default void m3(){
        System.out.println("Default methods in interface");
    }
}

class Test1 implements I {

    public void m1(){

    }

    public void m2(){

    }

    @Override
    public void m3() {
        System.out.println("Overriding the default method in T1");
    }
}

class Test2 implements I {

    public void m1(){

    }

    public void m2(){

    }
}

public class DefaultMethodExample {

    public static void main(String[] args) {

        Test2 t2 = new Test2();
        t2.m3();

        Test1 t1 = new Test1();
        t1.m3();
    }
}
