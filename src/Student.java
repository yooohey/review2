public class Student extends User{

	public Student(int id1, String firstName1, String lastName1){
		super.id = id1;
		super.firstName = firstName1;
		super.lastName = lastName1;
	}

	@Override
	public void show(){
		System.out.println("氏名→"+super.firstName+":"+super.lastName);
	}

}