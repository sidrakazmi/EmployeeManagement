import java.util.ArrayList;


public class EmployeeManager {
	
	private ArrayList<Employee> employeeList = new ArrayList<>();
	//private ArrayList<Programmer> programmerList = new ArrayList<>();
	//private ArrayList<Technician> technicianList = new ArrayList<>();
	
	public void addEmployee(Programmer programmer) {
		employeeList.add(programmer);
	}
	

}
