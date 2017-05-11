package GroupCode;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Kevin","i@kevin.com");
		Student s2 = new Student(2,"Lola","yarn@neko.co");
		Course c1 = new Course(1,"Advanced Sleeping","I'm asleep right now",5,"Cool Stuff");
		Course c2 = new Course(2,"Three Cats","There are three cats",3,"Three of Things");
		Certificate C1 = new Certificate(1,"Sleeping","Whatever");
		C1.addStudent(s2);
		C1.addStudent(s1);
		C1.addCourse(c1);
		C1.addCourse(c2);
		for (Course c : C1.getRequiredCourses()){
			System.out.println(c.getCourseName());
		}
		for (Student s : C1.getEnrolledStudents()){
			System.out.println(s.getStudentName());
		}

}}