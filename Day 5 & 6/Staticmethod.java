@FunctionalInterface
interface Interf
{
    public void m1();
    default void m2()
    {
        System.out.println("Default method");
    }
    static void m3()
    {
        System.out.println("Static method");
    }
}
class Staticmethod
{
    public static void main(String[] args) {
        Interf dis = () -> System.out.println("Hello");
        dis.m1();
        Interf.m3();
        dis.m2();
    }
}