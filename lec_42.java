class employee55{
    private int id;
    private String name;
    public employee55(){
        id=45;
        name="suvo";
    }                          //method overloading hoche ekhane tai same nam e 2to  constructer
    public employee55(String myname){
        id=0;
        name=myname;
    }
    public employee55(String myname, int myid){
    id=myid;
    name=myname;
}
    public employee55(String x,int ... arr){
        id=55;
        name="jijutsu";
    }
    public String getName(){return name;}
//    public void setName(String n){ name = n;}               // or this.name = n
//    public void setId(int i){ id=i; }
    public int getId(){ return id; }

   }
public class lec_42 {
    public static void main(String[] args) {
        employee55 emp =new employee55("suvojit chatterjee",45,4,445,1312);
//        emp.setName("suvojit");
//        emp.setId(54);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
