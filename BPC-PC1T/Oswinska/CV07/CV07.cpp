#include <iostream>
#include <stdio.h>
#include <math.h>
#include "Body2d.h"
#define POCET_BODU 10

int main()
{
	int body[POCET_BODU][2] = { 5,10,-14,2,45,4,-9,8,58,-3,47,5,-18,-86,75,7,-25,51,17,98 };
	
	int x = 0;
	int y = 0;
	double average = 0;
	int closest = 0;
	int max = 0;
	printf("Zadejte souradnice referencniho bodu: ");
	scanf_s("%d %d", &x, &y);
	printf("\nZadejte vzdalenost do ktere se max tiskou okolni body:");
	scanf_s("%d", &max);
	closest = indexNejblizsi(POCET_BODU, body, x, y);
	average = prumernaVzdalenost(POCET_BODU, body, x, y);
	if (closest != -1)
	{
		printf("nejblizsi bod je [%d] [%d] s indexem %d prumerna vzdalenost je %.2lf", body[closest][0], body[closest][1],closest, average);
		maxdistance(POCET_BODU, body, x, y, max);
		

	}

}