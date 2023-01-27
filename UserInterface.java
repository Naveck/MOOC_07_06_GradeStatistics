import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private GradeManager gradeManager;

    public UserInterface(GradeManager gradeManager, Scanner scanner) {
        this.gradeManager = gradeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            }

            if (grade < 0 || grade > 100) {
                continue;
            }

            gradeManager.addGrade(grade);
        }

        gradeManager.printAverage();
        gradeManager.printPassingAverage();
        gradeManager.printPassPercentage();
        gradeManager.printGradeDistribution();
    }

}
