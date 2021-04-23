#include <iostream>

int main()
{
	int Re1;
	int Im1;
	int Re2;
	int Im2;
	int Re;
	int Im;

	
	printf("Zadej Prvni Re: ");
	scanf_s("%d", &Re1);
	printf("Zadej Prvni Im: ");
	scanf_s("%d", &Im1);
	printf("Zadej Druhe Re: ");
	scanf_s("%d", &Re2);
	printf("Zadej Druhe Im: ");
	scanf_s("%d", &Im2);

	Re = Re1 + Re2;
	Im = Im1 + Im2;

	printf("Realna hodnota Re = %d\n", Re);
	printf("Realna hodnota Im = %d\n", Im);

	return 0;
	}