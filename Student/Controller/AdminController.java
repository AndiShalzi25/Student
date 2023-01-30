package Controller;

import java.util.ArrayList;

import Database.Database;
import Models.Course;
import Models.Grade;
import Models.Student;
import Models.StudentCourseGrades;
import Models.StudentCourse;

public class AdminController {

    public Database database = new Database();

    public ArrayList<Student> StudentList() {
        return database.getStudents();
    }

    public Student Student(int studentId) {
        Student std = new Student();

        for (Student student : database.getStudents()) {
            if (student.getId() == studentId) {
                std = student;
                break;
            }
        }

        return std;
    }

    public ArrayList<Course> CourseList() {
        return database.getCourses();
    }

    public Course Course(int courseId) {
        Course crs = new Course();

        for (Course course : database.getCourses()) {
            if (course.getId() == courseId) {
                crs = course;
                break;
            }
        }

        return crs;
    }

    public void CreateStudent(String name, String surname) {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        database.students.add(student);
        StudentList();
    }

    public void AssignCourseToStudent(int studentId, int courseId) {
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStudentId(studentId);
        studentCourse.setCourseId(courseId);

        database.studentCourses.add(studentCourse);
    }

    public void AddStudentGrade(int studentId, int courseId, int points, int weight) {
        Grade grade = new Grade();
        grade.setPoints(points);
        grade.setWeight(weight);

        database.grades.add(grade);

        StudentCourseGrades studentCourseGrade = new StudentCourseGrades();
        studentCourseGrade.setStudentId(studentId);
        studentCourseGrade.setCourseId(courseId);
        studentCourseGrade.setGradeId(grade.Id);

        database.studentCourseGrades.add(studentCourseGrade);
    }

    public void DeleteStudent(int studentId) {
        for (Student student : database.getStudents()) {
            if (student.getId() == studentId) {
                database.students.remove(student);
                break;
            }
        }
        StudentList();
    }

    public void CreateCourse(String name, String lecturer, String syllabus) {
        Course course = new Course();
        course.setName(name);
        course.setLecturer(lecturer);
        course.setSyllabus(syllabus);

        database.courses.add(course);
        CourseList();
    }

    public void DeleteCourse(int courseId) {
        for (Course course : database.getCourses()) {
            if (course.getId() == courseId) {
                for (StudentCourse studentCourse : database.getStudentCourses()) {
                    if (studentCourse.courseId == courseId) {
                        System.out.println("Cannot remove course, enrolled students");
                        break;
                    }

                }
                break;
            }
        }
        CourseList();
    }
}
