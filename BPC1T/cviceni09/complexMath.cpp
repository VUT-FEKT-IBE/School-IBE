#include "pch.h"
#include "complexMath.h"
#include <ctype.h>            
#include <stdlib.h>             
#include <string.h> 
#include <math.h>
#include <Windows.h>
#include <iostream>


struct complex operace(struct complex a, struct complex b, enum typOperace typ)
{
	struct complex cl;
	//struct complex x = (struct complex) a;
	//struct complex y = (struct complex) b;
	//addition
	if (typ == 1)
	{
		cl.real = a.real + b.real;
		cl.imag = a.imag + b.imag;
	}
	//subtraction
	else if (typ == 2)
	{
		cl.real = a.real - b.real;
		cl.imag = a.imag - b.imag;
	}
	//multiplication
	else if (typ == 3)
	{
		//(x1*x2-y1*y2)+ (x1*y2+ x2*y1)
		cl.real = (a.real*b.real)-(a.imag*b.imag);
		cl.imag = (a.real*b.imag)+(b.real*a.imag);

	}
	else if (typ == 4)
	{
		cl.real = (((a.real*b.real) + (a.imag*b.imag))/((b.real*b.real)+(b.imag*b.imag)));
		cl.imag = (((a.imag*b.real) - (a.real*b.imag))/((b.real*b.real)+(b.imag*b.imag)));
	}
	if (a.imag < 0 && b.imag < 0)
	{
		printf("yours input are %lf%lfj and %lf%lfj\n", a.real, a.imag, b.real, b.imag);
	}
	else if (a.imag < 0 && b.imag > 0)
	{
		printf("yours input are %lf%lfj and %lf+%lfj\n", a.real, a.imag, b.real, b.imag);
	}
	else if (a.imag > 0 && b.imag < 0)
	{
		printf("yours input are %lf+%lfj and %lf%lfj\n", a.real, a.imag, b.real, b.imag);
	}
	else
	{
		printf("yours input are %lf+%lfj and %lf+%lfj\n", a.real, a.imag, b.real, b.imag);
	}
	return cl;
}
void tisk(struct complex a, enum formatZobrazeni format)
{
	if (format == 0)
	{
		if (a.imag < 0)
		{
			printf("%.3lf%.3lfj\n", a.real, a.imag);
		}
		else
		{
			printf("%.3lf+%.3lfj\n", a.real, a.imag);
		}
	}
	else if (format == 1)
	{
		double r,u,v;
		r = sqrt(a.real*a.real + a.imag*a.imag);
		v = 180.0 / M_PI;
		u = atan(a.imag / a.real);
		u = u * v;
		if (u < 0)
		{
			u = 180 + u;
			printf("%.3lf*e^j%.0lfdeg\n", r, u);
		}
		else
		{
			printf("%.3lf*e^j%.0lfdeg\n", r, u);
		}
	}
}