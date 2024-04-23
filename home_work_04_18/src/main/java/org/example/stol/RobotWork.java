package org.example.stol;

import java.util.Scanner;

public class RobotWork {
    public static void main(String[] args) {


        Stol stol = new Stol();
        RobotPutter putter = new RobotPutter(stol);
        RobotTaker taker = new RobotTaker(stol);





    }
}
