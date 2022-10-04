package com.javarush.task.task35.task3512;

public class Generator<T> {
    Class<T> aClass;
    public Generator() {
    }
    public Generator(Class<T> eventClass) {
        this.aClass = eventClass;
    }

    T newInstance() throws InstantiationException, IllegalAccessException {
        return aClass.newInstance();
    }
}
