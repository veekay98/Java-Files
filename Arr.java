import java.util.*;
class Arr{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
int a[];
a=new int[5];
try{
for(int i=0;i<5;i++)
a[i]=sc.nextInt();
int n=a.length;
for(int i=0;i<n;i++){
for(int j=0;j<n-1-i;j++){
if (a[j]<a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;}

}}

for(int i=0;i<10;i++)
    System.out.print(a[i]+" ");

}

catch(Exception e){
System.out.println("Out Of bound exception "+e);
}



}}
