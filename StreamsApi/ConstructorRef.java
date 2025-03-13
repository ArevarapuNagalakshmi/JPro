package StreamsApi;

import java.util.function.Supplier;
class Doctor {
    public Doctor() {

        System.out.println("Doctor Constructor");
    }
    /*public boolean hashcode(){

        return false;
    }*/
}


public class ConstructorRef {
    public static void main(String args[]){
        Supplier<Doctor>s=Doctor::new;
        s.get();
        //System.out.println(d.hashcode());
    }

}
