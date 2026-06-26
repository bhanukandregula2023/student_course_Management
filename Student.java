
public class Student extends Person implements Display {

	private int studentId;
    private String collegeName;
    private String courseName;
	
    
    public Student(int studentId,String name,String email,String phone,String collegeName) {
           super(name, email, phone);
           this.studentId = studentId;
           this.collegeName = collegeName;
}

	

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
    
	   @Override
	    public void showDetails() {

	        System.out.println("Student ID : " + studentId);
	        System.out.println("Name : " + getName());
	        System.out.println("Email : " + getEmail());
	        System.out.println("Phone : " + getPhone());
	        System.out.println("College : " + collegeName);
	        System.out.println("Course : " + courseName);
	    }
    
}
