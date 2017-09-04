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
public class Employer {
    
    private Management manager;

    public void processEmployee(String firstName, String lastName, String ssn) {
        manager.hireEmployee(firstName, lastName, ssn);
    }
    
    
    
}
