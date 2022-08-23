package exception;

public class CustomExpTest {

	public static void main(String[] args) throws InvalidAgeException{

		int ageData = 16;


			if (ageData < 18) {

				throw new InvalidAgeException("not eligble to vote");
			}
		

	}

}
