class student { //encapsulated class
	
	//private data member 
	private int stu_id;
	private String name, email;
	private float fees;
	
	//public getter and setter method 
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}	
}

public class Encp_Test2 { // class to test encapsulated class
	public static void main(String[] args) {
		student s=new student();//creating object of student class
		s.setStu_id(101);
		s.setName("smit");
		s.setEmail("smit@zohoemail.com");
		s.setFees(1000f);
		//getting the value through getter method
		System.out.println(s.getStu_id()+" "+s.getName()+" "+s.getEmail()+" "+s.getFees());
		
	}
	
}

