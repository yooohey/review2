public class User{

	public Integer id;
	public String firstName;
	public String lastName;

	public User(int id1, String firstName1, String lastName1){
		this.id = id1;
		this.firstName = firstName1;
		this.lastName = lastName1;
	}

	public void showName(){
		System.out.println(this.firstName+":"+this.lastName);
	}

	public void show(){
		System.out.println("id→"+this.id);
		System.out.println("氏名→"+this.firstName+":"+this.lastName);
	}

	public static void main (String[] args){
		//問題４のコード　ここから
		User[] users = new User[10];
		users[0] = new User(1, "武田", "憲隆");
		users[1] = new User(2, "今田", "尭");
		users[2] = new User(3, "酒見", "真悟");
		users[3] = new User(4, "内藤", "初美");
		users[4] = new User(5, "長尾", "有希子");
		users[5] = new User(6, "永野", "修平");
		users[6] = new User(7, "高木", "香");
		users[7] = new User(8, "原田", "清司");
		users[8] = new User(9, "武末", "憲和");
		users[9] = new User(10, "榎枝", "大悟");
		
		for(User u:users){
			u.show();
		}
		//問題４のコード　ここまで

		//問題7のコード　ここから
		Student[] students = new Student[22];
		students[0] = new Student(1, "武田", "憲隆");
		students[1] = new Student(2, "今田", "尭");
		students[2] = new Student(3, "酒見", "真悟");
		students[3] = new Student(4, "内藤", "初美");
		students[4] = new Student(5, "長尾", "有希子");
		students[5] = new Student(6, "永野", "修平");
		students[6] = new Student(7, "高木", "香");
		students[7] = new Student(8, "原田", "清司");
		students[8] = new Student(9, "武末", "憲和");
		students[9] = new Student(10, "榎枝", "大悟");
		students[10]= new Student(11, "野口", "龍真");
		students[11] = new Student(12, "花田", "恒一");
		students[12] = new Student(13, "鐘ヶ江", "耕治");
		students[13] = new Student(14, "奈木野", "純一");
		students[14] = new Student(15, "割鞘", "洋介");
		students[15] = new Student(16, "國崎", "宏治");
		students[16] = new Student(17, "徳永", "裕介");
		students[17] = new Student(18, "柴田", "伊織");
		students[18] = new Student(19, "皆川", "洋介");
		students[19] = new Student(20, "松隈", "恭子");
		students[20] = new Student(21, "山野", "兼治");
		students[21] = new Student(22, "山之内", "洋平");
		
		Teacher[] teachers = new Teacher[7];
		teachers[0] = new Teacher(101, "長澤", "大輔 ", "デザイン");
		teachers[1] = new Teacher(102, "ラディ", "ジェイソン", "デザイン");
		teachers[2] = new Teacher(103, "薄井", "隆", "Web/アプリ");
		teachers[3] = new Teacher(104, "山本", "浩司", "3DCG");
		teachers[4] = new Teacher(105, "ハナブサ", "ノブユキ", "デザイン");
		teachers[5] = new Teacher(106, "コヌマ", "ヨシツグ", "Web/アプリ");
		teachers[6] = new Teacher(107, "渡辺", "昇治", "Web/アプリ");
		
		for(Student s:students){
			s.show();
		}
		for(Teacher t:teachers){
			t.show();
		}
		//問題７のコード　ここまで
	}
}