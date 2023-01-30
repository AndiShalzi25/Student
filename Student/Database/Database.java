package Database;

import java.util.ArrayList;

import Models.Course;
import Models.Grade;
import Models.Student;
import Models.StudentCourse;
import Models.StudentCourseGrades;
import Models.User;

public class Database {
    public ArrayList<Student> students = new ArrayList<Student>();
    public ArrayList<Course> courses = new ArrayList<Course>();
    public ArrayList<Grade> grades = new ArrayList<Grade>();
    public ArrayList<StudentCourse> studentCourses = new ArrayList<StudentCourse>();
    public ArrayList<StudentCourseGrades> studentCourseGrades = new ArrayList<StudentCourseGrades>();
    public ArrayList<User> users = new ArrayList<User>();

    public Database() {
    };

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public ArrayList<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(ArrayList<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public void setStudentCourseGrades(ArrayList<StudentCourseGrades> studentCourseGrades) {
        this.studentCourseGrades = studentCourseGrades;
    }

    public ArrayList<StudentCourseGrades> getStudentCourseGrades() {
        return studentCourseGrades;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
