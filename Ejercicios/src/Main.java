import Course.*;
import Student.CourseNotFoundException;
import Student.StudentNotFoundException;


public class Main {

    public static void main(String[] args) throws StudentNotFoundException, CourseNotFoundException {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1020", 28 ) );
        studentService.addStudent(new Student( "Elise", "1020", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );

        try {
            studentService.enrollStudents( "Math", "1030" );
        }
    	catch (CourseNotFoundException e){
    		
    	}
    }
}