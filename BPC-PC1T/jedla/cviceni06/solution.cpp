#include "pch.h"
#include "solution.h"
#include <iostream>
#include <ctype.h>
#include<string.h>
int alpha(char str[])
{
	int count = 0;
	int l = strlen(str);
	for (int i = 0; i < l; i++)
	{
		if (isalpha(str[i]))
		{
			count++;
		}

	}
	return count;
}

int numb(char str[])
{
	int count = 0;
	int l = strlen(str);
	for (int i = 0; i < l; i++)
	{
		if (isdigit(str[i]))
		{
			count++;
		}

	}
	return count;
}

int numb_of_word(char str[])
{
	int count = 0;
	int l = strlen(str);
	for (int i = 0; i < l; i++)
	{
		if (isalpha(str[i]))
		{
			if (isspace(str[i+1]))
			{
				count++;
			}
			else if (ispunct(str[i + 1]))
			{
				count++;
			}
		}

	}
	return count;
}