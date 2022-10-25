package lt.lhu.unit09.main;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения 
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений 
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Watch {

	private int hour;
	private int minute;
	private int second;

	public Watch() {

		hour = 0;
		minute = 0;
		second = 0;
	}

	public Watch(int hour, int minute, int second) {

		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}

		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}

		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public void addHour(int addH) {
		hour += addH;
		if (hour < 0 || hour > 23) {
			this.hour = 0;
		}
	}

	public void addMinute(int addM) {
		minute += addM;
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		}
	}

	public void addSecond(int addS) {
		second += addS;
		if (second < 0 || second > 59) {
			this.second = 0;
		}
	}

	public void print() {
		System.out.printf("Time: " + "%02d:%02d:%02d", hour, minute, second);
	}

	public static void main(String[] args) {

		Watch test1 = new Watch();

		Watch test2 = new Watch(7, 15, 20);

		Watch test3 = new Watch(7, 75, 60);

		test1.print();
		System.out.println("\n-------------------------");
		test2.print();
		System.out.println("\n-------------------------");
		test3.print();
		System.out.println("\n-------------------------");

		test1.addHour(5);
		test1.addMinute(37);
		test1.addSecond(33);
		test2.addHour(7);
		test2.addMinute(37);
		test2.addSecond(33);
		test3.addHour(20);
		test3.addMinute(37);
		test3.addSecond(33);

		test1.print();
		System.out.println("\n-------------------------");
		test2.print();
		System.out.println("\n-------------------------");
		test3.print();
		System.out.println("\n-------------------------");

	}
}
