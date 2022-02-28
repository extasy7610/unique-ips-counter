package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        generateIps();
    }

    private static void generateIps() {
        for (int i = 1; i < 40001; i++) {
            System.out.print(
                    getRandomNumber(0, 999)
            );

            if ((i % 4) == 0) {
                System.out.println();
            } else {
                System.out.print(".");
            }
        }
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
