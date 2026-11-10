class Manager{
    String name="ruchitha";
    int id=101;
    double salary=50000;
    void work(){
        System.out.println("employee is writing code");
    }
    void bonus(){
        System.out.println("employee got double bonus");
    }

}
class Employee{
    public static void main(String[]args){
        Manager m=new Manager();
        System.out.println(m.name);
        System.out.println(m.id);
        System.out.println(m.salary);
        m.work();
        m.bonus();

    }

}