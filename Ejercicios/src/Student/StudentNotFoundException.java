package Student;

public class StudentNotFoundException extends Exception
{
    public StudentNotFoundException( )
    {
        super( "Student not found!" );
    }
}