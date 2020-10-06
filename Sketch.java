class Animal
{
void eat()
{
System.out.println("eating..");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("Barking");
}
}
class Cat extends Animal
{
void meow()
{
System.out.println("meowing..");
}
}
class Sktech
{
public static void main(String []args)
{
Cat C = new Cat();
C.meow(); 
C.eat();
}
}