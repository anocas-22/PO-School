package sth;
import sth.Student;
import Discipline;
import java.util.List;
import java.util.ArrayList;

public class Course {
  private String _name;
  private List<Discipline> _disciplines;
  private List<Student> _students;
  private List<Student> _representatives;

  Course(String name, List<Discipline> disciplines, List<Student> students, List<Student> representatives) {
    _name = name;
    _disciplines = disciplines;
    _students = students;
    _representatives = representatives;
  }
}
