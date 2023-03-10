package domain;

public class Student {
    private String name;
    private Double score;

    public Student() {
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=: ").append(name);
        sb.append(", score: ").append(score);
        sb.append('}');
        return sb.toString();
    }
    
    
}
