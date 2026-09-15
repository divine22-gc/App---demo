public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Using normal for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
   


		//Enhanced for loop

		for (int number : numbers) {
			System.out.println(number);
		}
	}
}