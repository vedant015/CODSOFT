import java.util.Scanner;
import java.util.ArrayList;

public class MarksClass {
    String subject;
    int MarksEach;
    public MarksClass(String subject, int MarksEach ){
        this.subject=subject;
        this.MarksEach=MarksEach;
    }

    public void marks(){
        System.out.println(subject +"  :  "+ MarksEach);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MarksClass> scores= new ArrayList<>();

        int TotalMarks=0;
        while(true){
            System.out.print("Enter Subject ('stop' to finish) :");
            String subject = scanner.next();
            if (subject.equalsIgnoreCase("stop")){
                break;
            }
            System.out.print("Enter Marks :");
            int Markseach = scanner.nextInt();
            TotalMarks+=Markseach;
            scores.add(new MarksClass(subject,Markseach));
        }

        double averagePercentage = (double) TotalMarks / scores.size();

        String grade;
        if (averagePercentage >=90){
            grade="A";
        } else if (averagePercentage >=80) {
            grade="B";
        } else if (averagePercentage >=70) {
            grade="C";
        } else if (averagePercentage >=60) {
            grade="D";
        } else if (averagePercentage >=50) {
            grade="E";
        }else {
            grade="F";
        }

        System.out.println("Marks for each subject");
        for (MarksClass score : scores){
            score.marks();
        }
        System.out.println("Total Marks: "+TotalMarks);
        System.out.println("Average Percentage: "+averagePercentage);
        System.out.println("Grade: "+grade);

    }
}
