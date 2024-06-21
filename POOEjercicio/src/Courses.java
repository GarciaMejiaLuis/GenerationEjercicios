import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year;

	List<Student> enrolled = new ArrayList<Student>(  );
	
	
	public Courses (String courseName, String professorName, int year) {
		this.professorName=professorName;
		this.courseName=courseName;
		this.year=year;
	}
	
	 public void enroll(Student student){
		enrolled.add(student);
	 }
	 
	 public void enroll(Student[] students){
		for (Student student :students) {
			enroll(student);
		}
		 }


	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
			if (enrolled.contains(student)) {
				   enrolled.remove(student);				
			}

	   }

	   public int countStudents(){
	       //TODO 
		   return enrolled.size();
	   }
	   
	   public int bestGrade(){
	    int best=0;
	    for(Student student:enrolled) {
	    	if(student.grade>best) {
	    		best=student.grade;
	    	}
	    }
	    return best;
	   }
	   
}
