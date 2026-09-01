import java.util.Scanner;
class vote{
    public static void main(String arga[]){
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.println("enter your age");
    age=sc.nextInt();
    if(age>=18){
        System.out.println("you are elligible for vote");
    }    
    else{
        System.out.println("you are not elligible for vote");
    }
    }
    
}