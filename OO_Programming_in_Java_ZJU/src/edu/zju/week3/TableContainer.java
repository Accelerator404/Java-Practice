package edu.zju.week3;
// 面向对象程序设计——Java语言：第三周作业
// 使用Hashmap存储城市名会在提交的慕课OJ时遇到一些未知的问题
import java.util.ArrayList;
import java.util.Scanner;

public class TableContainer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cityName = new ArrayList<String>();
        String sin;
        while(!(sin = sc.next()).equals("###")){
            cityName.add(sin);
        }
        int [][]distance = new int[cityName.size()][cityName.size()];
        for(int i=0;i<cityName.size();i++){
            for(int j=0;j<cityName.size();j++){
                distance[i][j] = sc.nextInt();
            }
        }
        System.out.println(distance[cityName.indexOf(sc.next())][cityName.indexOf(sc.next())]);
    }
}
