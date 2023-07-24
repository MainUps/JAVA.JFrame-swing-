package 3_difficult_Graphics;

public class Patient {
	public String name = "";
	public int height = 0;
	public int weight = 0;
	
	
	public Patient() {
		this.name = "";
		this.height = 0;
		this.weight = 0;
	}
	public Patient(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double getBMI() {
		double height_m = height * 0.01;
		double BMI = weight / ((height_m*height_m));
		return BMI;
	}
}