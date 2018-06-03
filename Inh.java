import java.util.*;


class Student{
    Scanner sc=new Scanner(System.in);

Student(){}

int rnum;int age;int marks;

String name;

void get()
{
    rnum=sc.nextInt();
    age=sc.nextInt();
    marks=sc.nextInt();
    name=sc.next();
                      }

void disp()
{
    System.out.println(rnum+" "+age+" "+marks+" "+name);
                                                          }

void findgrade()
{
    if (marks>=900)
        System.out.println("A");
    else if (marks<=900 && marks>=600)
        System.out.println("B");
    else
        System.out.println("C");

                                  }
                                               }

class OldStudent extends Student
{
    int year;
    void getdetails()
    {

    year=sc.nextInt();
                          }

void dispDetails()
{
    disp();
    System.out.println(year);
                                  }


}

class Inh
{
    public static void main(String ar[])
   {

        Student S=new Student();
        S.get();
        S.disp();

        OldStudent os=new OldStudent();
        os.getdetails();
        os.dispDetails();
        os.findgrade();
    }
}
