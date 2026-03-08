public class Student {
    private String studentID;
    private String name;
    private double score;

    public Student(String studentID, String name, double score){
        this.studentID = studentID;
        this.name = name;
        setScore(score);

    }

    public String getStudentID(){
        return studentID;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        if (score >= 0 && score <= 100){
            this.score = score;
        }
        else{
            System.out.println("Error: Score must be between 0 and 100");
        }
    }

    public String getGrade(){
        if (score >= 70){
            return "A";
        }
        else if (score >= 60){
            return "B";
        }
        else if (score >= 50){
            return "C";
        }
        else if (score >= 40){
            return "D";
        }
        else{
            return "F";
        }
    }
    
}

class StudentDemo{
    public static void main(String[] args) {
        Student std = new Student("10970888", "Emmanuel", 70);

        System.out.println("Student: " + std.getName());
        System.out.println("Score: " + std.getScore());
        System.out.println("Grade: " + std.getGrade());

        std.setScore(120);
        std.setScore(65);

        System.out.println("Updated Score: " + std.getScore());
        System.out.println("Updated Grade: " + std.getGrade());
    }

}