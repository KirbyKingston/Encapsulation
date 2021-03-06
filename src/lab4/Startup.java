package lab4;

/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Mitch
 */
public class Startup {
    public static void main(String[] args) {

        Employer employer = new Employer();
        
        employer.processEmployee("Peter", "Piper", "111-11-1111");
    }
    
    
}
