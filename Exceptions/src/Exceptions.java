import java.util.Scanner;

public class Exceptions {

	public static int kvot(int number1, int number2) throws Exception {
		if (number1 == 8) {
			throw new Exception();
		}
		return number1 / number2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two integers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		try {
			int result = kvot(number1, number2);
			System.out.println(number1 + "/" + number2 + " is " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Exception: Du kan inte dela med 0");
			System.out.println(ex.getStackTrace());
		} catch (NullPointerException ex) {
			System.out.println("Null exception");
		} catch (Exception ex) {
			System.out.println("Generell exception eller siffran 8 som är för fin");
			StackTraceElement[] traceElements = ex.getStackTrace();
			for (int i = 0; i < traceElements.length; i++) {
				System.out.println("method " + traceElements[i].getMethodName());
				System.out.println("line number " + traceElements[i].getLineNumber());
			}
		}
		finally {
			System.out.println("Körs alltid");
		}
		System.out.println("Programmet avslutas");
	}

}
