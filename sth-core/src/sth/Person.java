package sth;

public class Person {
  private int _id;
  private String _name;
  private int _phoneNumber;

  public Person(String name, int phoneNumber) {
    _name = name;
    _phoneNumber = phoneNumber;
  }

  public int getID () { return _id; }

  public int getName () { return _name; }

  public void changePhoneNumber (int phoneNumber) {
    _phoneNumber = phoneNumber;
  }
}
