import java.util.Scanner;

class Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        char ch=sc.next().charAt(0);
        int ascii=ch;
        System.out.println(ascii);
    }
}