package Week1.Day1;

public class Student {
		String studentName;
		int rollNo;
		String collegeName;
		int markScored;
		double cgpa;
		
		public Student(String studentName, int rollNo, String collegeName,int markScored, double cgpa) {
			this.studentName = studentName;
			this.rollNo = rollNo;
			this.collegeName = collegeName;
			this.markScored = markScored;
			this.cgpa = cgpa;
			
			System.out.println(rollNo+" "+studentName+" "+collegeName+" "+markScored+" "+cgpa);
			
		}
		
}
