import java.util.Scanner;
class student3{
    public 
        String collegeName="MVGR";
        int collegeCode=33;
        student3(){
            System.out.println("Collegename : "+collegeName+"\nCollegecode : "+collegeCode);
        }
        student3(String fullName, double semPerentage){
            System.out.println("Name : "+fullName+"\nCollegecode : "+semPerentage);
        }
        String fullName;
        double semPercentage;

}
        class classstudent {
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student3 sai=new student3();
        System.out.print("Enter name");
        sai.fullName=op.next();
        System.out.print("Enter Sempercentage");
        sai.semPercentage=op.nextInt();
        op.close();
        student3 hi=new student3(sai.fullName,sai.semPercentage);

    }

}
