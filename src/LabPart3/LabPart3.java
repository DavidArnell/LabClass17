/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPart3;

import LabPart2.Employee;
import labclass17.Dog;
import java.util.ArrayList;
import java.util.List;
import labclass17.Dog;

/**
 *
 * @author Owner
 */
public class LabPart3 {
    
    public static void main(String[] args) {
        
//        List<Employee> employees = new ArrayList<>();
//        
//        List<Dog> dog = new ArrayList<>();
        
        List<String> mammal = new ArrayList<>();
        
        //new Dog("Fido", 351651);
        
        mammal.add(new Dog("Fido", 8675309));
        mammal.add(new Dog("Rover", 66335006));
        mammal.add(new Employee("Arnell", 123456789));
        mammal.add(new Employee("Anderson", 987654321));
        
        
        
    }
    
}
