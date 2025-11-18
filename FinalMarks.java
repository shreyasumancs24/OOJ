import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        Internals[] ci = new Internals[n];
        External[] se = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i+1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internalMarks = new int[5];
            System.out.println("Enter 5 Internal Marks:");
            for (int j = 0; j < 5; j++)
                internalMarks[j] = sc.nextInt();

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE Marks:");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();

            ci[i] = new Internals(usn, name, sem, internalMarks);
            se[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\n----- FINAL MARKS OF STUDENTS -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\n" + ci[i].name + " (" + ci[i].usn + ")");
            System.out.println("Semester: " + ci[i].sem);

            for (int j = 0; j < 5; j++) {
                int finalMarks = ci[i].internalMarks[j] + (se[i].seeMarks[j] / 2);
                System.out.println("Course " + (j+1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}
