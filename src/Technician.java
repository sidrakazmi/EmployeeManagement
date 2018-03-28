
public class Technician extends Employee {

	public int salary;
	public int bonus;
	public int workHours;
	
	public Technician(String id, String name, String adress, GenderType gender, TypeOfProfession professionType,
			int salary, int bonus, int workHours) {
		super(id, name, adress, gender, professionType);
		this.salary = salary;
		this.bonus = 0;
		this.workHours = 5;
	}

	public int getSalary() {
				return salary;
	}


	public int getBonus() {
		return bonus;
	}
	
	public int salaryAfterBonus() {
		int salaryAfterBonus = salary+bonus;
		//this.salary = salary;
		return salaryAfterBonus;
	}



	
}
