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
	//if (l == 1)
//	{
//		count = 0;
	//}
	//else
	//{
		for (int i = 0; i < l; i++)
		{
			if (isalpha(str[i]))
			{
			
				if (i == (l - 1))
				{
					count++;
				}
			}
			else if (isspace(str[i]) && isalpha(str[i-1]))
			{
				count++;
			}
			else if (ispunct(str[i]) && isalpha(str[i-1]))
			{
				count++;
			}

			else
			{
				count = 0;
			}

		}
//	}
	return count;
}

