import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Integer> grades;

    public GradeManager() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void printAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        System.out.println("Point average (all): " + (1.0 * total / grades.size()));
    }

    public void printPassingAverage() {
        int total = 0;
        int passing = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                total += grade;
                passing++;
            }
        }
        if (passing == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (1.0 * total / passing));
        }
    }

    public void printPassPercentage() {
        int passing = 0;
        int participants = 0;
        for (int grade : grades) {
            if (grade >= 50) {
                passing++;
            }
            participants++;
        }
        if (passing == 0) {
            System.out.println("Pass percentage: 0.0");
        } else {
            System.out.println("Pass percentage: " + (100.0 * passing / participants));
        }
    }

    public void printGradeDistribution() {
        String grade5 = "5: ";
        String grade4 = "4: ";
        String grade3 = "3: ";
        String grade2 = "2: ";
        String grade1 = "1: ";
        String grade0 = "0: ";

        for (int grade : grades) {
            if (grade >= 90) {
                grade5 += "*";
                continue;
            }
            if (grade >= 80) {
                grade4 += "*";
                continue;
            }
            if (grade >= 70) {
                grade3 += "*";
                continue;
            }
            if (grade >= 60) {
                grade2 += "*";
                continue;
            }
            if (grade >= 50) {
                grade1 += "*";
                continue;
            }
            grade0 += "*";
        }
        System.out.println(grade5);
        System.out.println(grade4);
        System.out.println(grade3);
        System.out.println(grade2);
        System.out.println(grade1);
        System.out.println(grade0);
    }

}
