package Praktikum;

import java.util.Scanner;

public class Faktorial {
    int faktorialBF(int n) {
      int fakto = 1, i = 1;
      while (i <= n) {
        fakto *= i;
        i++;
      }
    return fakto;
    }


    int faktorialDC(int n){
        if(n==1){
          return 1;
        }else{
          int fakto = n * faktorialDC(n-1);
          return fakto;
        }
    }
}



