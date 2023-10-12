package schoolApp;

import java.util.ArrayList;
import java.util.List;

public class SchoolApplication {

    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList();


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayTeachers() {
        System.out.println("Muellimlerin Siyahisi:");
        System.out.println("---------------");
        for (Teacher teacher : teachers) {
            teacher.displayInfo();
            System.out.println("-----------------");
        }
    }

    public void displayStudents() {
        System.out.println("Telebelerin Siyahisi: ");
        System.out.println("---------------");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("------------------");
        }
    }

    public void deleteTeacher(String firstName, String lastName) {
        Teacher teacherToRemove = null;
        for (Teacher teacher : teachers) {
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName)) {
                teacherToRemove = teacher;
                break;
            }
        }
        if (teacherToRemove != null) {
            teachers.remove(teacherToRemove);
            System.out.println(firstName + " " + lastName + " muellimi silindi... ");
        } else {
            System.out.println(firstName + " " + lastName + " muellim tapilmadi...");
        }
    }

    public void deleteStudent(String firstName, String lastName) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println(firstName + " " + lastName + " telebesi silindi...");
        } else {
            System.out.println(firstName + " " + lastName + " telebesi tapilmadi...");
        }
    }
}
