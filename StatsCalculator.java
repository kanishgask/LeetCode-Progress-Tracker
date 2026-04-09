import java.util.List;

public class StatsCalculator {

    public static void showStats(List<Problem> problems){

        int easy = 0;
        int medium = 0;
        int hard = 0;

        for(Problem p : problems){

            switch(p.getDifficulty().toLowerCase()){

                case "easy":
                    easy++;
                    break;

                case "medium":
                    medium++;
                    break;

                case "hard":
                    hard++;
                    break;
            }
        }

        System.out.println("Easy: " + easy);
        System.out.println("Medium: " + medium);
        System.out.println("Hard: " + hard);
        System.out.println("Total: " + problems.size());
    }
}
