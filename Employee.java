import java.util.*;

public class Employee{

  String lastName;
  double payRate;
  String qual;
  private static int holder = -1;
  static int count = 0;

  public Employee(){
    if(holder == -1){
    holder = 0;
    count = 1;
  }else{
     count ++;
  }
    lastName = " ";
    payRate = 0.0;
  }
  
  public void setLastName(String name){
    lastName = name;
  }

  public String getLastName(){
    return lastName;
  }

  public void setPayRate(double pr){
     payRate = pr;
  }

  public double getPayRate(){
    return payRate;
  }
  
  public void setQual(String ql){
    qual = ql;
  }

  public String getQual(){
    return qual;
  } 

  public static int getCount(){
    return count;
  }

  public String toString(){
    String str = "Employee: " + lastName + " has a pay rate of " + payRate;
    return str; 
  }
}
