package DefaultMethods;

/*
*
*  default methods cannot be defined for the object class methods
*  Eg : hashcode()
* */

interface I1{

    default void m1(){
        System.out.println("Default m1 method in I1");
    }
}

interface I2{

    default void m1(){
        System.out.println("Default m1 method in I2");
    }
}


public class MultipleInterfaces implements I1, I2{

    public void m1(){
        // call the m1 from I1

        I1.super.m1();
    }


    public static void main(String[] args) {
        MultipleInterfaces m = new MultipleInterfaces();
        m.m1();
    }

}
