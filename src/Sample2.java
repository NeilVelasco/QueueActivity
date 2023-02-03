import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Sample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int myint;
        System.out.println("Please enter non-zero integers (enter 0 to end)");
        while(true) {
            myint = scanner.nextInt();
            if (myint == 0) { break; }
            deque.offerLast(myint);
        }

        System.out.println("My deque contains: ");
        while(!deque.isEmpty()) {
            System.out.println(" " + deque.peekFirst());
            deque.pollFirst();
        }

        System.out.println("Please enter non-zero integers (enter 0 to end)");
        while(true) {
            myint = scanner.nextInt();
            if (myint == 0) { break; }
            deque.offerFirst(myint);
        }

        System.out.println("My deque contains: ");
        while(!deque.isEmpty()) {
            System.out.println(" " + deque.peekFirst());
            deque.pollFirst();
        }
    }
}
