class Person {
    protected String name;
    protected int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void printInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
    }
}

class Student extends Person {
    private int studentNumber;
    private int score;
    private String major;

    public Student(String name, int age, int studentNumber, int score, String major) {
        super(name, age); 
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Nomor Induk Mahasiswa: " + studentNumber);
        System.out.println("Nilai: " + score);
        System.out.println("Jurusan: " + major);
    }

   
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mata Pelajaran: " + subject);
    }

   
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class FullTime extends Teacher {
    private int annualSalary;
    private String unit;

    public FullTime(String name, int age, String subject, int annualSalary, String unit) {
        super(name, age, subject);
        this.annualSalary = annualSalary;
        this.unit = unit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji Tahunan: " + annualSalary);
        System.out.println("Unit: " + unit);
    }

    
    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

class PartTime extends Teacher {
    private int hoursWorked;
    private int hourlyRate;

    public PartTime(String name, int age, String subject, int hoursWorked, int hourlyRate) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jam Kerja: " + hoursWorked);
        System.out.println("Gaji per Jam: " + hourlyRate);
        System.out.println("Total Gaji: " + calculateSalary());
    }

    
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}