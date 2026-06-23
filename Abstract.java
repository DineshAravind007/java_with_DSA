abstract class abs {
    String s = "Hello World";
    abstract void display();
}

class Hello extends abs
{
    void display()
    {
        System.out.println(s);
    }
}
class Abstract{
    public static void main(String[] args){
        Hello h = new Hello();
        h.display();
    }
}
