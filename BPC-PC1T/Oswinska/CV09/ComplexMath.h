#pragma once

enum typOperace { soucet = 1, rozdil, soucin };
enum formatZobrazeni { algebraicky, geometricky };
struct complex
{
	double real;
	double imag;
};
struct complex operace(struct complex a, struct complex b, enum typOperace typ);
void tisk(struct complex a, enum formatZobrazeni format);

int compare(struct complex a, struct complex b);
