#include<stdio.h>
#include<math.h>
#include<conio.h>

int main()
{
    float side1,side2,side3,s,area;
    printf("Enter the length of three sides of triangle: ");
    scanf("%f %f %f",&side1,&side2,&side3);

    s = (side1 + side2 + side3)/2;
    area = sqrt(s*(s-side1)*(s-side2)*(s-side3));
    printf("Area of triangle : %.4f\n",area);

    getch();
    return 0;
}