package cn.test1;

import java.util.*;

public class TwoStringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入任意字符串");
        String s = sc.nextLine();
        int maxnum = maxnum(s);
        System.out.println(maxnum);
    }
    public static int maxnum(String s){
       int num =0;
        HashSet<Integer> set = new HashSet<Integer>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = i; j < chars.length; j++) {
                sb.append(chars[j]);//拼接获取所有子字符串；
              set.add(max(sb.toString(),num));
            }
        }
      //把set中的所有数据添加到int数组中；
        int i =0;
        Object[] objects = set.toArray();
        int[] arr = new int[objects.length];
        Arrays.sort(objects);
        for (Object object : objects) {
            arr[i]=Integer.parseInt(object.toString());
            i++;
        }
//去除int数组最后一个数，返回；
        return arr[arr.length-1];
    }

    public static int max(String s,int num){
        char[] chars2 = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < chars2.length; i++) {
               set.add(chars2[i]);
            }
        if (chars2.length==set.size()){
                num=chars2.length;
        }
        return num;
    }
}
