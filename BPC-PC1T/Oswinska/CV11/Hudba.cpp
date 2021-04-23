#include <iostream>
#include "Header.h"

void add(char* Interpret, char* Album, int rok, struct t_Hudba** uk_prvni) 
{
	struct t_Hudba* novaHudba; 
	struct t_Hudba* aktHudba; 

	novaHudba = (struct t_Hudba*)malloc(sizeof(struct t_Hudba));

	strcpy_s(novaHudba->Interpret, SIZE, Interpret); 
	strcpy_s(novaHudba->Album, SIZE, Album);
	novaHudba->rok = rok;
	novaHudba->dalsi = NULL;

	if (*uk_prvni == NULL) 
	{
		*uk_prvni = novaHudba;
		return;
	}
	else if (strcmp(novaHudba->Interpret, (*uk_prvni)->Interpret) < 0  )
	{
		novaHudba->dalsi = *uk_prvni;
		*uk_prvni = novaHudba;
		return;
	}

	aktHudba = *uk_prvni;
	while (aktHudba)
	{
		if (aktHudba->dalsi == NULL)
		{
			aktHudba->dalsi = novaHudba; 
			return;
		}
		else if (strcmp(aktHudba->Interpret, aktHudba->dalsi->Interpret) < 0)
		{
			novaHudba->dalsi = aktHudba->dalsi; 
			aktHudba->dalsi = novaHudba;
			return;
		}
		aktHudba = aktHudba->dalsi;
	}
}

void del(char *Interpret, struct t_Hudba** uk_prvni)
{
	struct t_Hudba* aktHudba;

	while (*uk_prvni && strcmp((*uk_prvni)->Interpret, Interpret) == 0)
	{
		struct t_Hudba* newPrvni = (*uk_prvni)->dalsi;
		free(*uk_prvni); 
		*uk_prvni = newPrvni;
	}
	aktHudba = *uk_prvni;
	while (aktHudba && aktHudba->dalsi) 
	{
		if (strcmp(aktHudba->dalsi->Interpret, Interpret) == 0) 
		{
			struct t_Hudba* newDalsi = aktHudba->dalsi->dalsi;
			free(aktHudba->dalsi);
			aktHudba->dalsi = newDalsi;
		}
		aktHudba = aktHudba->dalsi;
	}
}