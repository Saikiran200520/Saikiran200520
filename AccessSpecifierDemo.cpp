#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    int privar;
    protected:
    int provar;
    public:
    int pubvar;
    void setvar(int proValue,int pubValue,int priValue){
        privar = priValue;
        provar = proValue;
        pubvar = pubValue;
    }
    void getvar(){
        cout<<" pubvar " << pubvar <<endl; 
        cout<<" provar " << provar <<endl; 
        cout<<" privar " << privar <<endl;
    }
};
int main(){
 AccessSpecifierDemo a;
 a.setvar(1,2,3);
 a.getvar();
 return 0;

}
