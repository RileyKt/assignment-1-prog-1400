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
        String courseReport = String.format("%s : Assignment1 – %.2f Assignment2 – %.2f Average - %.2f\n" + "Course Rating: %s",
                this.courseName, this.averageAssignment1, this.averageAssignment2, this.coursesAverage, courseRating());
        return courseReport;
    }

    public String courseRating(){
        String rating;
        if(this.coursesAverage >=90){
            rating = "A";
        }
        else if(this.coursesAverage>=80){
            rating = "B";
        }
        else if(this.coursesAverage>=70){
            rating = "C";
        }
        else if(this.coursesAverage>=60){
            rating = "D";
        }
        else{
            rating = "F";
        }
        return rating;


    }

    //method to add student to the course class, and update the assignment average while doing so
    public void addStudent(Student student, int index) {
        students[index] = student;
        averageAssignment1 = (averageAssignment1 * index + student.getAssignment1()) / (index + 1);
        averageAssignment2 = (averageAssignment2 * index + student.getAssignment2()) / (index + 1);
    }

}