package com.company;

public class Main {

    public static void main(String[] args) {
	int array[][]=new int[2][10];
	int i,j;
	for (i=0; i<2;++i){
	    for(j=0; j<10; ++j){
	        array[i][j]=(i*10)+j+1;
            System.out.print(array[i][j]+" ");
        }
        System.out.println();
    }
    }
}
