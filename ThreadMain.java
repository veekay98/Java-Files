class Thread1 extends Thread{


public void run(){
for(int i=1;i<=10;i++){
    int sum=0,temp=i;
    while(i>0){
        sum+=i;i--;
    }i=temp;
    System.out.println("Sum is "+sum);
}

}
}

class Thread2 extends Thread{


public void run(){
for(int i=1;i<=10;i++){
    int pro=1,temp=i;
    while(i>0){
        pro*=i;i--;
    }i=temp;
    System.out.println("Factorial is "+pro);
}

}
}








class ThreadMain{

public static void main(String ar[]){

Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();


}

}
