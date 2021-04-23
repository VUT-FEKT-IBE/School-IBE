#include <iostream>
#include "ComplexMath.h"
#define M_PI 3.14159265358979323846

struct complex operace(struct complex a, struct complex b, enum typOperace typ)
{
	struct complex ans;

	if (typ == 1) // scitani
	{
		ans.real = a.real + b.real;
		ans.imag = a.imag + b.imag;
	}
	else if (typ == 2) // odcitani
	{
		ans.real = a.real - b.real;
		ans.imag = a.imag - b.imag;
	}
	else if (typ == 3) // nasobeni
	{
		ans.real = (a.real * b.real) - (a.imag * b.imag);
		ans.imag = (a.real * b.imag) + (a.imag * b.real);
	}
	return ans;
}

int compare(struct complex a, struct complex b)
{
	double AbsA;
	double AbsB;

	AbsA = sqrt((a.real) * (a.real) + (a.imag * a.imag));
	AbsB = sqrt((b.real * b.real) + (b.imag * b.imag));

	if (abs(AbsA) > abs(AbsB))
		return 1;
	if (abs(AbsA) < abs(AbsB))
		return -1;
	return 0;

}

void tisk(struct complex a, enum formatZobrazeni format)
{
	if (format == 0)
	{
		if (a.imag < 0)
		{
			printf("%.3lf %.3lfj		", a.real, a.imag);
		}
		else
		{
			printf("%.3lf + %.3lfj		", a.real, a.imag);
		}
	}
	if (format == 1)
	{
		double abs, phi, gon;
		abs = sqrt(a.real * a.real + a.imag * a.imag);
		gon = atan(a.imag / a.real);
		phi = gon * (180 / M_PI);

		if (phi < 0)
		{
			phi = 180 + phi;
			printf("%.3lf*e^j%.0lfdeg\n", abs, phi);
		}
		else
		{
			printf("%.3lf*e^j%.0lfdeg\n", abs, phi);
		}
	}
}
