package bluebird;
import java.util.ArrayList;
/*�۲����֣�12321��123321 ����һ����ͬ�����������۴����Ҷ����Ǵ����������������ͬ�ġ����������ֽ������������֡�

    ����Ҫ�����ҵ�һЩ5λ��6λ��ʮ�������֡���������Ҫ��
    �����ֵĸ�����λ֮�͵��������������
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

