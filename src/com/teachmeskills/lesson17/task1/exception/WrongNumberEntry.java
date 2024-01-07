package com.teachmeskills.lesson17.task1.exception;

public class WrongNumberEntry extends Exception {

    public WrongNumberEntry(String wrong) {
        super(wrong);
    }

}
