package ProgrammingKnowledge;

public class MyJunitClass {
	public int add(int a, int b) {
		return a + b;
	}

	public String concat(String a, String b) {
		return a + b;
	}

	public boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public boolean isPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
