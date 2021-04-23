#include <iostream>
// This is how trashy code looks like kids, don't do it like this

int main()
{
	int JePrestupny(int rok);
	printf("\n1000 %d", JePrestupny(1000));
	printf("\n2000 %d", JePrestupny(2000));
	printf("\n2002 %d", JePrestupny(2002));
	printf("\n2004 %d", JePrestupny(2004));
	printf("\n2014 %d", JePrestupny(2014));

	/*printf("Zadejte Rok");
		scanf_s("%d", JePrestupny(rok));
	*/
}

int JePrestupny(int rok)
{
	int del4 = rok % 4;
	int del100 = rok % 100;
	int del400 = rok % 400;

	if (del4 == 0)
	{
					if (del100 == 0)
						{
									if (del400 == 0)
										{
											return 1;
										}
										else
											{
												return 0;
											}
						}
						else
							{
								return 1;
							} 
						

	}
		else
			{
				if (del400 == 0)
					{
						return 1;
					}
					else
						{
						return 0;
						}
			}

}