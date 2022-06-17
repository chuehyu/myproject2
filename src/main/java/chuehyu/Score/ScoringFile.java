package chuehyu.Score;


import java.io.BufferedReader;
import java.io.FileReader;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("score.txt");//throws
            BufferedReader reader = new BufferedReader(fileReader);

        }catch (Exception e) {

        }
        System.out.println("Testing");
    }
}

