
package pack1;

public class A {
    public int a = 10;
    protected int b = 20;
    int c = 30;          // default access
    private int d = 40;

    public void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
