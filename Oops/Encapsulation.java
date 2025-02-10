package Oops;
class A{
    private String  name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this .name=newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge>0){
            this.age=newAge;
        }
        else{
            System.out.println("Invalid age!");
        }
    }
}
public class Encapsulation {
    public static void main(String args[]){
        A a=new A();
        a.setName("Lakshmi");
        a.setAge(20);
        System.out.println("A Name:" +a.getName());
        System.out.println("A Age:" +a.getAge());
    }
}
