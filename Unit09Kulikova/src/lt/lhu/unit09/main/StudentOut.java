package lt.lhu.unit09.main;


public class StudentOut {

	public static void main(String[] args) {

		Student s1 = new Student("Ra", "Anton", "13a", new int[] { 3, 8, 5, 5, 9 });
		Student s2 = new Student("Bastet", "Karl", "5b", new int[] { 6, 8, 9, 5, 9 });
		Student s3 = new Student("Gor", "Bela", "13a", new int[] { 9, 10, 9, 10, 9 });
		Student s4 = new Student("Amon", "Anna", "5b", new int[] { 10, 10, 9, 9, 9 });
		Student s5 = new Student("Seth", "Paul", "13a", new int[] { 4, 4, 4, 4, 4 });
		Student s6 = new Student("Aton", "Leo", "8/1", new int[] { 9, 10, 9, 10, 9 });
		Student s7 = new Student("Horus", "Nina", "4", new int[] { 9, 5, 9, 4, 9 });
		Student s8 = new Student("Geb", "Otto", "13a", new int[] { 9, 10, 1, 10, 9 });
		Student s9 = new Student("Maat", "Celine", "5b", new int[] { 9, 10, 9, 10, 9 });
		Student s10 = new Student("Tot", "Vlad", "8/1", new int[] { 9, 5, 9, 3, 9 });

		StudentsGroup gr = new StudentsGroup();

		gr.add(s1);
		gr.add(s2);
		gr.add(s3);
		gr.add(s4);
		gr.add(s5);
		gr.add(s6);
		gr.add(s7);
		gr.add(s8);
		gr.add(s9);
		gr.add(s10);

		Student[] groupBestStudents = gr.bestStudent();

		for (int i = 0; i < groupBestStudents.length; i++) {
			groupBestStudents[i].print();
		}

	}
}
