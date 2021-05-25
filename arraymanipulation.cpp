#include<iostream>
#include<stdio.h>
#include<algorithm>
using namespace std;
int main(){
	 
	 long n,m,p,q,sum,max=0,x=0;
	 long int*a=new long int[n+1]();
	 cin>>n>>m;
	 for(int i=0;i<m;i++){
	 	cin>>p>>q>>sum;
	 	a[p-1]+=sum;
	 	if((q+1)<=n){
	 		a[q]-=sum;
		 }
	 	
	 }
	 
	 //for finding the max
	 for(int i=0;i<n;i++){
	 	x=x+a[i];
	 	if(max<x){
	 		max=x;
		 }
	 }
	 cout<<max;
	 
	 
	 
	 return 0;
}
