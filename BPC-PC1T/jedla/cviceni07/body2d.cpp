#include "pch.h"
#include "Body2d.h"
#include <iostream>
#include <math.h>

int indexNejblizsi(int velikost, int(*poleBodu)[2], int referencniX, int referencniY)
{
	double help = INT_MAX;
	double distance;
	int index = 0;

	for (int i = 0; i < velikost; i++)
	{
		distance = sqrt((referencniX - poleBodu[i][0])*(referencniX - poleBodu[i][0]) + (referencniY - poleBodu[i][1])*(referencniY - poleBodu[i][1]));
		if (distance < help)
		{
			help = distance;
			index = i;
		}
		else if (distance > help)
		{
			help = help;
		}
		else
		{
			return -1;
		}
		
	}
	return index;
}
double prumernaVzdalenost(int velikost, int(*poleBodu)[2], int referencniX, int referencniY)
{
	double distance;
	double  avrg_distance_help = 0;
	double avrg_distance = 0;
	int counter = 0;

	for (int i = 0; i < velikost; i++)
	{
		distance = sqrt((referencniX - poleBodu[i][0])*(referencniX - poleBodu[i][0]) + (referencniY - poleBodu[i][1])*(referencniY - poleBodu[i][1]));
		avrg_distance_help = avrg_distance_help + distance;
		counter++;
	}
	return avrg_distance = avrg_distance_help / counter;
}

int indexNejvzdalenejsi(int velikost, int(*poleBodu)[2], int referencniX, int referencniY)
{
	double help = INT_MIN;
	double distance;
	int index = 0;

	for (int i = 0; i < velikost; i++)
	{
		distance = sqrt((referencniX - poleBodu[i][0])*(referencniX - poleBodu[i][0]) + (referencniY - poleBodu[i][1])*(referencniY - poleBodu[i][1]));
		if (distance > help)
		{
			help = distance;
			index = i;
		}
		else if (distance < help)
		{
			help = help;
		}
		else
		{
			return -1;
		}
		
	}
	return index;
}



