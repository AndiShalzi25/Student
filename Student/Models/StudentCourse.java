package Models;

public class StudentCourse {
    public int studentId;
    public int courseId;
    public boolean IsAssigned = false;
    public short maxAssigned = 0;

    public StudentCourse() {
        maxAssigned++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public boolean getIsAssigned() {
        return IsAssigned;
    }

    public void setAssigned(boolean isAssigned) {
        this.IsAssigned = isAssigned;
    }

}
