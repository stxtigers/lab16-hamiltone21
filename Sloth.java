import java.util.*;

public class Sloth implements Animal{
  private static final int numberOfLimbs = 4;
  protected int location;
  private static int holder = -1;
  protected int instanceNumber;
  protected int weight;
  protected int length;
  protected int speed;
  int instance = 0;

public Sloth(){
  if(holder == -1){
    holder = 0;
    instanceNumber = 0;
  }else{
     instanceNumber ++;
  }
  location = 0;
  weight = 0;
  length = 0;
  speed = 1;
}

public String sound(){
  String str1 = "AAAAAAAH";
  return str1;
}

public void move(int numberOfSeconds){
  int movement = speed * numberOfSeconds;
  int newLocation = location + movement; 
  location = newLocation;
}

public String toString(){
    String str = "Sloth " + instanceNumber + ", location " + location; 
    return str;
 }
}