
public class Employee {

	public String id;
	public String name;
	public String adress;
	public GenderType gender;
	public TypeOfProfession professionType;
	
	public Employee(String id, String name, String adress, GenderType gender, TypeOfProfession  professionType) {
		
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.gender = gender;
		this.professionType= professionType;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public GenderType getGender() {
		return gender;
	}
	
	public TypeOfProfession getTypeOfProfession() {
		return professionType;
	}
	
	
	
}
