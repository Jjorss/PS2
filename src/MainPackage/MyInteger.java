package MainPackage;

public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public static void main(String[] args) {


	}

	public Boolean isEven() {
		if (getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean isOdd() {
		if (getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isPrime() {
		for (int i = 2; i < getValue(); i++) {
			if (getValue() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static Boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static Boolean IsEven(MyInteger myInt) {
		if (myInt.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static Boolean IsOdd(MyInteger myInt) {
		if (myInt.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public static Boolean IsPrime(MyInteger myInt) {
		for (int i = 2; i < myInt.value; i++) {
			if (myInt.value % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public Boolean equals(int value) {
		if(getValue() == value) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean equals(MyInteger myInt) {
		if(myInt.value == getValue()) {
			return true;
		} else {
			return false;
		}
	}
	public static void parseInt(char[] cha) {
		int value = 0;
		for(int i : cha) {
			value += i;
		}
	}
	
	public static void parseInt(String s) {
		int value = Integer.parseInt(s);
	}

	public int getValue() {
		return value;
	}

}
