#include <iostream>
#include <stdio.h>
#include <math.h>
#include "Body2d.h"
#define POCET_BODU 10

int indexNejblizsi(int velikost, int(*poleBodu)[2], int referencniX, int referencniY) // Nejblizsi bod
{
	double odpoved[POCET_BODU];
	int distance = -1;
	double reference = DBL_MAX;
	for (int i = 0; i < POCET_BODU; i++)
	{
		double deltaX = 0 + poleBodu[i][0] - referencniX;
		double deltaY = 0 + poleBodu[i][1] - referencniY;
		odpoved[i] = sqrt(deltaX * deltaX + deltaY * deltaY);
		if (odpoved[i] < reference)
		{
			distance = i;
			reference = odpoved[i];
		}
	}
	return distance;
}
double prumernaVzdalenost(int velikost, int(*poleBodu)[2], int referencniX, int referencniY) // prumerna vzdalenost od bodu
{
	double distance;
	double  avrg_distance_A = 0;
	double avrg_distance_B = 0;
	int count = 0;

	for (int i = 0; i < velikost; i++)
	{
		distance = sqrt((referencniX - poleBodu[i][0]) * (referencniX - poleBodu[i][0]) + (referencniY - poleBodu[i][1]) * (referencniY - poleBodu[i][1]));
		avrg_distance_A = avrg_distance_A + distance;
		count++;
	}
	return avrg_distance_B = avrg_distance_A / count;
}


int maxdistance(int velikost, int(*poleBodu)[2], int referencniX, int referencniY, int max)
{
	double vzdalenost;


	int dst[POCET_BODU];

	for (int i = 0; i < velikost; i++)
	{
		vzdalenost = sqrt((referencniX - poleBodu[i][0]) * (referencniX - poleBodu[i][0]) + (referencniY - poleBodu[i][1]) * (referencniY - poleBodu[i][1]));
		if (vzdalenost < max)
		{
			dst[i] = 1;
			printf("\nbod v dane vzdalenosti s indexem %d je [%d][%d]", i, poleBodu[i][0], poleBodu[i][1]);

		}
		else if (vzdalenost > max)
		{
			dst[i] = 0;
		}
		else
		{
			
			return -1;
		}

	}

	return 0;


}