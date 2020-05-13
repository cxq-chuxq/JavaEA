package club.banyuan.day4;

import java.util.Objects;

//给定两个由小写字母构成的字符串 A 和 B ，
// 只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
class Practice1 {
    public boolean buddyStrings(String A, String B) {
        //AB为空时一定不成立
        if (A == null || "".equals(A) || B == null || "".equals(B)) {
            return false;
        }
        //长度不相等时一定不成立
        if (A.length() != B.length()) {
            return false;
        }
        char[] aChar = A.toCharArray();
        char[] bChar = B.toCharArray();
        int count = 0;
        StringBuffer aDiff = new StringBuffer();//String中没有reverse方法，故使用StringBuffer
        StringBuffer bDiff = new StringBuffer();
        //对相同位置进行比较，不同时count+1且添加到Diff中去
        for (int i = 0; i < A.length(); i++) {
            if (!Objects.equals(aChar[i], bChar[i])) {
                count++;
                aDiff.append(aChar[i]);
                bDiff.append(bChar[i]);
            }
        }
        //当AB完全相同时
        if (A.equals(B)) {
            for (int i = 0; i < A.length(); ++i) {
                char ch = A.charAt(i);
                if (A.lastIndexOf(ch) != i) {//判断一个字符最后一次出现的位置和当前位置是否相同
                    return true;
                }
            }
        }
        //当不相同的字母有两个且反转后相同时
        if (count == 2 && aDiff.toString().equals(bDiff.reverse().toString())) {
            return true;
        }  else {
            return false;
        }

    }
}
