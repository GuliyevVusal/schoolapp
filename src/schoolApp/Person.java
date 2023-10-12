package schoolApp;

public class Person {
    private String firstName;
    private String lastName;
    private String education;
    private String otherInfo;

    public Person(String firstName, String lastName, String education, String otherInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = education;
        this.otherInfo = otherInfo;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getEducation() {
        return education;
    }


    public String getOtherInfo() {
        return otherInfo;
    }

    public void displayInfo() {
        System.out.println("Ad:" + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Tehsil: " + education);
        System.out.println("Diger Melumatlar: " + otherInfo);
    }
}

