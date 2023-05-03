package org.example;


import org.apache.commons.codec.DecoderException;

import java.security.MessageDigest;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) throws DecoderException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要加密/解密的字符串：");
        String str = scanner.nextLine();
        System.out.println("请输入1加密，2解密：");
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("加密后的字符串为：" + getMd5(str));
        } else if (i == 2) {
            System.out.println("解密后的字符串为：" + getString(str));
        } else {
            System.out.println("输入有误");
        }
    }

    public static String getMd5(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            return new String(new org.apache.commons.codec.binary.Hex().encode(md.digest()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getString(String str) throws DecoderException {
        byte[] bt = new org.apache.commons.codec.binary.Hex().decode(str.getBytes());
        return new String(bt);
    }
}
