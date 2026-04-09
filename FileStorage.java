import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStorage {

    private static final String FILE = "problems.txt";

    public void saveProblem(Problem p){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE,true))){

            writer.write(p.getName() + "|" + p.getDifficulty());
            writer.newLine();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public List<Problem> loadProblems(){

        List<Problem> list = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE))){

            String line;

            while((line = reader.readLine()) != null){

                String[] parts = line.split("\\|");

                if(parts.length == 2){
                    list.add(new Problem(parts[0], parts[1]));
                }
            }

        }catch(IOException e){
            System.out.println("No previous data found.");
        }

        return list;
    }
}
