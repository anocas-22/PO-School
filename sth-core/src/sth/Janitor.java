package sth;
import sth.Person;
import Course;
import java.util.List;
import java.util.ArrayList;

public class Janitor extends Person {
  private List<Course> _courses;
  public Janitor(String name, int phoneNumber) {
    super(name, phoneNumber);
  }
}
