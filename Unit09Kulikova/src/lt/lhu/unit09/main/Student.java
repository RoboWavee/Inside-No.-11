package lt.lhu.unit09.main;

import java.util.Arrays;

public class Student {

	private String surname;
	private String name;
	private String group;
	private int[] grade;

	public Student() {
		super();
	}

	public Student(String surname, String name, String group, int[] grade) {
		this.surname = surname;
		this.name = name;
		this.group = group;
		this.grade = grade;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int[] getGrade() {
		return grade;
	}

	public void setGrade(int[] grade) {
		this.grade = grade;
	}

	public boolean bestStudent() {
		for (int mark : grade) {
			if (mark < 9) {
				return false;
			}
		}
		return true;
	}

	

	public void print() {
		System.out.print("Student: " + surname + " " + name + ", Gruppa " + group + ", ocenki: "
				+ Arrays.toString(grade) + "\n");

	}
}
