/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Mitch
 */
public class Management {

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
       
    }
    
    
    public static void main(String[] args) {
        Management manager = new Management();
        manager.hireEmployee("Peter", "Piper", "111-11-1111");
    }
    
    
}
