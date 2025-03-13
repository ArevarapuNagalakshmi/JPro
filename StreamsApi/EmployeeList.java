package StreamsApi;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    int Id;
    int Age;
    String Name;
    double Salary;
    String Dept;
    String Gender;
    int Year;
    public Employee(int Id,int Age,String Name,double Salary,String Dept,String Gender,int Year){
        this.Id=Id;
        this.Age=Age;
        this.Name=Name;
        this.Salary=Salary;
        this.Dept=Dept;
        this.Gender=Gender;
        this.Year=Year;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String toString(){
        return "Id: " +Id+ ", Age: " +Age+  ", Name: " +Name+ ", Salary: " +Salary+ ", Dept: " +Dept+", Gender: " +Gender+ ", Year:"+Year;
    }
}

public class EmployeeList {
    public static void main(String args[]){
        List<Employee> l1= Arrays.asList(
                new Employee(101,20,"Sravani",45000,"IT","Female",2015),
                new Employee(102,10,"Gayithri",55000,"HR","Female",2020),
                new Employee(103,18,"Mani",35000,"Finance","Female",2002),
                new Employee(104,26,"Jyothi",65000,"HR","Female",2004),
                new Employee(105,21,"Mahi",85000,"IT","Female",2005),
                new Employee(106,21,"ravi",75000,"IT","Male",2003),
                new Employee(107,20,"hari",35000,"HR","Male",2006),
                new Employee(108,15,"Manu",75000,"IT","Male",2007));
        System.out.println("Seperate the male and females in employee table");
        Map<String,Long> genderCount= l1.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(genderCount);

        System.out.println("To get the data in department");
        List<String> Dept=l1.stream().map(Employee::getDept)
        .distinct().collect(Collectors.toList());
        System.out.println(Dept);

        System.out.println("Average age of males and Females");
        Map<String,Double>avg=l1.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(avg);

        System.out.println("To get the Heighest salary");
        Optional<Employee> HighesrSalary=l1.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(HighesrSalary);

       System.out.println("To get the Joining date");
        l1.stream().map(e->e.getYear()+ "-" +e.getName())
                .forEach(System.out::println);

    }

}
