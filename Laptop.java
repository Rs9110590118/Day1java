class Computer{
    String brand="hp";
    int ramsize=16;
    double price=70000;
    void bootup(){
    System.out.println("laptop is starting");
}

}
 class Laptop{
    public static void main(String[]args){
     Computer c=new Computer();
     System.out.println(c.brand);
     System.out.println(c.ramsize);
     System.out.println(c.price);
     c.bootup();
    }

}