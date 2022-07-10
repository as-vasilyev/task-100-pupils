import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;


class Student {
    String firstName;
    String lastName;
    int averageGrade;

    Student(){
        firstName = CapitalizedRandomName();
        lastName = CapitalizedRandomName();
    }

    private String CapitalizedRandomName()
    {
        String name = RandomStringUtils.randomAlphabetic(5, 10).toLowerCase();
        return StringUtils.capitalize(name);
    }

}
