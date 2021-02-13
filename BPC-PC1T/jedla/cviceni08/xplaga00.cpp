#include "pch.h"
#include "xplaga00.h"
#include <iostream>
int prunik(double zacatek1, double konec1, double zacatek2, double konec2, double* vysl_zacatek, double* vysl_konec)
{
	
		if (zacatek1 <= zacatek2 && zacatek2 <= konec1 && konec1<=konec2)
		{
			*vysl_zacatek = zacatek2;
			*vysl_konec = konec1;
			return 1;
		}
		else if (zacatek1 >= zacatek2 && zacatek1<=konec2 && konec1>=konec2)
		{
			*vysl_zacatek = zacatek1;
			*vysl_konec = konec2;
			return 1;
		}
		else if (zacatek1<=zacatek2 && konec1>= konec2)
		{
			*vysl_zacatek = zacatek2;
			*vysl_konec = konec2;
			return 1;
		}
		else if (zacatek1>=zacatek2 && konec1<=konec2)
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
// vypis 
void vypis(double zacatek1, double konec1, double zacatek2, double konec2)
{
	double arr[4];
	if (zacatek1 <= zacatek2 && zacatek2 <= konec1 && konec1 <= konec2)
	{
		arr[0] = zacatek1;
		arr[1] = zacatek2;
		arr[2] = konec1;
		arr[3] = konec2;
		printf("<%lf;%lf)		(%lf;%lf>", arr[0], arr[1], arr[2], arr[3]);

	}
	else if (zacatek1 >= zacatek2 && zacatek1 <= konec2 && konec1 >= konec2)
	{
		arr[0] = zacatek2;
		arr[1] = zacatek1;
		arr[2] = konec2;
		arr[3] = konec1;
		printf("<%lf;%lf)		(%lf;%lf>", arr[0], arr[1], arr[2], arr[3]);
	}
	else if (zacatek1 <= zacatek2 && konec1 >= konec2)
	{
		arr[0] = zacatek1;
		arr[1] = zacatek2;
		arr[2] = konec2;
		arr[3] = konec1;
		printf("<%lf;%lf)		(%lf;%lf>", arr[0], arr[1], arr[2], arr[3]);
	}
	else if (zacatek1 >= zacatek2 && konec1 <= konec2)
	{
		arr[0] = zacatek2;
		arr[1] = zacatek1;
		arr[2] = konec1;
		arr[3] = konec2;
		printf("<%lf;%lf)		(%lf;%lf>", arr[0], arr[1], arr[2], arr[3]);
	}
	else
	{
		arr[0] = zacatek1;
		arr[1] = konec1;
		arr[2] = zacatek2;
		arr[3] = konec2;
		printf("<%lf;%lf>		<%lf;%lf>", arr[0], arr[1], arr[2], arr[3]);
	}
}