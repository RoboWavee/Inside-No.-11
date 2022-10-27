package lt.lhu.unit09.main;

public class StudentsGroup {

	private Student[] students = new Student[10];
	private int currentSize = 0;

	public StudentsGroup() {

	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}

	public boolean add(Student st) {
		if (currentSize >= students.length) {
			return false;
		}

		students[currentSize] = st;
		currentSize++;

		return true;
	}

	public Student[] bestStudent() {
		int countBestStudent = 0;
		for (Student st : students) {
			if (st.bestStudent()) {
				countBestStudent++;
			}
		}

		Student[] result = new Student[countBestStudent];
		int count = 0;
		for (Student st : students) {
			if (st.bestStudent()) {
				result[count] = st;
				count++;
			}
		}
		return result;
	}

}
