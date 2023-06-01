#include<bits/stdc++.h>

using namespace std;

void duLieuVao(int &a, int &n)
{
	cout<<"Nhap a: ";
	cin>>a;
	cout<<"Nhap n: ";
	cin>>n;
}

void duLieuRa(int &d, int &x, int &y, int a, int n)
{
	int q,r;
	if(n == 0)
	{
		d = a;
		x = 1;
		y = 0;
	}
	else
	{
		int x2 = 1, x1 = 0, y2 = 0, y1 = 1;
		while(n > 0)
		{
			q = a / n;
			r = a - q*n;
			x = x2 - q*x1;
			y = y2 - q*y1;
			a = n;
			n = r;
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

int kt_NghichDao(int d, int x)
{
	if(d > 1) return 0;
	else return x;
}

int mod_SoAm(int hieu, int n)
{
	int lamtron = abs(hieu) / (double) n;
	return hieu - ceil(lamtron)*n;
}

int tinh_NghichDao(int a, int n)
{
	int r0 = n, r1 = a, r2, q, t0 = 0,t1 = 1,hieu;
	
	q = r0 / r1;
	r2 = r0 % r1;
	if(r2 == 0)
	{
		if(r1 == 1)
		{
			return t1;
		}
		else
		{
			return 0;
		}
	}
	else
	{
		while(r2 != 0)
		{
			r0 = r1;
			r1 = r2;
			q = r0 / r1;
			r2 = r0 % r1;
			t0 = t1;
			hieu = t0 - q*t1;
			if(hieu > 0)
			{
				t1 = hieu % n;
			}
			else
			{
				t1 = mod_SoAm(hieu,n);
			}
		}
		return t1;
	}
}

int main()
{
	int a,n,d,x,y;
	duLieuVao(a,n);
	duLieuRa(d,x,y,a,n);
	int nghichdao = tinh_NghichDao(a,n);
	cout<<"so nghich dao: "<<nghichdao<<endl;
	return 0;
}
