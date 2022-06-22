
class House {
    String address;
    String color;
    double are;
    void openDoor() {
    //Write code here
    }
    void closeDoor() {
    //Write code here
    }
   ...
   ...
}

public class Website {
 //fields (or instance variable)
 String webName;
 int webAge;
 // constructor
 Website(String name, int age){
 this.webName = name;
 this.webAge = age;
 }
 public static void main(String args[]){
 //Creating objects
 Website obj1 = new Website("beginnersbook", 5);
 Website obj2 = new Website("google", 18);
 //Accessing object data through reference
 System.out.println(obj1.webName+" "+obj1.webAge);
 System.out.println(obj2.webName+" "+obj2.webAge);
 }
}

beginnersbook 5
google 18

MyClass obj = new MyClass();

public class ConstructorExample {
 int age;
 String name;
 //Default constructor
 ConstructorExample(){
    this.name="Chaitanya";
    this.age=30;
 }
 //Parameterized constructor
 ConstructorExample(String n,int a){
    this.name=n;
    this.age=a;
 }
 public static void main(String args[]){
    ConstructorExample obj1 = new ConstructorExample();
    ConstructorExample obj2 =
    new ConstructorExample("Steve", 56);
    System.out.println(obj1.name+" "+obj1.age);
    System.out.println(obj2.name+" "+obj2.age);
 }
}

Chaitanya 30
Steve 56

class EmployeeCount
{
 private int numOfEmployees = 0;
 public void setNoOfEmployees (int count)
 {
    numOfEmployees = count;
 }
    public double getNoOfEmployees ()
 {
    return numOfEmployees;
 }
}
public class EncapsulationExample
{
 public static void main(String args[])
 {
    EmployeeCount obj = new EmployeeCount ();
    obj.setNoOfEmployees(5613);
    System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
 }
}

No Of Employees: 5613

class A extends B
{
}

class Teacher {
 String designation = "Teacher";
 String college = "Beginnersbook";
 void does(){
        System.out.println("Teaching");
 }
}
public class MathTeacher extends Teacher{
 String mainSubject = "Maths";
 public static void main(String args[]){
  MathTeacher obj = new MathTeacher();
  System.out.println(obj.college);
  System.out.println(obj.designation);
  System.out.println(obj.mainSubject);
  obj.does();
 }
}

Beginnersbook
Teacher
Maths
Teaching

public abstract class Animal{
 ...
 public abstract void animalSound();
}

public class Lion extends Animal{
...
 @Override
 public void animalSound(){
 System.out.println("Roar");
 }
}

public class Dog extends Animal{
...
 @Override
 public void animalSound(){
 System.out.println("Woof");
 }
}

class DisplayOverloading
{
 public void disp(char c)
 {
    System.out.println(c);
 }
 public void disp(char c, int num)
 {
    System.out.println(c + " "+num);
 }
}
public class ExampleOverloading
{
 public static void main(String args[])
 {
    DisplayOverloading obj = new DisplayOverloading();
    obj.disp('a');
    obj.disp('a',10);
 }
}

a
a 10

class Animal{
 public void animalSound(){
        System.out.println("Default Sound");
 }
}
public class Dog extends Animal{
 public void animalSound(){
        System.out.println("Woof");
 }
 public static void main(String args[]){
        Animal obj = new Dog();
        obj.animalSound();
 }
}

Woof

Animal obj = new Animal();
obj.animalSound();
// This would call the Animal class method
Dog obj = new Dog();
obj.animalSound();
// This would call the Dog class method
Animal obj = new Dog();
obj.animalSound();
// This would call the Dog class method

public class Vehicle{ }
public class Car extends Vehicle{
 private License myCarLicense;
}

abstract public void playInstrument();

abstract class A{
 abstract void myMethod();
 void anotherMethod(){
 //Does something
 }
}

//abstract class
abstract class Animal{
 //abstract method
 public abstract void animalSound();
}
public class Dog extends Animal{
 public void animalSound(){
        System.out.println("Woof");
 }
 public static void main(String args[]){
        Animal obj = new Dog();
        obj.animalSound();
 }
}

interface Animal {
 public void animalSound(); // interface method (does not have a body)
 public void sleep(); // interface method (does not have a body)
}
class Pig implements Animal {
 public void animalSound() {
  System.out.println("The pig says: wee wee");
 }
 public void sleep() {
  System.out.println("Zzz");
 }
}
class MyMainClass {
 public static void main(String[] args) {
  Pig myPig = new Pig();
  myPig.animalSound();
  myPig.sleep();
 }
}

class ClassName extends Superclass implements Interface1, Interface2, ....