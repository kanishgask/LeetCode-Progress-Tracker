public class Problem {

    private String name;
    private String difficulty;

    public Problem(String name, String difficulty){
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName(){
        return name;
    }

    public String getDifficulty(){
        return difficulty;
    }

    public String toString(){
        return "Problem: " + name + " | Difficulty: " + difficulty;
    }
}
