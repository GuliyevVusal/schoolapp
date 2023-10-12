package schoolApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolApplication schoolApp = new SchoolApplication();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Qeydiyyat Proqramina Xos gelmisiniz: 1-den 7-e qeder ecim edin: ");
            System.out.println("1) Muellim elave et: ");
            System.out.println("2) Telebe elave et: ");
            System.out.println("3) Muellimleri goster: ");
            System.out.println("4) Telebeleri goster: ");
            System.out.println("5) Muellim sil: ");
            System.out.println("6) Telebe sil: ");
            System.out.println("7) Cixis: ");
            System.out.print("Secim edin: ");
            System.out.print(">>>>>>>>>>>>>>>>>>  ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ad: ");
                    String teacherFirsName = sc.nextLine();
                    System.out.print("Soyad: ");
                    String teacherLastName = sc.nextLine();
                    System.out.print("Tehsil: ");
                    String teacherEducation = sc.nextLine();
                    System.out.print("Maas: ");
                    Integer teacherSalary = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Diger Melumat: ");
                    String teacherOtherInfo = sc.nextLine();
                    System.out.print("Is Tecrubesi: ");
                    Integer teacherExperience = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ixtisas: ");
                    String teacherQualification = sc.nextLine();
                    Teacher newTeacher = new Teacher(teacherFirsName, teacherLastName
                            , teacherEducation, teacherOtherInfo, teacherExperience
                            , teacherQualification, teacherSalary);
                    schoolApp.addTeacher(newTeacher);
                    System.out.println(teacherFirsName + " " + teacherLastName + ". adinda muellim elave edildi. ");
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    System.out.print("Ad: ");
                    String studentFirstName = sc.nextLine();
                    System.out.print("Soyad: ");
                    String studentLastName = sc.nextLine();
                    System.out.print("Tehsil: ");
                    String studentEducation = sc.nextLine();
                    System.out.print("Diger melumat: ");
                    String studentOtherInfo = sc.nextLine();
                    System.out.print("Yas: ");
                    Integer studentAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Telebe nomresi: ");
                    String studentNumber = sc.nextLine();
                    Student newStudent = new Student(studentFirstName,
                            studentLastName, studentEducation, studentOtherInfo, studentAge, studentNumber);
                    schoolApp.addStudent(newStudent);
                    System.out.println(studentFirstName + " " + studentLastName + ". adinda telebe elave edildi. ");
                    System.out.println("-------------------------------------------");
                    break;
                case 3:
                    schoolApp.displayTeachers();
                    break;
                case 4:
                    schoolApp.displayStudents();
                    break;
                case 5:
                    System.out.print("Silmek istediyiniz muellimin adini daxil edin: ");
                    String teacherToDelete = sc.nextLine();
                    String[] parts = teacherToDelete.split(" ");
                    if (parts.length == 2) {
                        schoolApp.deleteTeacher(parts[0], parts[1]);
                    } else {
                        System.out.print("Yalnis format !!  Ad soyadi bosluq ile ayrin. ");
                    }
                    break;
                case 6:
                    System.out.print("Silmek istediyiniz telebenin adini daxil edin: ");
                    String studentToDelete = sc.nextLine();
                    String[] studentParts = studentToDelete.split(" ");
                    if (studentParts.length == 2) {
                        schoolApp.deleteStudent(studentParts[0], studentParts[1]);
                    } else {
                        System.out.println("Yalnis format ! Ad ve soyadi bosluq ile ayirin. ");
                    }
                    break;
                case 7:
                    System.out.println("Proqramdan Cixilir.......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yalnis secim Etdiniz: (1/2/3/4/5/6/7/) arasi secim edin... ");
            }
        }

    }
}
