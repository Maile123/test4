public class HelloWorld
{
    public static void main(String[] argv)
    {
        FirstClass fs=new FirstClass();
        fs.method();
    }
}
 
//HelloWorld file changes directly into master branch//

class FirstClass
{
    public void method()
    {
        System.out.println("Hello World ");
    }
}
