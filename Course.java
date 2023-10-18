class Course {
    String courseName;
    Student[] students;
    double averageAssignment1;
    double averageAssignment2;
    double coursesAverage;


    //constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.coursesAverage = (averageAssignment1+averageAssignment2)/2;

        this.students = new Student[6];
    }

    public String coursesReport(){
        String courseReport = String.format("%s : Assignment1 – %.2f Assignment2 – %.2f Average - %.2f",
                this.courseName, this.averageAssignment1, this.averageAssignment2, this.coursesAverage);
        return courseReport;
    }

}