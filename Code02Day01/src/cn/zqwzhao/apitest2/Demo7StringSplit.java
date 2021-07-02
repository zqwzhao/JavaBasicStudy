package cn.zqwzhao.apitest2;

/**
 * 分割字符串方法
 * public String[] split(String regex) 按照提供的规则，将字符串切割成若干字符串
 *
 * 注意
 * regex如果按照英文句点“.” 进行切割 必须写“\\.”
 */
public class Demo7StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,ddd,eee,fff,ggg";
        String[] arr = str1.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String str2 = "aaa.bbb.ccc.ddd.eee.fff.ggg";
        String[] arr2 = str2.split(".");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
