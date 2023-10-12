package schoolApp;

public class Student extends Person {

    private int age;
    private String studentNumber;

    public Student(String firstName, String lastName, String education,
                   String otherInfo, int age, String studentNumber) {
        super(firstName, lastName, education, otherInfo);
        this.age = age;
        this.studentNumber = studentNumber;
    }


    public int getAge() {
        return age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Yas: " + age);
        System.out.println("Tebele Nomresi: " + studentNumber);
    }

    }


