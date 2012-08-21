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
		User user1 = new User(1, "武田", "憲隆");
		User user2 = new User(2, "今田", "尭");
		User user3 = new User(3, "酒見", "真悟");
		User user4 = new User(4, "内藤", "初美");
		User user5 = new User(5, "長尾", "有希子");
		User user6 = new User(6, "永野", "修平");
		User user7 = new User(7, "高木", "香");
		User user8 = new User(8, "原田", "清司");
		User user9 = new User(9, "武末", "憲和");
		User user10 = new User(10, "榎枝", "大悟");
		//User user11 = new User(11, "和田", "充史");

		user1.show();
		user2.show();
		user3.show();
		user4.show();
		user5.show();
		user6.show();
		user7.show();
		user8.show();
		user9.show();
		user10.show();
		//問題４のコード　ここまで

		//問題7のコード　ここから
		Student student1 = new Student(1, "武田", "憲隆");
		Student student2 = new Student(2, "今田", "尭");
		Student student3 = new Student(3, "酒見", "真悟");
		Student student4 = new Student(4, "内藤", "初美");
		Student student5 = new Student(5, "長尾", "有希子");
		Student student6 = new Student(6, "永野", "修平");
		Student student7 = new Student(7, "高木", "香");
		Student student8 = new Student(8, "原田", "清司");
		Student student9 = new Student(9, "武末", "憲和");
		Student student10 = new Student(10, "榎枝", "大悟");
		Student student11 = new Student(11, "野口", "龍真");
		Student student12 = new Student(12, "花田", "恒一");
		Student student13 = new Student(13, "鐘ヶ江", "耕治");
		Student student14 = new Student(14, "奈木野", "純一");
		Student student15 = new Student(15, "割鞘", "洋介");
		Student student16 = new Student(16, "國崎", "宏治");
		Student student17 = new Student(17, "徳永", "裕介");
		Student student18 = new Student(18, "柴田", "伊織");
		Student student19 = new Student(19, "皆川", "洋介");
		Student student20 = new Student(20, "松隈", "恭子");
		Student student21 = new Student(21, "山野", "兼治");
		Student student22 = new Student(22, "山之内", "洋平");

		Teacher teacher1 = new Teacher(101, "長澤", "大輔 ", "デザイン");
		Teacher teacher2 = new Teacher(102, "ラディ", "ジェイソン", "デザイン");
		Teacher teacher3 = new Teacher(103, "薄井", "隆", "Web/アプリ");
		Teacher teacher4 = new Teacher(104, "山本", "浩司", "3DCG");
		Teacher teacher5 = new Teacher(105, "ハナブサ", "ノブユキ", "デザイン");
		Teacher teacher6 = new Teacher(106, "コヌマ", "ヨシツグ", "Web/アプリ");
		Teacher teacher7 = new Teacher(107, "渡辺", "昇治", "Web/アプリ");

		student1.show();
		student2.show();
		student3.show();
		student4.show();
		student5.show();
		student6.show();
		student7.show();
		student8.show();
		student9.show();
		student10.show();
		student11.show();
		student12.show();
		student13.show();
		student14.show();
		student15.show();
		student16.show();
		student17.show();
		student18.show();
		student19.show();
		student20.show();
		student21.show();
		student22.show();

		teacher1.show();
		teacher2.show();
		teacher3.show();
		teacher4.show();
		teacher5.show();
		teacher6.show();
		teacher7.show();
		//問題７のコード　ここまで
	}
}