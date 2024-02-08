#include<iostream>
using namespace std;
int main()
{
    int a;
    float x,y;
    cout<<"enter two operands :";
    cin>>x>>y;
    cout<<"1.addition,2.substraction,3.multiplication, 4.division\n";
    cout<<"enter your choice";
    cin>>a;
    switch (a)
    {
        case 1:
            cout<<"addition of"<<x<<" and "<<y<<" is "<<x+y;
            break;
        case 2:
            cout<<"substraction of"<<x<<" and "<<y<<" is "<<x-y;
            break;
        case 3:
            cout<<"multiplication of"<<x<<" and "<<y<<" is "<<x*y;
            break;
        case 4:
            cout<<"division of" <<x<< " and " <<y<< " is "<<x/y;
            break;
        default:
            cout<<"error";
            break;
    }
    
}
