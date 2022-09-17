
public class Main {

	public static void main(String[] args) {
		long fact = 1;
		long sayi = 1;

		while (sayi <= 20) {
			fact = fact * sayi;
			System.out.println("factorial of " + sayi + " = " + fact);
			sayi++;
		}
	}
}
