package pw.skills.OOps;

public class Entity {
    static int a;
    int c;
    final int b=10;
    public static class Car{
        String name;
        int price;;
        String type;

    }

    public static void main(String[] args) {
        class Student{
            String name;
            int rollno;
            double percent;

        }
        Car c=new Car();
        c.name="Audy";
        c.price=40000000;
        c.type="racing";
        System.out.println(c.name);

        Entity en=new Entity();
        System.out.println(en.c);
        System.out.println(en.a);
    }
}
