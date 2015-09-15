
public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getMyInteger() {
		return this.value;
	}

	public Boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isOdd() {
		if (this.isEven() == false) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isPrime() {

		if (this.value % 2 == 0)
			return false;

		for (int i = 3; i * i <= this.value; i += 2) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}

	public static Boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;

		} else {
			return false;
		}
	}

	public static Boolean isOdd(int a) {
		if (a % 2 == 0) {
			return false;
		} else {
			return false;
		}
	}

	public static Boolean isPrime(int a) {
		if (a % 2 == 0)
			return false;

		for (int i = 3; i * i <= a; i += 2) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

	public static Boolean isEven(MyInteger a) {
		return a.isEven();
	}

	public static Boolean isOdd(MyInteger a) {
		return a.isOdd();
	}

	public static Boolean isPrime(MyInteger a) {
		return a.isPrime();
	}

	public static int parseInt(char[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			j += a[i];
		}
		return j;
	}

	public static int parseInt(String a) {
		int j = parseInt(a);
		return j;

	}
}
