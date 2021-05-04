/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author S542047
 */
public class Employee implements Comparable<Employee>{
private int empId;
private String empName;
private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
  
    @Override
    public String toString() {
        return "Employee Id: "+empId+" Employee Name: "+empName+
                " Employee Salary: "+String.format("%.2f",empSalary);
    }


    @Override
    public int compareTo(Employee em) {
        if(empId<em.empId){
            return -1;
        }
        else if(empId>em.empId){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    
}
