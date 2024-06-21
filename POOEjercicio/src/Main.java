
public class Main {
public static void main(String[] args) {
	Student vero = new Student("vero","bedolla");
	Student leonardo  = new Student("leonardo", "Leon");
	Student[] students = {
			 new Student("vero","bedolla"),
			 new Student("leonardo", "Leon")
	};
	
	Courses java= new Courses("java", "hossling",1);
	
	java.enroll(students);
	java.enroll(vero);
	java.enroll(leonardo);
	
	System.out.println(vero.changeYearIfApproved());
	System.out.println(java.bestGrade());
	
	vero.printFullName();
	leonardo.printFullName();
	
}
}
