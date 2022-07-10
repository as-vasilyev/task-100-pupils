import java.util.Random;
import java.util.List;

public class Class extends Student {
    static Random random = new Random();

    static int classSize = random.ints(15,30).findFirst().getAsInt();
    public static void generateClass(List<Student> students)
    {


        for (int i = 0; i < classSize; i++) {
           Student student = new Student();
           student.averageGrade = random.nextInt(10);
           students.add(student);
           //System.out.printf("Student: %s %s. Average grade: %d %n", student.firstName, student.lastName, student.averageGrade);
        }
    }

    public static void getClassAverageGrade(List<Student> students){
        int gradesSum = 0;
        for (Student student: students) {
            gradesSum += student.averageGrade;
        }
        int average = gradesSum / classSize;
        System.out.printf("The average class grade: %d", average);
    }
}
