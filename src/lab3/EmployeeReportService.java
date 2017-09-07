package lab3;

/**
 *
 * @author jlombardo
 */
public class EmployeeReportService {
    
    private String report = "";
    
    public void addData(String data) {
        report += data;
    }
    
    public void outputReport(String msg) {
        System.out.println(report);
    }
    
    public void clearReport() {
        report = "";
    }
    
//    private Employee employee;
//    
//    public EmployeeReportService(Employee e) {
//        employee = e;
//    }
//    
//    public void outputHrInfomation() {
//        System.out.println(employee.getLastName() + "completed orientation");
//    }
}
