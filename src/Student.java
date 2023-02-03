import java.util.ArrayDeque;
import java.util.Queue;

public class Student {

    private int idNum;
    private String name;

    public Student (int idNum, String name) {
        this.idNum = idNum;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int idNum) {
        this.idNum = idNum;
    }

    public int getId() {
        return idNum;
    }

    public static void main(String[] main) {
        Student frosh = new Student(11111111, "Neil Velasco");
        System.out.println("Frosh name: " + frosh.getName());
        System.out.println("Frosh ID: " + frosh.getId());

        Queue<Student> q = new ArrayDeque<>();
        q.offer(new Student(11112222, "Micycle Bichael"));
        System.out.println("Frosh name: " + q.peek().getName());
        System.out.println("Frosh ID num: " + q.peek().getId());
    }
}
