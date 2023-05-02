import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList ai=new ArrayList();
        ai.add("one ");
        ai.add("two");
        ai.add("three ");

for(Object o:ai)
{
    System.out.println(o);
}
System.out.println("merging");
    }
}