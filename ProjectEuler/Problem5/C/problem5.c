// Solution to Euler-project problem 5 in C
// By Karel Vanhelden - Karellism.com
#include <stdio.h>
 
int main()
{
 
   int zi=1;
 
   while(1)
   {
      if(zi%11==0 && zi%12==0 && zi%13==0
         && zi%14==0 && zi%15==0 && zi%16==0
         && zi%17==0 && zi%18==0 && zi%19==0
         && zi%20==0)
      {
          printf("%d\n", zi);
          return 0;
      }
 
      zi++;
   }
 
return 0;
}
