package GroupCode;

public class Course {
	public int courseID;
	public String courseName;
	public String courseDescription;
	public int credits;
	public String department;
	
	public Course(int id, String name, String description, int credits, String department) {
		courseID = id;
		courseName = name;
		courseDescription = description;
		this.credits = credits;
		this.department = department;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
