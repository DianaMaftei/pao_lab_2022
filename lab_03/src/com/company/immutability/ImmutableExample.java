package com.company.immutability;

import java.time.LocalDate;

//[//]: # (To make a class immutable it must:)
//[//]: # (not be extended)
//[//]: # (setters should not exist or throw exceptions if they do)
//[//]: # (getters should return clones of mutable fields)
//[//]: # (constructors should store clones of mutable parameters)
public final class ImmutableExample {
    private LocalDate date;

    public ImmutableExample(LocalDate date){
        this.date = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
    }

    public LocalDate getDate(){
        return LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
    }

}
