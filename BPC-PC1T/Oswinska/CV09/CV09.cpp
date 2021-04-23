#include <iostream>
#include "ComplexMath.h"

int main()
{

	typOperace T;
	formatZobrazeni F = algebraicky;
	struct complex a;
	struct complex b;
	struct complex ans;
	int C;

	printf("Zadejte prvni komplexni cislo: ");
	scanf_s("%lf %lf", &a.real, &a.imag);
	printf("Zadejte druhe komplexni cislo: ");
	scanf_s("%lf %lf", &b.real, &b.imag);

	printf("Jakou operaci chcete provest: 1 soucet | 2 rozdil | 3 soucin : ");
	scanf_s("%d", &T);

	ans = operace(a, b, T);
	C = compare(a, b);
	printf("Hodnota porovnani cisel je: %d\n", C);



	switch (F)
	{
	case algebraicky:
		
		tisk(ans,F);
		F = geometricky;
	case geometricky:
		tisk(ans, F);
		break;
	}
}