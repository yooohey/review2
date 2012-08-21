public class Student extends User{
	
	public Student(int id1, String firstName1, String lastName1){
		super(id1, firstName1, lastName1);
	}

	@Override
	public void show(){
		System.out.println("氏名→"+super.firstName+":"+super.lastName);
	}

}