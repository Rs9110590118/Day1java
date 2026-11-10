class Car{
String color;
void speed(int num){
    System.out.println("speed"+num);
}
}
class Main{
    public static void main(String[] args){
        Car bmw=new Car();
        Car rr=new Car();
        Car tesla=new Car();
        Car farrari=new Car();

        bmw.color="red";
        rr.color="black";
        tesla.color="white";
        farrari.color="blue";

    System.out.println(bmw.color);
    System.out.println(rr.color);
    System.out.println(tesla.color);
    System.out.println(farrari.color);
    bmw.speed(200);
    rr.speed(300);
    tesla.speed(400);
    farrari.speed(500);
    }

}