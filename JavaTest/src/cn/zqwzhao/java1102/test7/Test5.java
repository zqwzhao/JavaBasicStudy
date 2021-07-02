package cn.zqwzhao.java1102.test7;

public class Test5 {
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j][i] + "   ");
            }
            System.out.println();
        }
    }
}
