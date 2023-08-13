package week1day1;

public class Student {
	

	private String studentName;
	private int rollno;
	private String collegename;
	private double markscored;
	private int cgpa;

	public static void main(String[] args) {
		
	
	 // Create a new student instance
    Student S = new Student();
    
    // Assign values to the attributes
    S.studentName = "Aravinth";
    S.rollno = 1465383823;
    S.collegename = "Anna university";
    S.markscored = 85.5;
    S.cgpa = 9;
    
    // Print the attributes
    System.out.println("Student Name: " + S.studentName);
    System.out.println("Roll Number: " + S.rollno);
    System.out.println("College Name: " + S.collegename);
    System.out.println("Marks Scored: " + S.markscored);
    System.out.println("CGPA: " + S.cgpa);

}
}
