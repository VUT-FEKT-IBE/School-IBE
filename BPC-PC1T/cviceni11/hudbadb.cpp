#include "pch.h"
#include "hudbadb.h"

#include <stdlib.h>
#include <string.h>

void add(char * interpret,char* album, int rok, struct t_auto ** uk_prvni) // pridani auta
{
	struct t_auto * noveAuto; // ukazatel pro nove vkladane auto
	struct t_auto * aktAuto; // ukazatel na aktualni auto

	// alokace dynamicke promenne
	noveAuto = (struct t_auto *)malloc(sizeof(struct t_auto));

	strcpy_s(noveAuto->interpret, ZNACKA_SIZE, interpret); // naplneni struktury
	strcpy_s(noveAuto->album, ZNACKA_SIZE, album);
	noveAuto->rok = rok;
	noveAuto->dalsi = NULL;

	if (*uk_prvni == NULL) // linearni seznam je prazdny
	{
		*uk_prvni = noveAuto;
		return;
	}
	else if (strcmp(noveAuto->interpret, (*uk_prvni)->interpret)<=0) // vlozime na zacatek
	{
		noveAuto->dalsi = *uk_prvni;
		*uk_prvni = noveAuto;
		return;
	}

	aktAuto = *uk_prvni;
	while (aktAuto) // prochazeni seznamu
	{	
		if (aktAuto->dalsi == NULL) // jsme na poslednim aute
		{
			
				aktAuto->dalsi = noveAuto; // pridavame na konec
				return;
		}
		else if (strcmp(noveAuto->interpret, aktAuto->interpret) >= 0)
		{
			noveAuto->dalsi = aktAuto->dalsi; // vlozime za aktAuto
			aktAuto->dalsi = noveAuto;
			return;
		}
		aktAuto = aktAuto->dalsi; // posun na dalsi auto
	}
}

void del(char *interpret, struct t_auto ** uk_prvni)
{
	struct t_auto * aktAuto;

	while (*uk_prvni && strcmp((*uk_prvni)->interpret,interpret)==0)
	{
		struct t_auto * newPrvni = (*uk_prvni)->dalsi;
		free(*uk_prvni);  // uvolneni auta z pameti
		*uk_prvni = newPrvni;
	}

	aktAuto = *uk_prvni;
	while (aktAuto && aktAuto->dalsi) // prochazeni seznamu
	{
		if (strcmp(aktAuto->dalsi->interpret, interpret)==0) // auto je ke smazani
		{
			struct t_auto * newDalsi = aktAuto->dalsi->dalsi;
			free(aktAuto->dalsi);  // uvolneni auta z pameti
			aktAuto->dalsi = newDalsi;
		}
		aktAuto = aktAuto->dalsi; // posun na dalsi auto
	}
}