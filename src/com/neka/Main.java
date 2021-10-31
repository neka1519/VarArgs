package com.neka;

class calc {
    int sum = 0;

    /*public int add(int i, int j) {
        sum = i + j;
        System.out.println(sum);
        return sum;
//now as 2 paramters are definfed you can only add 2 values, if not you have to change
        //then according to 3 or 5.

        //so we use...
    }*/

    public int add(int ... i){
        //the paramters will reach here as an array
        //since i is array

        for(int n:i){
            sum =sum+ n;
        }
        System.out.println(sum);
        return sum;
    }

}


public class Main {

    //VARARGS - VARIABLE ARGUMENTS LENGTH
    public static void main(String[] args) {
	// write your code here

        calc obj = new calc();
        obj.add(11,15,5,8,1,2,6,8,69);

    }


}
