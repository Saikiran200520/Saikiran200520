import java.util.Scanner;
class student1{
    public 
        student1(){
            System.out.println("Hi! constructer has been created");
        }
        String fullName;
        int rollNum;
        double semPerentage;
        String collegeName;
        int collegeCode;
}
class student{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student1 sai=new student1();
        System.out.println("Enter your name :");
        sai.fullName=op.next();
        System.out.println("Enter your rollnumber :");
        sai.rollNum=op.nextInt();
        System.out.println("Enter your sempercantage :");
        sai.semPerentage=op.nextInt();
        System.out.println("Enter your collegename :");
        sai.collegeName=op.next();
        System.out.println("Enter your collegecode :");
        sai.collegeCode=op.nextInt();
        System.out.println("Name : "+sai.fullName+"\nRoll number : "+sai.rollNum+"\nSempercentage : "+sai.semPerentage+"\nCollegename : "+sai.collegeName+"\nCollegecode : "+sai.collegeCode);

    }
}
