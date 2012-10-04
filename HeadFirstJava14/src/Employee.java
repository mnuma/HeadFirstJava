import java.io.Serializable;

public class Employee implements Serializable {

  String name;
  String email;

  public Employee(String name, String email){
    this.name = name;
    this.email = email;
  }

  public String getName(){
    return name;
  }

  public String getEmail(){
    return email;
  }
}