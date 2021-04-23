#include <iostream>
#include "xplagiat00.h"

int main()
{
	double vysl_zacatek;
	double vysl_konec;
	double x1, x2, y1, y2;
	int p;
	
	printf("Zadejte intervaly u kterych chcete vyhodnotit prunik. Pro desetinnou carku vyuzivejte tecku\nZadejte prvni clen prvniho intervalu: ");
	scanf_s("%lf", &x1);
	printf("Zadejte druhy clen prvniho intervalu: ");
	scanf_s("%lf", &y1);
	printf("Zadejte prvni clen druheho intervalu: ");
	scanf_s("%lf", &x2);
	printf("Zadejte druhy clen druheho intervalu: ");
	scanf_s("%lf", &y2);
	p = prunik(x1, y1, x2, y2, &vysl_zacatek, &vysl_konec);

	if (x1 == x2 && p == 1)
	{
		if (y1 == y2)
		{
			printf("[%.2lf,%.2lf]", vysl_zacatek, vysl_konec);

		}
		else
		{
			printf("[%.2lf,%.2lf]", vysl_zacatek, vysl_konec);

		}

	}
	else if (p == 1 && y1 == x2)
	{
		printf("[%2.lf,%.2lf]", vysl_zacatek, vysl_konec);
	
	}
	else if (p == 1)
	{
		if (y1 == y2)
		{
			printf("[%.2lf,%.2lf]", vysl_zacatek, vysl_konec);
		
		}
		else
		{
			printf("[%.2lf,%.2lf]", vysl_zacatek, vysl_konec);
			
		}
	}
	else if (p == 0)
	{
		printf("Mezi intervaly neni prunik");
		
	}



}