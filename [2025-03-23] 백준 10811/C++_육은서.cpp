#include <iostream>
#include <algorithm>
using namespace std; 

//오타, 괄호 확인

int main() {
	//입력 
    int bagu[101];
    int s;
    int N,M;
    cin>>N>>M;
    for(s=0;s<=N;s++){
    	bagu[s]=s;
    }
    
    //바구니 순서 바꾸기 
    int i,j;
    for(s=0;s<M;s++){
    	cin>>i>>j;
        //두번째 인자 전까지 리버스 
        reverse(bagu+i,bagu+j+1);
    }
    
    //출력 
    for(s=1;s<=N;s++){
    	cout<<bagu[s]<<' ';
    }
    return 0;
}
