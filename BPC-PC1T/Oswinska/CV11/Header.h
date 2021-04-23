#pragma once

#define SIZE 21

struct t_Hudba
{
    char Interpret[SIZE];
    char Album[SIZE];
    int rok;
    struct t_Hudba* dalsi;
};

void add(char* Interpret,char* Album, int rok, struct t_Hudba** uk_prvni);
void del(char* Interpret, struct t_Hudba** uk_prvni);
