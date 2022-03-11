package chuehyu;

public class Scoring2 {
    public static void main(String[] args) {
        Student jack = new Student("Jack",70,88) ;
        Student jenny = new Student("Jenny",70,88) ;
        Student brian = new Student("Brian",75,65);
        GraduateStudent yuki =
                new GraduateStudent("Yuki",65,82,79);
        jack.print();
        jenny.print();
        brian.print();
    }
}
