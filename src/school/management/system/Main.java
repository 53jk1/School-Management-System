package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kacper Bąk
 */
public class Main {
    public static void main(String[] args) {
        Teacher peter = new Teacher(1,"Peter Bird",5000);
        Teacher eva = new Teacher(2, "Eva Ball", 2650);
        Teacher andrew = new Teacher(3, "Andrew Baker", 2607);
        Teacher mark = new Teacher(4, "Mark White", 2790);
        Teacher rahim = new Teacher(5, "Rahim Brown", 4800);
        Teacher steve = new Teacher(6, "Steve Rogers", 4900);
        Teacher maeve = new Teacher(7,"Megan Newville", 3400);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(peter);
        teacherList.add(eva);
        teacherList.add(andrew);
        teacherList.add(mark);
        teacherList.add(rahim);
        teacherList.add(steve);

        Student casper = new Student(1,"Casper Mark", 4);
        Student jacob = new Student(2,"Jacob Bound",5);
        Student nevil = new Student(3,"Nevil Snake",3);
        Student tom = new Student(4,"Tom Bloom",12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(casper);
        studentList.add(jacob);
        studentList.add(nevil);
        studentList.add(tom);

        School ghs = new School(teacherList,studentList);

        ghs.addTeacher(maeve);

        casper.payFees(9000);
        jacob.payFees(9000);
        nevil.payFees(9000);
        tom.payFees(9000);

        System.out.println("=== MAKING SCHOOL PAY SALARY ===\n");

        System.out.println(casper);
        System.out.println(jacob);
        System.out.println(nevil);
        System.out.println(tom);

        andrew.receiveSalary(andrew.getSalary());
        mark.receiveSalary(mark.getSalary());
        rahim.receiveSalary(rahim.getSalary());
        steve.receiveSalary(steve.getSalary());
        maeve.receiveSalary(maeve.getSalary());

        System.out.println(andrew);
        System.out.println(mark);
        System.out.println(rahim);
        System.out.println(steve);
        System.out.println(maeve);

        /**
         * We have to combine it into one.
         */
        School.updateTotalMoneySpent(9000);
        School.getTotalMoneySpent(9000);

        System.out.println(ghs);

    }
}
