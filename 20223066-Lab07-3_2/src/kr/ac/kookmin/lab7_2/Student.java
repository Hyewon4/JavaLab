package kr.ac.kookmin.lab7_2;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int score() {
		return score;
	}
	
	public String name() {
		return name;
	}
}
	