package TataStrive.Classwork.inheritance;

class Bank {
    public void loanInterest()
    {
        System.out.println("9% interest");
    }
}
class Sbi extends Bank
{
    public void sbiloan()
    {
        System.out.println("For SBI");
    }
}
class Hdfc extends Bank
{
    public void hdfcLoan()
    {
        System.out.println("For HDFC");
    }
}
class Axis extends Bank
{
    public void axisLoan()
    {
        System.out.println("For AXIS");
    }
}
public class HirarchicalInheritance {

    public static void main(String[] args) {
        Axis ax=new Axis();
        ax.loanInterest();
        ax.axisLoan();
        Hdfc hd=new Hdfc();
        hd.hdfcLoan();
        hd.loanInterest();
        Sbi sb=new Sbi();
        sb.loanInterest();
        sb.sbiloan();

    }
}
