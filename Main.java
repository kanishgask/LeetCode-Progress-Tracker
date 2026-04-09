import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TrackerService service = new TrackerService();

        while(true){

            System.out.println("\n===== LEETCODE TRACKER =====");
            System.out.println("1. Add Problem");
            System.out.println("2. View Problems");
            System.out.println("3. Show Stats");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter problem name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter difficulty (Easy/Medium/Hard): ");
                    String diff = scanner.nextLine();

                    service.addProblem(name, diff);
                    break;

                case 2:
                    service.viewProblems();
                    break;

                case 3:
                    StatsCalculator.showStats(service.getProblems());
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
