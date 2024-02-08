#include<iostream>
using namespace std;
void evenodd(int);
int main()
{
    int n;
    cout<<"enter number to check even or odd : ";
    cin>>n;
    evenodd(n);
    return 0;
}
void evenodd(int a)
{
    if(a%2==0)
        cout<<"the number "<<a<<" is even";
    else 
        cout<<"the number "<<a<<" is odd";
}
