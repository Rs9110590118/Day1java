import java.util.Scanner;
class Biggest{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    if(a>b && a>c){
        System.out.println("A is small");
    }
    if(a<b && a<c){
        System.out.println("A is small");
    }
    if(b>a && b>c){
        System.out.println("B is big");
    }
    if(b<a && b<c){
        System.out.println("B is small");
    }
    if(c>b && c>a){
        System.out.println("c is big");

    }
    if(c<b && c<a){
        System.out.println("c is small");
    }

}
}