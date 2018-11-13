package sth;
import Person;
import Course;
import Discipline;
import java.util.List;
import java.util.ArrayList;
//FIXME import other classes if needed

import sth.exceptions.BadEntryException;
import sth.exceptions.InvalidCourseSelectionException;
import sth.exceptions.NoSuchPersonIdException;

/**
 * School implementation.
 */
public class School implements Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 201810051538L;

  //FIXME define object fields (attributes and, possibly, associations)
  //QUEREMOS INICIALIZAR JA AQUI OU NO CONSTRUCTOR?
  List<Person> _people = new ArrayList<Person>();
  List<Course> _courses = new ArrayList<Course>();
  List<Discipline> _disciplines = new ArrayList<Discipline>();

  //FIXME implement constructors if needed

  /**
   * @param filename
   * @throws BadEntryException
   * @throws IOException
   */
  void importFile(String filename) throws IOException, BadEntryException {
    //FIXME implement text file reader
  }

  //FIXME implement other methods

}
