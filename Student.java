class Student {
    String name;
    double assignment1;
    double assignment2;
    double totalMarks;

    //constructor
    public Student(String name, double assignment1, double assignment2) {
        this.name = name;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.totalMarks = this.assignment1+this.assignment2;
    }


    //get statements
    public double getAssignment1() {
        return assignment1;
    }
    public double getAssignment2() {
        return assignment2;
    }


    public String stdReport(){
        String report = String.format("%s:\tAssignment1 - %.2f\tAssignment2 - %.2f\tTotal - %.2f",
                this.name,this.assignment1,this.assignment2,this.totalMarks);
        return report;
    }

}