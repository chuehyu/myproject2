package chuehyu;

public class Scoring {
    public static void main(String[] args) {
        String[] names = {"Jenny", "Brian", "Yuki", "Tiffany", "Andy"};
        int[] English = {85, 70, 80 , 82, 60};
        int[] math = {90, 83, 88, 98, 96};
        for (int i = 0; i < 5; i++)
            System.out.println(names[i] +"\t" + English[i] + "\t" + math[i] + "\t" +((English[i] +math[i])/2) );
    }
}
