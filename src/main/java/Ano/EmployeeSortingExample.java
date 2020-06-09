package Ano;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    String name;
    int eNumber;

    Employee(String name, int eNumber){
        this.name = name;
        this.eNumber = eNumber;
    }

    public String toString(){
        return name + " : " + eNumber;
    }
}



public class EmployeeSortingExample {

    public static void main(String[] args) {
        ArrayList<Employee> employeeslist = new ArrayList<Employee>();
        employeeslist.add(new Employee("Shama Ugale", 10001));
        employeeslist.add(new Employee("Aarush", 2138));
        employeeslist.add(new Employee("Sonal", 8707));
        employeeslist.add(new Employee("Amit P", 4504));

        Collections.sort(employeeslist, (e1,e2)-> (e1.eNumber<e2.eNumber?-1: (e1.eNumber>e2.eNumber?1:0)));
        System.out.println("After sorting the employees based on the employee number : " + employeeslist);

        Collections.sort(employeeslist, (e1,e2)-> e1.name.compareTo(e2.name));
        System.out.println("After sorting the employees based on the employee name : " + employeeslist);
    }

}
;