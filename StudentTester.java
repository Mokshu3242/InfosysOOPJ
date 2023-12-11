public class StudentTester {
    private int studentID = 1001;
    public int getStudentID() {
        return studentID;
    }

    private String name = "jacob";
    public String getName() {
        return name;
    }

    private float qualifyingMarks = 80;
    public float getQualifyingMarks() {
        return qualifyingMarks;
    }

    private char residentialStatus = 'H';
    public char getResidentialStatus() {
        return residentialStatus;
    }

   private int yearOfEng = 3;
    public int getYearOfEng() {
        return yearOfEng;
    } 

    public static void main(String[] args) {
        StudentTester student = new StudentTester();
        int id = student.getStudentID();
        String name = student.getName();
        float qualifiedMarks = student.getQualifyingMarks();
        char residenceStatus = student.getResidentialStatus();
        int yearOf = student.getYearOfEng();

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Qualifying marks: " + qualifiedMarks);
        System.out.println("Year of Engineering: " + yearOf);
        System.out.println("Residential status: " + residenceStatus);
    }
}
