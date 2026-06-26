
public class Course implements Display{
	    private String courseId;
	    private String courseName;
	    private String duration;
	    private String trainerName;
	    private double fees;
		public Course(String courseId, String courseName, String duration, String trainerName, double fees) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.duration = duration;
			this.trainerName = trainerName;
			this.fees = fees;
		}
		public String getCourseId() {
			return courseId;
		}
		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getTrainerName() {
			return trainerName;
		}
		public void setTrainerName(String trainerName) {
			this.trainerName = trainerName;
		}
		public double getFees() {
			return fees;
		}
		public void setFees(double fees) {
			this.fees = fees;
		}
	    
		@Override
	    public void showDetails() {

	        System.out.println("Course ID : " + courseId);
	        System.out.println("Course Name : " + courseName);
	        System.out.println("Duration : " + duration);
	        System.out.println("Trainer : " + trainerName);
	        System.out.println("Fees : " + fees);
	    }
}
