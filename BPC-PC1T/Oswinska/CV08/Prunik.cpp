#include <iostream>
#include "xplagiat00.h"

int prunik(double zacatek1, double konec1, double zacatek2, double konec2, double* vysl_zacatek, double* vysl_konec)
{

	if (zacatek1 <= zacatek2 && zacatek2 <= konec1 && konec1 <= konec2)
	{
		*vysl_zacatek = zacatek2;
		*vysl_konec = konec1;
		return 1;
	}
	else if (zacatek1 >= zacatek2 && zacatek1 <= konec2 && konec1 >= konec2)
	{
		*vysl_zacatek = zacatek1;
		*vysl_konec = konec2;
		return 1;
	}
	else if (zacatek1 <= zacatek2 && konec1 >= konec2)
	{
		*vysl_zacatek = zacatek2;
		*vysl_konec = konec2;
		return 1;
	}
	else if (zacatek1 >= zacatek2 && konec1 <= konec2)
	{
		*vysl_zacatek = zacatek1;
		*vysl_konec = konec1;
		return 1;
	}
	else
	{
		return 0;
	}
}

void tisk(double zacatek1, double konec1, double zacatek2, double konec2)
{
	double intervaly[4];
	if (zacatek1 <= zacatek2 && zacatek2 <= konec1 && konec1 <= konec2)
	{
		intervaly[0] = zacatek1;
		intervaly[1] = zacatek2;
		intervaly[2] = konec1;
		intervaly[3] = konec2;
		printf("<%lf;%lf)	(%lf;%lf>", intervaly[0], intervaly[1], intervaly[2], intervaly[3]);

	}
	else if (zacatek1 >= zacatek2 && zacatek1 <= konec2 && konec1 >= konec2)
	{
		intervaly[0] = zacatek2;
		intervaly[1] = zacatek1;
		intervaly[2] = konec2;
		intervaly[3] = konec1;
		printf("<%lf;%lf)	(%lf;%lf>", intervaly[0], intervaly[1], intervaly[2], intervaly[3]);
	}
	else if (zacatek1 <= zacatek2 && konec1 >= konec2)
	{
		intervaly[0] = zacatek1;
		intervaly[1] = zacatek2;
		intervaly[2] = konec2;
		intervaly[3] = konec1;
		printf("<%lf;%lf)	(%lf;%lf>", intervaly[0], intervaly[1], intervaly[2], intervaly[3]);
	}
	else if (zacatek1 >= zacatek2 && konec1 <= konec2)
	{
		intervaly[0] = zacatek2;
		intervaly[1] = zacatek1;
		intervaly[2] = konec1;
		intervaly[3] = konec2;
		printf("<%lf;%lf)	(%lf;%lf>", intervaly[0], intervaly[1], intervaly[2], intervaly[3]);
	}
	else
	{
		intervaly[0] = zacatek1;
		intervaly[1] = konec1;
		intervaly[2] = zacatek2;
		intervaly[3] = konec2;
		printf("<%lf;%lf>	<%lf;%lf>", intervaly[0], intervaly[1], intervaly[2], intervaly[3]);
	}
}