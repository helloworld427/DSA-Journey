package Recursion;

public class UniquePathsInGrid {
    public static void main(String[] args) {
        //Write a function that takes 2 inputs n and m and outputs unique number of paths
        //from the top left corner to bottom right corner of nxm grid.
        //you can only move down or right 1 unit at a time 
        System.out.println(grid(3,4));

    }
    public static int grid(int n, int m){
        if(n==1 || m==1) return 1;
        else {
            return grid(n-1, m) + grid(n, m-1);
        }
    }
}
