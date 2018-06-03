import java.util.*;

abstract class Employee{
Scanner sc=new Scanner(System.in);
float salary=sc.nextFloat();
float years=sc.nextFloat();

abstract void calc();


}

class sub extends Employee{

void calc(){

double sal=salary+years/100.0*salary;
System.out.println("New salary is "+sal);}

}

class sub2 extends sub{

public static void main(String ar[]){
sub2 ding=new sub2();
ding.calc();

}

}
