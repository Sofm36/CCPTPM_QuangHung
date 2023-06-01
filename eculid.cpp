#include<bits/stdc++.h>

using namespace std;

void duLieuVao(int &a, int &b)
{
	do
	{
		cout<<"Nhap b > 0: ";
		cin>>b;
	}
	while( b < 0);
	
	do
	{
		cout<<"Nhap a >= b: ";
		cin>>a;
	}
	while( a < b);
}

void duLieuRa(int &d, int &x, int &y, int a, int b)
{
	int q,r;
	if(b == 0)
	{
		d = a;
		x = 1;
		y = 0;
	}
	else
	{
		int x2 = 1, x1 = 0, y2 = 0, y1 = 1;
		while(b > 0)
		{
			q = a / b;
			r = a - q*b;
			x = x2 - q*x1;
			y = y2 - q*y1;
			a = b;
			b = r;
			x2 = x1;
			x1 = x;
			y2 = y1;
			y1 = y; 
		}
		d = a;
		x = x2;
		y = y2;
	}
}

void show_kq(int x, int y, int d)
{
	cout<<"d: "<<d<<endl;
	cout<<"x: "<<x<<endl;
	cout<<"y: "<<y<<endl;
}

int main()
{
	int a,b,x,y,d;
	duLieuVao(a,b);
	duLieuRa(d,x,y,a,b);
	show_kq(x,y,d);
	return 0;
}
