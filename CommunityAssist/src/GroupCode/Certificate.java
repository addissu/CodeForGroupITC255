package GroupCode;

import java.util.ArrayList;

public class Certificate {
	public int certificateID;
	public String certificateName;
	public String certificateDescription;
	public ArrayList<Student> enrolledStudents;
	public ArrayList<Course> requiredCourses;
	public int completions;
	
	public int getCertificateID() {
		return certificateID;
	}

	public void setCertificateID(int certificateID) {
		this.certificateID = certificateID;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateDescription() {
		return certificateDescription;
	}

	public void setCertificateDescription(String certificateDescription) {
		this.certificateDescription = certificateDescription;
	}

	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public ArrayList<Course> getRequiredCourses() {
		return requiredCourses;
	}

	public void setRequiredCourses(ArrayList<Course> requiredCourses) {
		this.requiredCourses = requiredCourses;
	}

	public int getCompletions() {
		return completions;
	}

	public void setCompletions(int completions) {
		this.completions = completions;
	}

	public Certificate(int id, String name, String description){
		certificateID = id;
		certificateName = name;
		certificateDescription = description;
		enrolledStudents = new ArrayList<Student>();
		requiredCourses = new ArrayList<Course>();
		completions = 0;
	}
	
	public void addStudent(Student s) {
		enrolledStudents.add(s);
	}
	public void addCourse(Course c) {
		requiredCourses.add(c);
	}
}
