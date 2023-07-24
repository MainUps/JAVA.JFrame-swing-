package 4_JOptionPane;

public class Course {
	private String title;
	private Professor lecturer;
	private Book textbook;
	
	public Course(String title, Professor lecturer, Book textbook) {
		this.title = title;
		this.lecturer = lecturer;
		this.textbook = textbook;
	}
	public String toString() {
		return "교과목 이름: " + title 
				+ "\n담당교수: [" + lecturer.toString() + "]"
				+ "\n교재: [" + textbook.toString() + "]";
	}
}
