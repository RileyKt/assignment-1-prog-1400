class Course {
    private String courseName;
    private Student[] students;
    private double averageAssignment1;
    private double averageAssignment2;


    //constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new Student[6];
    }

}