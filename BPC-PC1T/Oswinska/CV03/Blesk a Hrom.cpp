#include <iostream>

int main()
{
	int t;
	int v = 330;
	int s;

	printf("Pred jakou dobou uhodil blesk (s):");
	scanf_s("%d", &t);
	s = t * v;
	printf("\n Blesk uhodil %d metru od vas.", s);

	return 0;
}

