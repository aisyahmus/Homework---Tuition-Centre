import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.print ("1 - TEACHERS || 2 - STUDENTS ----> ");
        int choice = in.nextInt ();

        if (choice == 1) {
            System.out.print("How many teachers? --> ");
            int tc = in.nextInt();

            Teacher[] teach = new Teacher[tc];

            for (int i = 0; i < tc; i++) {
                System.out.print("Tutor #" + (i + 1));
                System.out.print("\nName of tutor: ");
                String name = in.next();
                System.out.print("Identification Number XXXXXX-XX-XXXX: ");
                String IC = in.next();
                System.out.print("Address: ");
                String address = in.next();
                System.out.print("Qualifications? PMR / SPM / FOUNDATION / DEGREE / OTHER --> ");
                String qualifications = in.next();
                if (qualifications.equalsIgnoreCase("other")) {
                    System.out.print("State OTHER: ");
                    String other = in.next();
                }
                System.out.print("Years of experience: ");
                int experience = in.nextInt();
                System.out.print("Date joined DD/MM/YY: ");
                String startDate = in.next();

                teach[i] = new Teacher(name, IC, address, qualifications, experience, startDate);
            }
            System.out.print("Do you want to see the list name of the tutors? Y-Yes, N-No: ");
            char c = in.next().charAt(0);
            if (c == 'Y') {
                for (int i = 0; i < tc; i++) {
                    System.out.println("/n");
                    System.out.println("Tutor #" + (i+1));
                    System.out.println(teach[i].name);
                    System.out.println("IC: " + teach[i].IC);
                    System.out.println("Address: " + teach[i].address);
                    System.out.println("Qualifications: " + teach[i].qualification);
                    System.out.println("Experience: " + teach[i].experience);
                    System.out.println("Start Date: " + teach[i].startDate);
                }
            }


        }
        else if (choice == 2)
        {
            System.out.print ("How many students? --> ");
            int std = in.nextInt();

            Student study[] = new Student [std];

            for (int i = 0; i < std; i++)
            {
                System.out.print("Student #" + (i + 1));
                System.out.print ("\nName: ");
                String name = in.next();
                System.out.print ("Identification Number XXXXXX-XX-XXXX: ");
                String IC = in.next();
                System.out.print ("Address: ");
                String address = in.next();
                System.out.print ("Year: ");
                int year = in.nextInt();
                System.out.print ("School Name: ");
                String schoolName = in.next();

                study[i] = new Student (name, IC, address, year, schoolName);
            }
            System.out.print("Do you want to see the list name of the students? Y-Yes, N-No: ");
            char c = in.next().charAt(0);
            if (c == 'Y') {
                for (int i = 0; i < std; i++) {
                    System.out.println("/n");
                    System.out.println("Student #" + (i+1));
                    System.out.println(study[i].name);
                    System.out.println(study[i].IC);
                    System.out.println(study[i].address);
                    System.out.println(study[i].year);
                    System.out.println(study[i].schoolName);

                }
            }


        }

    }
}
