package edu.zju.week1;
// 面向对象程序设计——Java语言：第一周作业
// 设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。
// Fraction类提交至OJ时需要复制到Main.java，并删除public标识
public class Fraction {
    int a;
    int b;
    Fraction(int _a,int _b){
        a = _a;
        b = _b;
    }
    double toDouble(){
        return (double)a/b;
    }
    int gcd(int x,int y){
        if (x%y==0){
            return y;
        }
        else{
            return gcd(y,x%y);
        }
    }
    Fraction plus(Fraction r){
        int ta = this.a*r.b + this.b*r.a;
        int tb = this.b * r.b;
        int s = gcd(ta,tb);
        return new Fraction(ta/s,tb/s);
    }
    Fraction multiply(Fraction r){
        int ta = this.a*r.a;
        int tb = this.b*r.b;
        int s = gcd(ta,tb);
        return new Fraction(ta/s,tb/s);
    }
    void print(){
        if(a%b == 0){
            System.out.println(a/b);
        }
        else{
            int s = gcd(a,b);
            System.out.println(a/s+"/"+b/s);
        }
    }
}
