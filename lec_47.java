class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a=a;           //if i dont give this.a then it will give 0 as output so use this.
    }
    public int returnone(){
        return 1;
    }
}
public class lec_47 {
    public static void main(String[] args) {
        EkClass ek=new EkClass(5);
        System.out.println(ek.getA());

    }
}
