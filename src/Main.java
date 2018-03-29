import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeManager em1 = new EmployeeManager();
		Secretary s1 = new Secretary("1ab","b" ,"c", GenderType.MALE, TypeOfProfession.SECRETARY, 25000, 2000, 8 );	
		System.out.println(s1);
		Programmer p1 = new Programmer("2ab","b" ,"c", GenderType.FEMALE, TypeOfProfession.PROGRAMMER, 30000, 2000, 8 );
		System.out.println(p1);
		Programmer p2 = new Programmer("3ab","b" ,"c", GenderType.FEMALE, TypeOfProfession.PROGRAMMER, 30000, 2000, 8 );
		System.out.println(p2);
		Technician t1 = new Technician("4ab", "f", "g", GenderType.MALE, TypeOfProfession.TECHNICIAN, 20000, 5000, 8);
		System.out.println(t1);
		
		//ArrayList<Employee> employeeList = new ArrayList<>();
		
		em1.addEmployee(s1);
		em1.addEmployee(p1);
		em1.addEmployee(p2);
		em1.addEmployee(t1);
		
		System.out.println(em1.getEmployees());
		System.out.println("Antal kvinnliga anställda: " + em1.getNoOfFemales(GenderType.FEMALE));
		System.out.println("Antal manliga anställda: " + em1.getNoOfMales(GenderType.MALE));
		System.out.println("Totalt antal anställda: " + em1.TotalNoOfEmployees());
	}

}
