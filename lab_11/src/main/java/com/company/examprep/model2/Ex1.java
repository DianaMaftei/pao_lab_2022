package com.company.examprep.model2;

import java.io.IOException;

public class Ex1 extends Example {
//    protected int getGrade(String course) throws IOException {
//        return 2;
//    }

//    private int getGrade(String course) {
//        return 3;
//    }
//
//    protected long getGrade(String course) {
//        return 4;
//    }
//
    public long getGrade(int studID) {
        return 2L;
    }
}


class Example {
    protected int getGrade(String course) {
        return 1;
    }
}
