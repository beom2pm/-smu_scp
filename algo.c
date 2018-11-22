#include<stdio.h>
#include<malloc.h>
#include <string.h>

main(){
	char *n;
	char *ptr;
	char *delimeter = ",\"";
	char part1[3];
	char part2[100];
	char part3[100];
	int **arr,i;
	printf("Input-n,w,k,s,d: ");
	scanf_s("%s", &n);

	ptr = strtok(n, delimeter);
	strcpy(part1, ptr);
	ptr = strtok(NULL, delimeter);
	strcpy(part2, pos);
	ptr = strtok(NULL, delimeter);
	strcpy(part3, pos);
	printf("p1:%s, p2:%s, p3:%s", part1, part2, part3);
	


}
