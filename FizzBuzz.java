public class FizzBuzz {


    /**
     * Method to 
     */
    public String fizzBuzz(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            system.out.println("FizzBuzz");
        }
        else if (x % 3 == 0) {
            system.out.println("Fizz");
        }
        else if (x % 5 == 0) {
            system.out.println("Buzz");
        }
        else {
            system.out.println(Integer.toString(x));
        }
    }
}
