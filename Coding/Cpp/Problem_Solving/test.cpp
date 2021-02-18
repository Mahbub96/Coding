#include <iostream>

using namespace std;

int main(){
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if(j == 2) break;
            cout << " a";
        }
        cout << endl;
        
    }
    

    return 0;
}