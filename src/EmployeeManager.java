import java.util.ArrayList;
import java.util.Optional;


public class EmployeeManager {

	private ArrayList<Employee> employeeList = new ArrayList<>();


	//private ArrayList<Programmer> programmerList = new ArrayList<>();
	//private ArrayList<Technician> technicianList = new ArrayList<>();

	public void addEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
	
		}
		
	public Optional<Employee> findEmployeeById(String Id) {
		
		for (Employee employee : employeeList) {
			if(employee.getId().equals(Id)) {
				return Optional.of(employee);
			}
		}
		return Optional.empty();	
	}
	
	//Får inte denna att räkna rätt!!
	public int getNoOfFemales(GenderType genderType) {
		int noOfFemales=0;
		for (Employee employee : employeeList) {
			
			if(genderType== GenderType.FEMALE) {
				noOfFemales++;
				return noOfFemales;
			}
					
			}
		return 0;
	}
	
	
	public int getNoOfMales(GenderType genderType) {
		int noOfMales=0;
		for (Employee employee : employeeList) {
			if(genderType== GenderType.MALE) {
				noOfMales++;
				return noOfMales;
			}
					
			}
		return 0;
	}
	
	public void removeEmployee(Employee newEmployee) {
		employeeList.remove(newEmployee);
	}

	public void printAllEmployees(ArrayList<Employee> employeeList) {
		for (Employee employee : employeeList) {
			System.out.println(employee);

		}
		
		//employeeList.stream().forEach(System.out::print);

	}

	//??
	public ArrayList getEmployees(){
		return employeeList;
	}

	public int TotalNoOfEmployees() {
		return employeeList.size();
	}



}
