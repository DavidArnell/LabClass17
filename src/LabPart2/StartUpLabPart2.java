/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPart2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Owner
 */
public class StartUpLabPart2 {

    public static void main(String[] args) {

        //String nameLister = "The employees are: ";
        String employeeList = "";

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Arnell", "David", "123-45-6789"));
        employees.add(new Employee("Guy", "This", "987-65-4321"));
        employees.add(new Employee("Guy", "That", "867-53-0900"));

        Employee e0 = employees.get(0);
        Employee e1 = employees.get(1);
        Employee e2 = employees.get(2);

        for (int i = 0; i < employees.size(); i++) {
            employeeList = employeeList.concat(employees.get(i).getFirstName()
                    + " " + employees.get(i).getLastName() + ", ");
            //System.out.println(employees.get(i).getFirstName());
        }

        System.out.println("The employees are: " + employeeList + " etc.");

//        public String getNames(ArrayList employees){
//            
//            //this.employees = employees;
//            
//            String nameList;
//            
//            for (int i = 0; i < employees.size(); i++)
//            
//            return nameList;
//        }
    }
}
