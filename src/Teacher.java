public class Teacher extends User{
	public String subject;
	
	public Teacher(int id1, String firstName1, String lastName1, String subject1){
		super(id1, subject1, subject1);
		this.subject = subject1;
	}

	@Override
	public void show(){
		System.out.println("氏名→"+super.firstName+":"+super.lastName+"教科:"+this.subject);
	}

	public String getSubject(){
		return this.subject;
	}
}