package Models;

import java.util.concurrent.atomic.AtomicInteger;

public class Student extends BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);
    public String Name;
    public String Surname;

    public Student() {
        Id = count.incrementAndGet();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}
