
package pack2;

import pack1.A;

class C extends A {
    public static void main(String[] args) {
        C obj = new C();

        System.out.println(obj.a);
        System.out.println(obj.b);
        // System.out.println(obj.c); // Error
        // System.out.println(obj.d); // Error
    }
}
