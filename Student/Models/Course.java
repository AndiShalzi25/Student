package Models;

import java.util.concurrent.atomic.AtomicInteger;

public class Course extends BaseEntity {
    public String Name;
    private static final AtomicInteger count = new AtomicInteger(0);
    public String Lecturer;
    public String Syllabus;

    public Course() {
        Id = count.incrementAndGet();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String lecturer) {
        this.Lecturer = lecturer;
    }

    public String getSyllabus() {
        return Syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.Syllabus = syllabus;
    }
}
