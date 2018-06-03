
//Interface -----fully abstract class....class having only abstract methods
//used for generalization
//different implementation in different situations
//implements keyword for inheriting
//all methods will be public by default
//default access specifier gives access only inside the package
//variables declared inside will be static and final
//A class can implement multiple interfaces

/*
Package....group of classes
package keyword creates a package....
package keyword is used to say that following class should be stored in the directory specified
package <StorageLocation>
*/

/*
Exception....error thrown by the jre
Checked and unchecked exception
checkde exc are shown at compile time
unchecked exceptions are shown at runtime
try catch
try{}
catch(Exception e){}
keep the try block as small as possible coz control doesnt return to try
finally block should contain code that shud be executed in every case
single try can have multiple catch blocks
throws keyword throws exception to the calling function
throw keyword used to manually throw an exception
Object is the superclass of everything
Exceptions can be user defined also and are handled using throw


*/
import java.util.*;
interface Exam{
    boolean Pass(int mark);
}

interface Classify{
String Division(int average);
}

class Result implements Exam,Classify{

public boolean Pass(int mark){
if (mark>=50)
    return true;
    else
        return false;
}

public String Division(int average){
if (average>=60)
    return "First";
else if (50<=average && average<60)
    return "Second";
else
    return "No Division";

}




}

class Main{

public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
  Result r=new Result();

int m=sc.nextInt();
boolean b=r.Pass(m);
System.out.println(b);
int avg=sc.nextInt();
String s=r.Division(avg);
System.out.println(s);  }
}
