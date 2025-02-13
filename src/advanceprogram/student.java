package advanceprogram;

import java.util.regex.Pattern;

public class student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

  
    public student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

       
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21. Provided age: " + age);
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name must not contain numbers or special symbols. Provided name: " + name);
        }
    }

  
    private boolean isValidName(String name) {
        String regex = "^[A-Za-z ]+$";
        return Pattern.matches(regex, name);
    }

   
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
