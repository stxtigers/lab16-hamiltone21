import java.util.*;

public class TechEmployee extends Employee{

  String qual;

  public TechEmployee(){
    super();
    qual = " ";
  }

  public void setQual(String ql){
    qual = ql;
  }

  public String getQual(){
    return qual;
  }

  public void setPayRate(double pr){
     payRate = pr * 2;
  }

  public String toString(){
    String str = "Employee: " + lastName + " has a pay rate of " + payRate + " and has the qualification of " + qual;
    return str; 
  }


}