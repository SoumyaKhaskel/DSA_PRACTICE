public class Oops {
    public static void main(String args[])
    {
         Animal tiger =new Animal();
         tiger.eat();
    }
}
class fish //inheritance demo
{
    void eat()
    {
        System.out.println("Eats ");
    }
    void breathe()
    {
        System.out.println("Breathes ");
    }
}
class Animal extends fish
{
    String color;

    void run()
    {
        System.out.println("runs");
    }
    
}