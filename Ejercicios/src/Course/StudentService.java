package Course;
import Student.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService
{
	private HashMap<String, Course> courseList = new HashMap<>();
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents( String courseName, String studentID ) //los throwa producen el error si los quito funciona
      			throws CourseNotFoundException, StudentNotFoundException {
    	if (! courseList.containsKey(courseName)) {
    		throw new CourseNotFoundException();
    	}
    	if (! students.containsKey(studentID)) {
    		throw new StudentNotFoundException();
    	}
    
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }

    public void unEnrollStudents( String courseName, String studentID )
    throws CourseNotFoundException, StudentNotFoundException {
    	if (! courseList.containsKey(courseName)) {
    		throw new CourseNotFoundException();
    	}
    	if (! students.containsKey(studentID)) {
    		throw new StudentNotFoundException();
    	}
    	
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){
    	System.out.println(courseId+" enrolled:" );
    	Course course =courseList.get(courseId);
    	for (String studentid : coursesEnrolledByStudents.keySet()) {
    		List<Course> allCourses = coursesEnrolledByStudents.get(studentid);
    		if ( allCourses.contains(course)) {
    			Student student =students.get(studentid);
    			System.out.println(student);
    		}
    	}//foreach
    }

    public void showAllCourses(){
        //TODO implement using collections loops
    	for(String key:courseList.keySet()){
    		System.out.println(courseList.get(key));
    	}
    }
    
    public void addStudent(Student student) {
//TODO COMPLETAR CON GRABACIONES
    }
}