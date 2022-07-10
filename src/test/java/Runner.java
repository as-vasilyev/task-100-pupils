import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] str) {
        List<Student> students = new ArrayList<>();
        Class.generateClass(students);
        Class.getClassAverageGrade(students);
    }
}
