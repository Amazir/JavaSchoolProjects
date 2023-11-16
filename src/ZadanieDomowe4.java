import java.util.*;

public class ZadanieDomowe4 {
    private String id;
    private String firstName;
    private String lastName;
    private String faculty;
    private Map<String, Integer> marks = new HashMap<>();
    private double averageMark;

    public ZadanieDomowe4(String id, String firstName, String lastName, String faculty) {
        if (id.matches("\\d{6}")) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID musi mieć dokładnie 6 cyfr.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public void addMark(String subject, int mark) {
        if (mark >= 2 && mark <= 5) {
            marks.put(subject, mark);
            calculateAverage();
        } else {
            throw new IllegalArgumentException("Ocena musi być liczbą całkowitą z przedziału 2,5");
        }
    }

    public void changeMark(String subject, int newMark) {
        if (marks.containsKey(subject)) {
            addMark(subject, newMark);
        } else {
            throw new IllegalArgumentException("Przedmiot nie znaleziony");
        }
    }

    private void calculateAverage() {
        int total = 0;
        for (int mark : marks.values()) {
            total += mark;
        }
        averageMark = (double) total / marks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", marks=" + marks +
                ", averageMark=" + averageMark +
                '}';
    }

    public static void main(String[] args) {
        ZadanieDomowe4 s1 = new ZadanieDomowe4("123456", "John", "Doe", "Computer Science");
        s1.addMark("Math", 5);
        s1.addMark("Physics", 4);
        System.out.println(s1);

        ZadanieDomowe4 s2 = new ZadanieDomowe4("234567", "Jane", "Doe", "Biology");
        s2.addMark("Biology", 3);
        s2.addMark("Chemistry", 4);
        System.out.println(s2);

        s1.changeMark("Math", 3);
        System.out.println(s1);
    }
}