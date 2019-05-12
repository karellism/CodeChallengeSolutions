// My solution to Euler-project problem 5 in C
// By Karel Vanhelden - Karellism.com
#include <stdio.h>
 
static int is_palindromic(unsigned int zn);
 
int main(void)
{
  unsigned int i, j, zmax = 0;
  for (i = 100; i <= 999; i++) {
    for (j = 100; j <= 999; j++) {
      unsigned int zp = i*j;
      if (is_palindromic(zp) && zp > zmax) {
        zmax = zp;
      }
    }
  }
  printf("%u\n", zmax);
  return 0;
}
 
int is_palindromic(unsigned int zn)
{
  unsigned int zrev = 0, zt = zn;
 
  while (zt) {
    zrev = 10*zrev + (zt % 10);
    zt /= 10;
  }
  return zrev == zn;
}
