#pragma once

#ifndef __AUTADB_H__
#define __AUTADB_H__

#define ZNACKA_SIZE 21

struct t_auto
{
	char  interpret[ZNACKA_SIZE];
	char  album[ZNACKA_SIZE];
	int  rok;
	struct t_auto* dalsi;
};

void add(char * interpret,char* album, int rok, struct t_auto ** uk_prvni);
void del(char *interpret, struct t_auto ** uk_prvni);

#endif
