#pragma once
#define M_PI 3.14159265358979323846
enum typOperace { soucet = 1, rozdil, soucin, podil};
enum formatZobrazeni { algebraicky, geometricky };
struct complex
{
	double real;
	double imag;
};
struct complex operace(struct complex a, struct complex b, enum typOperace typ);
void tisk(struct complex a, enum formatZobrazeni format);