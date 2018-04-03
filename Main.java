package bluebird;
import java.util.ArrayList;
/*观察数字：12321，123321 都有一个共同的特征，无论从左到右读还是从右向左读，都是相同的。这样的数字叫做：回文数字。

    本题要求你找到一些5位或6位的十进制数字。满足如下要求：
    该数字的各个数位之和等于输入的整数。
*/
import java.util.Scanner;
public class Main {
	public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int cnt=0;
        while(n!=1){
        	if(n%2!=0)	n=3*n+1;
        	n/=2;
        	cnt++;
        }
        System.out.println(cnt);
    }
}

