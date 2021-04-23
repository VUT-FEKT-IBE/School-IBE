#include <iostream>
#include<ctype.h>

int pismena(char* ptr)
{
	int i = 0;
	int pocet = 0;
	while (ptr[i] != NULL )
	{
		if (isalpha (ptr[i]) != 0)
		{
			pocet++;
		}
		i++;
	}
	return pocet;
}

int cisla(char* ptr)
{
	int i = 0;
	int pocet = 0;
	while (ptr[i] != NULL )
	{
		if (isdigit(ptr[i]) != 0)
		{
			pocet++;
		}
			i++;
	}
	return pocet;
}

int main()
{
	char text[] = ("Toto jsou 2 vzorove vety, ktere budou zpracovavany Vasemi funkcemi.Auto Hyundai ix35 ma pres 120 konskych sil.");
	char* ptr = text;

	printf("V textu je %d pismen", pismena(text));
	printf("\nV textu je %d cisel", cisla(text));
}