package sth;
import sth.Person;
import Course;
import Discipline;
import java.util.List;
import java.util.ArrayList;

public class Professor extends Person {
  private List<Course> _courses;
  private List<Discipline> _disciplines;
  public Professor(String name, int phoneNumber) {
    super(name, phoneNumber);
  }
}
