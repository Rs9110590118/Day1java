import java.util.Scanner;
class Animal{
    int weight=100;
    String color="yellow";
    float height=4.2f;
void sound(){
    System.out.println("harsh sound");
}
void behaviour(){
    System.out.println("hunting");
}



}
class Lion{
    public static void main(String[] args){
      Animal a=new Animal();
      System.out.println(a.weight);
      System.out.println(a.color);
      System.out.println(a.height);
      a.sound();
      a.behaviour();



    }
}