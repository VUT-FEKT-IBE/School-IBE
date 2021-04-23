#include <iostream>
#include "Header.h"

int main()
{
	char str[512];
	int p = 0, c = 0, s = 0,v = 0;

	char input[512], output[512];
	printf("nazev vstupniho souboru: ");
	scanf_s("%s", input, sizeof(input));
	printf("nazev vystupniho souboru: ");
	scanf_s("%s", output, sizeof(output));

	FILE* open;
	errno_t errorCode = fopen_s(&open, input, "r");

	while (!feof(open))
	{
		if (fscanf_s(open, "%s", str, 100) > 0)
		{
			p = p + pismena(str);
			c = c + cisla(str);
			s = s + slova(str);
			v = v + vety(str);
		}
	}

	printf("pocet pismen %d, pocet cisel %d, pocet slov %d, pocet vet %d", p, c ,s ,v);
	
	FILE* end;
	errno_t errorCode1 = fopen_s(&end, output, "w");
	fprintf(end, "pocet pismen %d, pocet cisel %d, pocet slov %d, pocet vet %d", p, c, s, v);
	fclose(end);
}