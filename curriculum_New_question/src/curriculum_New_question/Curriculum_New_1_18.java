package curriculum_New_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curriculum_New_1_18 {
    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
    public static void printHello(String text, int version) {
        System.out.println("Hello " + text + " " + version);
    }

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println("The result of multiplication is: " + result);
    }

    // Q2のオーバーロード：引数を小数にして乗算しコンソールに出力するメソッド
    public static void multiply(double a, double b) {
        double result = a * b;
        System.out.println("The result of multiplying doubles is: " + result);
    }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.println("Array element: " + number);
        }
    }

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力するメソッド
    public static void add(double a, double b) {
        double result = a + b;
        System.out.println("The sum of the doubles is: " + result);
    }

    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して格納した値を順番にコンソールで出力後、格納した値を返すメソッド
    public static List<Integer> generateRandomNumbers(int count) {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(100) + 1;  // 1～100のランダムな数値を生成
            } while (randomNumber == 0);  // 0は生成しない（ただし、実際には発生しない）
            numbers.add(randomNumber);
            System.out.println("Generated number: " + randomNumber);
        }

        return numbers;
    }

    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッド
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("The list is empty, cannot calculate average.");
            return 0;
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.size();
        System.out.printf("The average is: %.2f\n", average);  // 小数点以下2桁まで表示
        return average;
    }

    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力するメソッド
    public static boolean checkIfAboveFifty(double average) {
        boolean isAboveFifty = average >= 50;
        System.out.println("Is the average 50 or above? " + isAboveFifty);
        return isAboveFifty;
    }

    public static void main(String[] args) {
        // Q1：Hello JavaSE 11の出力
        printHello("JavaSE", 11);

        // Q2：整数の乗算
        multiply(3, 4);

        // Q2のオーバーロード：小数の乗算
        multiply(2.5, 4.5);

        // Q3：配列の要素を順番に出力
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);

        // Q4：小数の和算
        add(3.5, 2.3);

        // Q5：ランダムな数値を生成し、順番に出力しリストを返す
        List<Integer> randomNumbers = generateRandomNumbers(5);

        // Q6：生成した数値リストの平均を計算して出力
        double average = calculateAverage(randomNumbers);

        // Q7：平均値が50以上かどうかをチェック
        checkIfAboveFifty(average);
    }
}
