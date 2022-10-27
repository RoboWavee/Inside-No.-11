package lt.lhu.unit09.main;
/*
 * Tест часов
 */

public class WatchTest {

	public static void main(String[] args) {

		Watch test1 = new Watch();

		Watch test2 = new Watch(7, 15, 20);

		Watch test3 = new Watch(3, 3, 3);

		test1.print();
		System.out.println("\n-------------------------");
		test2.print();
		System.out.println("\n-------------------------");
		test3.print();
		System.out.println("\n-------------------------");

		test1.addTime(2, 0, 78);
		test2.addTime(1, 1, 1);
		test3.addTime(2, 10, 10);

		test1.print();
		System.out.println("\n-------------------------");
		test2.print();
		System.out.println("\n-------------------------");
		test3.print();
		System.out.println("\n-------------------------");

	}

}
