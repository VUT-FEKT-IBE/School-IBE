#include <iostream>
#include<ctype.h>
#include "Header.h"

int pismena(char* ptr)
{
	int i = 0;
	int pocet = 0;
	while (ptr[i] != NULL)
	{
		if (isalpha(ptr[i]) != 0)
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
	while (ptr[i] != NULL)
	{
		if (isdigit(ptr[i]) != 0)
		{
			pocet++;
		}
		i++;
	}
	return pocet;
}

int slova(char* ptr)
{
	int i = 0;
	int pocet = 0, words = 0;
	while (ptr[i] != NULL)
	{
		i++;
	}
	words++;
	return words;
}

int vety(char* ptr)
{
	int i = 0;
	int tecka = 0;
	while (ptr[i] != NULL)
	{
			if (ptr[i] == '.')
			{
				tecka++;
			}
		i++;
	}
	return tecka;
}