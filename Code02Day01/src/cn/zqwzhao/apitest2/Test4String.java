package cn.zqwzhao.apitest2;

/**
 * 定义一个方法 把{1,2,3}按照指定格式拼接成一个字符串
 * 格式 ：[word1#word2#word3]
 *
 *  分析 ：
 *  1.准备一个int数组 {1,2,3}
 *  2.定义一个方法将int数组拼接成字符串
 *  三要素
 *  返回值类型：String
 *  方法名称:fromArrayToString
 *  参数列表:int []
 *  3.[word1#word2#word3]
 */
public class Test4String {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        String str = fromArrayToString(arr);
        System.out.println(str);
    }

    private static String fromArrayToString(int[] arr) {
        String str ="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length - 1){
                str += "word" + i + "]";
            }else {
                str += "word" + i + "#";
            }
        }

        return str;
    }
}
