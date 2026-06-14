//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Student ID : ");
//        int id = sc.nextInt();
//
//        StudentDAO dao = new StudentDAO();
//
//        Student s1 = dao.getStudent(id);
//
//        if (s1 != null) {
//
//            System.out.println("\nStudent Details");
//            System.out.println("---------------------");
//
//            System.out.println("ID      : " + s1.id);
//            System.out.println("Name    : " + s1.name);
//            System.out.println("Age     : " + s1.age);
//            System.out.println("Course  : " + s1.course);
//
//        } else {
//
//            System.out.println("Student not found!");
//
//        }
//
//        sc.close();
//    }
//}
public class Main {

    public static void main(String[] args) {

        new StudentGUI();

    }
}