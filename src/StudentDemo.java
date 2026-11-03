import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentDemo {

    static Student[] students = new Student[10];

    public static void initialiseStudents() {
        students[0] = new FullTimeStudent("F001", "Clare", 6, 12000.75);
        students[1] = new PartTimeStudent("P001", "Nkosi", 5, 3500.50);
        students[2] = new FullTimeStudent("F003", "Mandla", 4, 8000);
        students[3] = new PartTimeStudent("P004", "Sbu", 8, 1500.99);
        students[4] = new FullTimeStudent("F005", "Khaya", 4, 10000.10);
        students[5] = new PartTimeStudent("P006", "Mohamed", 12, 4200);
        students[6] = new FullTimeStudent("F007", "Jordan", 5, 6000.25);
        students[7] = new PartTimeStudent("P008", "Lisa", 7, 750.75);
        students[8] = new FullTimeStudent("F009", "Natalie", 3, 14500);
        students[9] = new PartTimeStudent("P010", "Siya", 10, 9500.5);
    }

    public static void readFile() {
        try (Scanner scanner = new Scanner(new File("students.txt"))) {
            int index = 0;
            while (scanner.hasNextLine() && index < students.length) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split("[,\\s]+");
                String id = parts[0];
                String name = parts[1];
                int modulesCompleted = Integer.parseInt(parts[2]);
                double accountBalance = Double.parseDouble(parts[3]);

                if (id.startsWith("F")) {
                    students[index] = new FullTimeStudent(id, name, modulesCompleted, accountBalance);
                } else if (id.startsWith("P")) {
                    students[index] = new PartTimeStudent(id, name, modulesCompleted, accountBalance);
                }
                index++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void writeFile() {
        try (PrintWriter fullTimeWriter = new PrintWriter("full_time.txt");
             PrintWriter partTimeWriter = new PrintWriter("part_time.txt")) {

            for (Student student : students) {
                if (student != null) {
                    if (student instanceof FullTimeStudent) {
                        fullTimeWriter.println(student.makeReport());
                    } else if (student instanceof PartTimeStudent) {
                        partTimeWriter.println(student.makeReport());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentDemo.initialiseStudents();
        StudentDemo.writeFile();

        for (Student student : students) {
            if (student != null) {
                System.out.println(student.makeReport());
            }
        }
    }
}