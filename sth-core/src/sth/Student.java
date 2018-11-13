package sth;
import sth.Person;
import Course;
import Discipline;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
  private Course _course;
  private List<Discipline> _disciplines;

  public Student(String name, int phoneNumber, Course course, List<Discipline> _disciplines) {
    super(name, phoneNumber);
    _course = course;
    _disciplines = disciplines;
  }
}
