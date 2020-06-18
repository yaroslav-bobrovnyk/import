package lambda_hw;

import java.util.function.BiPredicate;

public class Predicates2 {
    String name;
    public static void main(String[] args) {
        String string1="Anton";
        String string2="Yaroslav";
        Car car1=new Car("Mazda",400000);
        Car car2=new Car("Jeep",390000);
        Employee employee1 =new Employee("David", 35000);
        Employee employee2 = new Employee("John", 50000);
        String longer = betterEntry(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = betterEntry(string1, string2, (s1,s2) -> true);
        System.out.println("Longer string: "+longer);
        System.out.println("First: "+first);
        Car car = betterElement(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice());
        Employee employee = betterElement(employee1, employee2, (e1, e2) -> e1.getSalary() > e2.getSalary());
        System.out.println(car.name+" cost: "+ car.getPrice());
        System.out.println(employee.name+" earns: "+employee.getSalary());
    }

    static String betterEntry(String string1, String string2, BiPredicate<String,String> predicate){
        if (predicate.test(string1,string2)){
            return string1;
        }
        return string2;
    }
    static Car betterElement(Car car1, Car car2, BiPredicate<Car,Car> predicate){
        if (predicate.test(car1,car2)){
            return car1;
        }
        return car2;
    }
    static Employee betterElement(Employee employee1, Employee employee2, BiPredicate<Employee,Employee> predicate){
        if (predicate.test(employee1,employee2)){
            return employee1;
        }
        return employee2;
    }
}

class Car extends Predicates2{
    private int price;
    Car(String name,int price){
        this.name=name;
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
}

class Employee extends Predicates2{
    private int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}
