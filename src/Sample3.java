import java.util.Scanner;

public class Sample3 {

    int SIZE = 5;
    int[] q = new int[SIZE];
    int front = 0;
    int rear = 0;
    static Scanner scanner;

    void enqueue() {
        int no;
        if (rear == SIZE && front == 0) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Enter the number: ");
            no = scanner.nextInt();
            q[rear] = no;
        }
        rear++;
    }

    void dequeue() {
        int no;
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            no = q[front];
            front++;
            System.out.println(no + " -removed from queue");
        }
    }

    void display() {
        int i, temp = front;
        if (front == rear) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("Elements in the queue: ");
            for (i = temp; i < rear; i++) {
                System.out.println(q[i]);
            }
        }
    }

    public static void main(String[] args) {
        Sample3 queueClass = new Sample3();
        scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[1] Add element\n" + "[2] Remove Element\n" + "[3] Display List\n" + "[4] Program Exit");
            System.out.println("Enter your choice: ");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1: {
                    queueClass.enqueue();
                    break;
                }
                case 2: {
                    queueClass.dequeue();
                    break;
                }
                case 3: {
                    queueClass.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
