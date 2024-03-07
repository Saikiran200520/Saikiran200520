import java.util.Scanner;
public class AccessSpecifierDemo {
    public
    int pubVar;
    protected
    int proVar;
    private
    int priVar;
    public
    void setVar(int priValue,int proValue, int pubValue){
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    void getVar(){
        System.out.println("private variable = "+priVar);
        System.out.println("protected variable = "+proVar);
        System.out.println("public variable = "+pubVar);
    }
};
class object{
    public static void main(String[] args){

        AccessSpecifierDemo obj=new AccessSpecifierDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of private variable");
        int priValue=sc.nextInt();
        System.out.println("Enter the value of protected variable");
        int proValue=sc.nextInt();
        System.out.println("Enter the value of public variable");
        int pubValue=sc.nextInt();
        obj.setVar(priValue,proValue,pubValue);
        obj.getVar();
        sc.close();
    }
}
