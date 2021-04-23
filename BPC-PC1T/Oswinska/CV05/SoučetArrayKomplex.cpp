#include <iostream>

double a[2], b[2], c[2];
char operand;
char plusminus;
double argumentsin;
double argumentcos;
double modul;

void soucet(double a[2], double b[2], double c[2])
{
	c[0] = a[0] + a[1];
	c[1] = b[0] + b[1];
}
void rozdil(double a[2], double b[2], double c[2])
{
	c[0] = a[0] - a[1];
	c[1] = b[0] - b[1];
}

void soucin(double a[2], double b[2], double c[2])
{
	c[0] = a[0] * a[1];
	c[1] = b[0] * b[1];
}

void tisk(double c[2])
{
	if (operand == '+')
	{ 
		soucet(a,b,c);
		if (c[1] >= 0)
		{
			plusminus = '+';
		}
		else
		{
			plusminus = '-';
			c[1] = c[1] * (-1);
		}
		
		printf("vysledek scitani je %.2lf  %c %.2lf j", c[0], plusminus, c[1]);
	}
	else if (operand == '-')
	{
		rozdil(a,b,c);
		if (c[1] >= 0)
		{
			plusminus = '+';
		}
		else
		{
			plusminus = '-';
			c[1] = c[1] * (-1);
		}
		printf("vysledek rozdilu je %.2lf  %c %.2lf j", c[0], plusminus, c[1]);
	}
	else if (operand == '*')
	{
		soucin(a, b, c);
		if (c[1] >= 0)
		{
			plusminus = '+';
		}
		else
		{
			plusminus = '-';
			c[1] = c[1] * (-1);
		}
		printf("vysledek soucinu je %.2lf  %c %.2lf j", c[0], plusminus, c[1]);
	}
	else
	{
		printf("spatne zadany operand");
	}
}

void tisk2(double c[2])
{
	if (operand == '+')
	{
		soucet(a, b, c);
		modul = sqrt(c[0] + c[1]);
		argumentsin = sin(c[0] / c[1]);
		argumentcos = cos(c[0] / c[1]);
		printf("\n| %.2lf | ^ ( cos(%.2lf )+ jsin( %.2lf) ", modul, argumentcos, argumentsin );
	}
	else if (operand == '-')
	{
		rozdil(a, b, c);
		modul = sqrt(c[0] + c[1]);
		argumentsin = sin(c[0] / c[1]);
		argumentcos = cos(c[0] / c[1]);
		printf("\n| %.2lf | ^ ( cos(%.2lf )+ jsin( %.2lf) ", modul, argumentcos, argumentsin);
	}
	else if (operand == '*')
	{
		soucin(a, b, c);
		modul = sqrt(c[0] + c[1]);
		argumentsin = sin(c[0] / c[1]);
		argumentcos = cos(c[0] / c[1]);
		printf("\n| %.2lf | ^ ( cos(%.2lf )+ jsin( %.2lf) ", modul, argumentcos, argumentsin);
	}
	else
	{
		printf("spatne zadany operand");
	}
}

int main()
{
	printf("Zadejte Realnou hodnotu R1 : ");
	scanf_s("%lf", &a[0]);

	printf("\nZadejte Imaginarni hodnotu Im1 : ");
	scanf_s("%lf", &b[0]);

	printf("\nZadejte Realnou hodnotu R2 : ");
	scanf_s("%lf", &a[1]);

	printf("\nZadejte Imaginarni hodnotu Im2 : ");
	scanf_s("%lf", &b[1]);

	printf("\nJakou operaci chcete provezt? (+ nebo - nebo *): ");
	scanf_s(" %c", &operand,1);

	tisk(c);
	tisk2(c);
}