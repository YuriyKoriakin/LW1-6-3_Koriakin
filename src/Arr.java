/**
 * Created by Yuriy on 12.02.2016.
 */
public class Arr {
    public static void main(String[] args) {
        int[][] da = new int[4][4];// оголошуємо двомірний масив
        int k = 1;

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                da[i][j] = k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Наступна строка
        }
    }
}
