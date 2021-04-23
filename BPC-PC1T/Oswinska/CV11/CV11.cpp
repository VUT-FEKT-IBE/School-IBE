#include<iostream>
#include "Header.h"

struct t_Hudba* prvni = NULL; 

void OnAdd()
{
	char my_Interpret[SIZE];
	char my_Album[SIZE];
	int my_year;

	printf("\nInterpet : ");        
	scanf_s("%s", my_Interpret, SIZE);
	while (getchar() != '\n');
	printf("\nAlbum : ");         
	scanf_s("%s", my_Album, SIZE);
	while (getchar() != '\n');
	printf("\nRok : ");
	scanf_s("%d", &my_year);
	while (getchar() != '\n');
	add(my_Interpret,my_Album, my_year, &prvni); 
}

void OnDel()
{
	char my_Interpret[SIZE];

	printf("\nInterpret : ");
	scanf_s(" %s", &my_Interpret, SIZE);
	while (getchar() != '\n');
	del(my_Interpret, &prvni);       
}

void ShowHudba()
{
	struct t_Hudba* aktHudba = prvni;
	printf("\n\n");

	char pismeno[10];
	printf("Zadejte prvni pismeno Interpreta: ");
	scanf_s("%s", pismeno, 10);
	while (getchar() != '\n');
	


	while (aktHudba)
	{
		char* interpret = aktHudba->Interpret;
		if (interpret[0] == pismeno[0])
		{
			printf(" %s %s %d\n", aktHudba->Interpret, aktHudba->Album, aktHudba->rok);
		
		}
		aktHudba = aktHudba->dalsi;
	}
	getchar();
	
	/*while (aktHudba) 
	{
		printf(" %s %s %d\n", aktHudba->Interpret, aktHudba->Album, aktHudba->rok);
		aktHudba = aktHudba->dalsi;
	}
	getchar();
	*/
	
	
}

int main()
{
	char  cmd;

	do
	{
		system("cls");
		printf("A: Pridat     ");
		printf("D: Smazat     ");
		printf("P: Tisk     ");
		printf("Q: Konec\n\n");
		cmd = tolower(getchar());
		while (getchar() != '\n');
		switch (cmd)
		{
		case 'a':
			OnAdd();
			break;
		case 'd':
			OnDel();
			break;
		case 'p':
			ShowHudba();
			break;
		}
	} 
	while (cmd != 'q');
	return 0;
}
