package cn.test1;

import java.util.HashSet;
import java.util.Scanner;
//输入一个字符串，求出该字符串中没有重复字符的最长字符串长度；

//解析：从第一个字符开始对后面的字符开始拼接，并且判断是否有重复，
//从第二个字符开始对后面的字符开始拼接，判断是否有重复,,,,以此类推
//记录每一个非重复字符的长度，存储在set集合中（去重），然后使用Math算法去除最大值输出；
public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入任意字符串：");
        String stringline = sc.nextLine();
        int num = maxnum(stringline);
        System.out.println(num);
    }
    public static int maxnum(String s){
        int n =0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (allUnique(s,i,j)){
                    n= Math.max(n,j-i);
                }
            }

        }
        return n;
    }
    public static boolean allUnique(String s,int start,int end){
        HashSet<Character> set = new HashSet<Character>();
        for (int i=start;i<end;i++){
            Character ch =s.charAt(i);
            if (set.contains(ch)){
                return false;
            }else {
                set.add(ch);
            }
        }
        return true;
    }
}
