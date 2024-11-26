import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Demo extends Thread{
    @Override
    public void run(){
        Thread t = Thread.currentThread();
        String s = t.getName();
        if(s.equals("PrintChars")){
            printChars();
        }
        else if(s.equals("printNumber")){
            printNumbers();
        }
        else{
            printAdding();
        }
    }
    public void printChars(){
        try{
        for(int i=65;i<=76;i++){
            System.out.println((char)i);
            Thread.sleep(3000);
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void printNumbers(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(3000);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void printAdding(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number1: ");
            int a = sc.nextInt();
            System.out.println("Enter a number2: ");
            int b = sc.nextInt();
            System.out.print(a+b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Main{
    public static void main(String [] args){
        Demo d1 = new Demo();
        Demo d2  = new Demo();
        Demo d3 = new Demo();
        d1.setName("PrintChars");
        d2.setName("printNumber");
        d3.setName("Adding");
        d1.start();
        d2.start();
        d3.start();
    }
}
