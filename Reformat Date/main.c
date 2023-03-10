#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *reformatDate(char *date)
{
    int i = 0, j = 0, k = 0;
    char tokens[3][10];
    char *reformattedDate = (char *)calloc(20, sizeof(char));
    char dash[] = "-";

    while (date[i] != '\0')
    {
        if (date[i] == ' ')
        {
            tokens[j][k] = '\0';
            i++;
            j++;
            k = 0;
        }
        tokens[j][k] = date[i];
        k++;
        i++;
    }

    tokens[0][strlen(tokens[0]) - 2] = '\0';

    if (strcmp(tokens[1], "Jan") == 0)
    {
        strcpy(tokens[1], "01");
    }
    else if (strcmp(tokens[1], "Feb") == 0)
    {
        strcpy(tokens[1], "02");
    }
    else if (strcmp(tokens[1], "Mar") == 0)
    {
        strcpy(tokens[1], "03");
    }
    else if (strcmp(tokens[1], "Apr") == 0)
    {
        strcpy(tokens[1], "04");
    }
    if (strcmp(tokens[1], "May") == 0)
    {
        strcpy(tokens[1], "05");
    }
    else if (strcmp(tokens[1], "Jun") == 0)
    {
        strcpy(tokens[1], "06");
    }
    else if (strcmp(tokens[1], "Jul") == 0)
    {
        strcpy(tokens[1], "07");
    }
    else if (strcmp(tokens[1], "Aug") == 0)
    {
        strcpy(tokens[1], "08");
    }
    else if (strcmp(tokens[1], "Sep") == 0)
    {
        strcpy(tokens[1], "09");
    }
    else if (strcmp(tokens[1], "Oct") == 0)
    {
        strcpy(tokens[1], "10");
    }
    else if (strcmp(tokens[1], "Nov") == 0)
    {
        strcpy(tokens[1], "11");
    }
    else if (strcmp(tokens[1], "Dec") == 0)
    {
        strcpy(tokens[1], "12");
    }

    if (atoi(tokens[0]) <= 9)
    {
        tokens[0][1] = tokens[0][0];
        tokens[0][0] = '0';
        tokens[0][2] = '\0';
    }

    strncpy(reformattedDate, tokens[2], 4);
    strcat(reformattedDate, dash);
    strcat(reformattedDate, tokens[1]);
    strcat(reformattedDate, dash);
    strcat(reformattedDate, tokens[0]);

    return reformattedDate;
}

int main()
{
    char date[20] = "20th Oct 2052";
    printf("%s\n", reformatDate(date));
    return 0;
}