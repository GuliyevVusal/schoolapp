package schoolApp;

public class Teacher extends Person {

    private int experience;
    private String qualification;
    private double salary;

    public Teacher(String firstName, String lastName,
                   String education, String otherInfo, int experience, String qualification, double salary) {
        super(firstName, lastName, education, otherInfo);
        this.experience = experience;
        this.qualification = qualification;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Tecrubesi: " + experience + " il ");
        System.out.println("Ixtisas: " + qualification);
        System.out.println("Maas: " + salary + " Azn ");

    }
}
