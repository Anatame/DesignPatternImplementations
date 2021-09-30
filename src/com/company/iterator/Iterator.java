package com.company.iterator;

public interface Iterator<T> {
    Boolean hasNext();
    T current();
    void next();
}
