package gradesapp;

import java.util.ArrayList;
import java.util.List;

public class GradeManager {

    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public double calculateAverage() {
        if (students.isEmpty()) return 0;

        double sum = 0;
        for (Student s : students) {
            sum += s.getGrade();
        }
        return sum / students.size();
    }
}
