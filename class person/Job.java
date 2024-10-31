import java.util.Scanner;

public class Job {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Teacher / Student");
        System.out.println("1 Teacher");
        System.out.println("2 Student");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("Anda memilih Teacher");
                System.out.print("Masukkan nama: ");
                String teacherName = scanner.nextLine();
                System.out.print("Masukkan usia: ");
                int teacherAge = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Masukkan mata pelajaran: ");
                String subject = scanner.nextLine();

                System.out.println("Pilih tipe guru:");
                System.out.println("1 FullTime");
                System.out.println("2 PartTime");
                int teacherType = scanner.nextInt();
                scanner.nextLine(); 
                if (teacherType == 1) {
                    System.out.print("Masukkan gaji tahunan: ");
                    int annualSalary = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan unit: ");
                    String unit = scanner.nextLine();

                    FullTime fullTimeTeacher = new FullTime(teacherName, teacherAge, subject, annualSalary, unit);
                    fullTimeTeacher.printInfo();
                } else if (teacherType == 2) {
                    System.out.print("Masukkan jam kerja per minggu: ");
                    int hoursPerWeek = scanner.nextInt();
                    System.out.print("Masukkan bayaran per jam: ");
                    int hourlyRate = scanner.nextInt();
                    scanner.nextLine(); 

                    PartTime partTimeTeacher = new PartTime(teacherName, teacherAge, subject, hoursPerWeek, hourlyRate);
                    partTimeTeacher.printInfo();
                } else {
                    System.out.println("Pilihan tidak valid");
                }
                break;

            case 2:
                System.out.println("Anda memilih Student");
                System.out.print("Masukkan nama: ");
                String studentName = scanner.nextLine();
                System.out.print("Masukkan usia: ");
                int studentAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan nomor induk mahasiswa: ");
                int studentNumber = scanner.nextInt();
                System.out.print("Masukkan nilai: ");
                int score = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Masukkan jurusan: ");
                String major = scanner.nextLine();

                Student student = new Student(studentName, studentAge, studentNumber, score, major);
                student.printInfo();
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}