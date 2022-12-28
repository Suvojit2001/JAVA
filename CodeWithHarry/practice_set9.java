package CodeWithHarry;
class cylinder{
   private int radius;
    private int height;
    public void setRadius(int r){radius = r;}
    public void setHeight(int h){height = h;}
    public int getRadius(){return radius;}
    public int getHeight(){return height;}
    public double Surfacearea(){
        return (2*(Math.PI)*radius*height)+(2*(Math.PI)*radius*radius);
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
   //Question 3
     cylinder(int r,int h){
        radius=r;
        height=h;
    }
}
public class practice_set9 {
    public static void main(String[] args) {
        //Question 1,3;
        cylinder cy= new cylinder(4,5);
//        cy.setHeight(5);
//        cy.setRadius(4);
        System.out.println("Height is");
        System.out.println(cy.getHeight());
        System.out.println("Radius is");
        System.out.println(cy.getRadius());
        //Question 2
        System.out.print("Surface area is : ");
        System.out.println(cy.Surfacearea());
        System.out.print("Volume is : ");
        System.out.println(cy.Volume());
    }
}
