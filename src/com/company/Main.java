package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 56;
    for(int i=0;i<=8;i++){
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=7;i>=0;i--)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
