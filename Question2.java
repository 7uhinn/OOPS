
class display{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=n;i++){  
     System.out.println(i);  
     try{  
      Thread.sleep(500);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class teacher extends Thread{  
display t;  
teacher(display t){  
this.t=t;
}  
public void run(){  
    System.out.println("teacher thread is running");
t.printTable(5);  
}  
  
}  
class student extends Thread{  
display t;  
student(display t){  
this.t=t;  
}  
public void run(){ 
    System.out.println("student thread is running");
t.printTable(5);  
}  
}  
class parents implements Runnable{
   display t;  
parents(display t){  
this.t=t;  
}  
public void run(){ 
    System.out.println("parents thread is running");
t.printTable(5);  
}   }
public class Question2{  
public static void main(String args[]){  
display obj = new display();//only one object  

student t1=new student(obj);
teacher t2=new teacher(obj); 
parents t3=new parents(obj);

t1.start();  
t2.start();
t3.run();
}  
} 