package Lambdas;

/*
Eg 1 : Interface A
*  This is an example of implementing an abstract method without using Lambdas and Functional interfaces
*
*  Eg 2:
*  This is an example of implementing an abstract method using Lambdas and Functional interfaces
*
*  Lambda expressions : are the anonymous functions without a name, return type of modifiers
*  Functional Interfaces : are the interface with exactly 1 abstract method (and may have any number of static and default methods)
*
*
*  Lambda Expressions:
*

* Eg 1:
 public void m1() {
        System.out.println("Hello World");
    }

    using lambdas
    () -> System.out.println("Hello World");

    If single line - braces {} are optional
    -> is used for defining lambdas

  *  Eg 2:
     public void m1(int a, int b) {
        System.out.println("The sum of a and b is : " + (a+b));
    }

    using lambdas
  ( a, b) -> System.out.println("The sum of a and b is : " + (a+b));

  Eg 3:
     public void findSquare(int a) {
        return a*a;
    }

    using lambdas
  (a) -> a*a;
  a-> a*a

  when there is a single argument () are optional
  return keyword cannot be used without {}
  if we are using {} then to return any value return keyword is mandatory

  a-> return a*a;   ==> invalid
  a-> {return a*a;}; ==> valid
  a-> {return a*a}; ==> invalid
  a->  {a*a;};  ==> invalid
  a->  a*a; ==> valid

*
* */
interface A {

    public void m1();

}

interface B {

    public void m2();

}

class Demo implements A {

    @Override
    public void m1() {
        System.out.println("Helllo - without using Lambdas");
    }
}

public class LambdaExpr {


    public static void main(String[] args) {

        Demo d = new Demo();
        d.m1();

        B b = () -> System.out.println("Hello - with Lambdas");
        b.m2();
    }
}
