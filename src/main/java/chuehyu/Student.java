package chuehyu;

public class Student {
    String name;
    int English;
    int math;
    int thesis;
    public Student(String name, int English , int math, int thesis) {
        this(name, English, math);
        this.thesis = thesis;
    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int English, int math){
      this(name);
      //          this.name = name;
      this.English = English;
      this.math = math;
}
    public Student() {
        this("Brian Yang",-1,-1);
        /*name = "Brian Yang"
         English = -1;
         math = -1;*/
    }
    public void print() {
        int average = (English+math)/2;
        System.out.print(name +
                "\t" + English + "\t" +
                math +"/t" +average);
        if (average < 60) {
            System.out.print("*");
        }
        System.out.println();
        }
}

