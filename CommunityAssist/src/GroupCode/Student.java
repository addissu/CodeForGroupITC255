package GroupCode;

public class Student {
	public int studentID;
	public String studentName;
	public String email;

	public Student(int id, String name, String email) {
		studentID = id;
		studentName = name;
		this.email = email;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
