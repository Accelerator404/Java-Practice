//PAT Advanced No.1001 “害死人不偿命的(3n+1)猜想”

//注意：在PAT的评测系统中，Java 代码需使用 Main 作为主类名。
import java.util.Scanner;

public class Main {
    public Main(int n){
        int count = 0;
        while (n>1){
            if(n%2 == 0){
                n=n/2;
            }else{
                n = 3 * n + 1;
                n /= 2;
            }
            count++;
        }
        if(n == 1)
            System.out.println(count);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        Main myClass = new Main(X);
    }
}
