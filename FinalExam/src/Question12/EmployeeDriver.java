/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;

/**
 *
 * @author S542047
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SYED ABDUL SUBOOR");
        System.out.println("QUESTION 12");
        System.out.println("*******************************************");
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(102,"Josh", 2000));
        emp.add(new Employee(222,"Megan", 5000));
        emp.add(new Employee(921,"Sunny", 1500));
        emp.add(new Employee(112,"Connie", 10000));
        emp.add(new Employee(999,"Phil", 20000));
        
        for(Employee e:emp){
            System.out.println(e);
        }
        Collections.sort(emp);
        
        System.out.println("****************************************");
        for(Employee e:emp){
            System.out.println(e);
        }
       
        Comparator<Employee> compSal = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() > e2.getEmpSalary()) {
                    return 1;
                }
                if (e1.getEmpSalary() < e2.getEmpSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        System.out.println("*****************************************");
        Collections.sort(emp, compSal);
        for (Employee e : emp) {
            System.out.println(e.toString());
        }

        System.out.println("*******************************************");
        Comparator<Employee> compName = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
		return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};
	Collections.sort(emp, compName);
        for (Employee e : emp) {
        System.out.println(e.toString());
        }

    }
    
}
