class People{
    String model="oneplus";
    String os="Android";
    int storagecapacity=164;
    void takephoto(){
        System.out.println("click photo captured");
    }
    void browserinternet(){
        System.out.println("loading website");
    }

}
class Smartphone{
    public static void main(String[]args){
        People p=new People();
        System.out.println(p.model);
        System.out.println(p.os);
        System.out.println(p.storagecapacity);
        p.takephoto();
        p.browserinternet();

    }


}