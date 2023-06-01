#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

#define SIZE 30
int a[SIZE]; 
int n;
// Ham nhap n
void Nhapn(int &n)
{
	do
	{	cout << "Nhap n thao man n>=5 va n <=30 " <<endl;
	 	cin >>n;
	}
	while (n<5||n>30);	
}
//Ham nhap mang n phan tu
void NhapMang(int a[SIZE], int n)
{
		int i;
		cout<<"Nhap mang:"<<endl;
		for (i = 0; i<n; i++)
   	{	
   	
		cout<<"a["<< i << "]=";
   		cin>>a[i];
  	}
}
//Ham hien thi gia tri ca phan tu cua mang ra man hinh
void HienThiMang(int a[SIZE], int n)
{
int i;
cout<<"Mang vua nhap la:"; 	
for (i = 0; i<n; i++)
{
cout<<a[i]<<setw(5);
}
cout<<endl;
}
// Ham tim phan tu nho nhat trong mang
int min(int a[SIZE], int n){   
	int i, m = a[0];
  for (i = 1; i < n; i++) {
			if (m > a[i])
				m = a[i];
  }
  cout<<"Gia tri nho nhat la: "<<m<<setw(5)<<endl;
  return m;
}
//Ham tinh trung binh cong cac so am trong mang
void tbcSoAm(int a[SIZE],int n) {	
	int t = 0, d = 0, i;
  for (i = 0; i < n; i++)
		 if (a[i] < 0) {
			  t = t + a[i];
			  d++;
		 }
	if (d > 0)
    cout<<"TBC so am: " <<(float)t/d<<endl;
  else  cout<<"Mang khong co so am nao"<<endl;
}
// Ham chen phan tu co gia tri bang x vao vi tri thu k trong mang
void insert(int a[SIZE],int &n,int k,int x)
{
		int i;
		for (i = n-1; i >= k-1; i--){
			  a[i+1] = a[i];
		}
    a[k-1] = x;
	n = n+1;
}
//Ham xoa phan tu tai vi tri thu k trong mang
void removeElem(int a[SIZE], int &n, int k) {
int i;
for (i = k; i < n; i++){ 
			a[i-1] = a[i];     
	 }
	 n = n - 1;
}

int main()
{	int M,k,x,l;
	Nhapn(n);
	NhapMang(a,n);
	HienThiMang(a,n);
	M=min(a,n);
	tbcSoAm(a,n);
	cout<<"Nhap vi tri k can chen:";
	cin>>k;
	cout<<"Nhap gia tri cua so x can chen:";
	cin>>x;
	insert(a,n,k,x);
	HienThiMang(a,n);
	cout<<"Nhap vi tri l can xoa:";
	cin>>l;
	removeElem(a,n,l);
	HienThiMang(a,n);
	return 0;
}
