import java.util.ArrayList;
import java.util.List;

public class TrackerService {

    private List<Problem> problems;
    private FileStorage storage;

    public TrackerService(){

        storage = new FileStorage();
        problems = storage.loadProblems();
    }

    public void addProblem(String name, String difficulty){

        Problem p = new Problem(name, difficulty);
        problems.add(p);

        storage.saveProblem(p);

        System.out.println("Problem added!");
    }

    public void viewProblems(){

        for(Problem p : problems){
            System.out.println(p);
        }
    }

    public List<Problem> getProblems(){
        return problems;
    }
}
