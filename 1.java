import java.util.*;


class Student{
    Scanner sc=new Scanner(System.in);
Student(){}
int rnum;int age;int marks;
String name;
void get(){
rnum=sc.nextInt();
age=sc.nextInt();
marks=sc.nextInt();
name=sc.next();
}

void disp(){
System.out.println(rnum+" "+age+" "+marks+" "+name);}

void findgrade(){


}
}

class OldStudent extends Student{
int year;
void getdetails(){
get();
year=sc.nextInt();
}

void dispDetails(){
disp();
System.out.println(year);}


}

class Inh{
public static void main(String ar[]){

Student S=new Student();
S.get();
S.disp();

OldStudent os=new OldStudent();
os.getdetails();
os.dispDetails();
}}
