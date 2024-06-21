 public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
 
 public void printFullName(){
     System.out.println(this.firstName +  " "+ this.lastName);
  }

  public boolean isApproved(){
      //TODO implement: should return true if grade >= 60
	  if(this.grade>=60) {
		  return true;
	  }
	  return false;
  }

  public int changeYearIfApproved( ){
      //TODO implement: the student should advance to the next year if he/she grade is >= 60
      // Make year = year + 1, and print "Congragulations" if the student has been approved
	  if(this.grade>=60) {
		  this.year+=1;
		  System.out.println("Congragulations");
		  return this.year;
	  }  
	  return 0;
  }
  public Student (String firstName, String lastName,int grade, int registration, int year) {
	  this.firstName=firstName;
	  this.lastName=lastName;
	  this.grade=grade;
	  this.registration=registration;
	  this.year=year;
  }
  public Student (String firstName, String lastName,int grade, int registration) {
	 this( firstName, lastName,grade,registration,2000);
  }
  public Student (String firstName, String lastName) {
		 this( firstName, lastName,80,20);
	  }
  
  
  }