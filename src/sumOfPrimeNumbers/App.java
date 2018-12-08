package sumOfPrimeNumbers;

public class App {

	public static void main(String[] args) {

		long sum = 0;

		for (int number = 2; number < 100; number++) {

			if (isPrime(number)) {
				sum += number;

			}

		}
		System.out.println(sum);

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i < number / 2; i++) {

			if (number % i == 0) {

				return false;
			}
		}
		return true;

	}
}
