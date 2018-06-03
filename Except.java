import java.util.*;
class Except{
public static void main(String ar[]) {
Scanner sc=new Scanner(System.in);
String name=sc.next();

int marks=sc.nextInt();

MarkProcess mp=new MarkProcess();
try{mp.Validation(marks,name);
mp.result(marks,name);}
catch(Exception e){}


}

}

class IllegalMarkException extends Exception{
IllegalMarkException(){
System.out.println("Illegal mark");
}

}

class MarkProcess {

    void Validation(int mark,String name) throws IllegalMarkException{
    if (mark<0)
    throw new IllegalMarkException();

    }
void result(int marks,String name){
if (marks>=40)
    System.out.println(name+" Pass");
else
    System.out.println(name+" Fail");  }


}
