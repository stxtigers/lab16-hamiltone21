import java.util.*;

public class Squirrel implements Animal{
  private static final int numberOfLimbs = 4;
  private static int holder = -1;
  protected int location;
  protected int instanceNumber;
  protected int weight;
  protected int length;
  protected int speed;
  int instance = 0;

public Squirrel(){
  if(holder == -1){
    holder = 0;
    instanceNumber = 0;
  }else{
     instanceNumber ++;
  }
  location = 0;
  weight = 0;
  length = 0;
  speed = 4;
}

public String sound(){
  String str1 = "QWQWQWQWQ";
  return str1;
}

public void move(int numberOfSeconds){
  int movement = speed * numberOfSeconds;
  int newLocation = location + movement; 
  location = newLocation;
}

public String toString(){
    String str = "Squirrel " + instanceNumber + ", location " + location; 
    return str;
 }
}