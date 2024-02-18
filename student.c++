#include<iostream>
using namespace std;
class Student
{-
public:
string fullName;
int rollNum;
double semPerentage;
string collegeName;
int collegeCode;
Student()
{
cout<<"Student class initialized!!\n";
}
~Student(){}
};
int main()
{
Student sai;
cout<<"Enter your name : ";
getline(cin,sai.fullName);
cout<<"Enter your roll number : ";
cin>>sai.rollNum;
cout<<"Enter your sem percentage : ";
cin>>sai.semPerentage;
cout<<"Enter your college name : ";
cin>>sai.collegeName;
cout<<"Enter your college code : ";
cin>>sai.collegeCode;
cout<<"Name : "<<sai.fullName<<endl;
cout<<"RollNum : "<<sai.rollNum<<endl;
cout<<"SemPercentage : "<<sai.semPerentage<<endl;
cout<<"CollegeName : "<<sai.collegeName<<endl;
cout<<"CollegeCode : "<<sai.collegeCode<<endl;
return 0;
}
