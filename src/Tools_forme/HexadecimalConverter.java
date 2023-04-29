package Tools_forme;

//进制转换器
import java.util.Scanner;
        public class HexadecimalConverter {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("请输入要转换的数：");
                int num = input.nextInt();
                // 十进制转换为十六进制
                String hexNum = Integer.toHexString(num);
                System.out.println("转换为十六进制后的结果为：" + hexNum);
                // 十进制转换为八进制
                String octNum = Integer.toOctalString(num);
                System.out.println("转换为八进制后的结果为：" + octNum);
                // 十进制转换为二进制
                String binNum = Integer.toBinaryString(num);
                System.out.println("转换为二进制后的结果为：" + binNum);
            }
        }





