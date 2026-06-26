
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[10];
        Course[] courses = new Course[10];

        int studentCount = 0;
        int courseCount = 0;

        while (true) {

            System.out.println("\n===== Student Course Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Assign Course");
            System.out.println("4. Show Student Details");
            System.out.println("5. Show Course Details");
            System.out.println("6. Show All Students");
            System.out.println("7. Show All Courses");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID : ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Email : ");
                    String email = sc.nextLine();

                    System.out.print("Phone : ");
                    String phone = sc.nextLine();

                    System.out.print("College : ");
                    String college = sc.nextLine();

                    Student student = new Student(studentId, name, email, phone, college);

                    students[studentCount] = student;
                    studentCount++;

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    System.out.print("Course ID : ");
                    String courseId = sc.nextLine();

                    System.out.print("Course Name : ");
                    String courseName = sc.nextLine();

                    System.out.print("Duration : ");
                    String duration = sc.nextLine();

                    System.out.print("Trainer Name : ");
                    String trainer = sc.nextLine();

                    System.out.print("Fees : ");
                    double fees = sc.nextDouble();
                    sc.nextLine();

                    Course course = new Course(courseId, courseName, duration, trainer, fees);

                    courses[courseCount] = course;
                    courseCount++;

                    System.out.println("Course Added Successfully");
                    break;

                case 3:

                    if (studentCount == 0 || courseCount == 0) {
                        System.out.println("Please add Student and Course first.");
                        break;
                    }

                    System.out.println("Students");

                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(i + " : " + students[i].getName());
                    }

                    System.out.print("Select Student : ");
                    int studentIndex = sc.nextInt();

                    System.out.println("Courses");

                    for (int i = 0; i < courseCount; i++) {
                        System.out.println(i + " : " + courses[i].getCourseName());
                    }

                    System.out.print("Select Course : ");
                    int courseIndex = sc.nextInt();
                    sc.nextLine();

                    Student s = students[studentIndex];
                    Course c = courses[courseIndex];

                    s.setCourseName(c.getCourseName());

                    System.out.println("Course Assigned Successfully");

                    break;

                case 4:

                    System.out.print("Enter Student Number : ");
                    int studentNumber = sc.nextInt();
                    sc.nextLine();

                    Student s1 = students[studentNumber];
                    s1.showDetails();

                    break;

                case 5:

                    System.out.print("Enter Course Number : ");
                    int courseNumber = sc.nextInt();
                    sc.nextLine();

                    Course c1 = courses[courseNumber];
                    c1.showDetails();

                    break;

                case 6:

                    for (int i = 0; i < studentCount; i++) {

                        Student s2 = students[i];

                        System.out.println("\nStudent " + (i + 1));
                        s2.showDetails();
                    }

                    break;

                case 7:

                    for (int i = 0; i < courseCount; i++) {

                        Course c2 = courses[i];

                        System.out.println("\nCourse " + (i + 1));
                        c2.showDetails();
                    }

                    break;

                case 8:

                    System.out.println("Thank You");
                    return;

                default:

                    System.out.println("Invalid Choice");
         
            }
            sc.close();
        }
    }
}

