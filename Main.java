/**
 * Main class makes a recursive thread that will find the 10th Fibonacci sequence
 * @author Cheyenne Barton
 */

public class Main {
    /**
     * Main method starts the thread
     *
     * @param args
     */

    public static void main(String[] args) {
        recursiveThread reThread = new recursiveThread();

        reThread.start();
    }
}

/**
 * This class that extends Thread will implement the if statement loop to find the nth in the Fibonacci sequence
 */
class recursiveThread extends Thread {
    /**
     * nth Fibonacci number that is to be calculated
     */

    public Integer n = 0;

    /**
     * This method calculates the nth (10th) number.
     *
     * @param n The Fibonacci number to calculate.
     * @return The nth (10th) number.
     */

    int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Run method calculates the 10th number in the Fibonacci sequence. It then prints the message out to the console.
     */
    public void run() {
        n = fib(10);

        System.out.println("The 10th term of the Fibonacci sequence is " + n + " because the 8th term is 21 and the 9th is 34." +
                " So 21 plus 34 is 55.");
    }
}
