package com.tas.javaElementary.course.diploma;

import java.time.LocalDate;

public abstract class User {
    //I thought that it is more important to make fields private than to put them here, isnt it?

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract LocalDate getDateOfBirth();
}
