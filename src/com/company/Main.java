package com.company;

import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        long time = System.currentTimeMillis();

        Reader reader = new FileReader("ips.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println(
                getCountOfUniqueIps_UsingHashSet(bufferedReader)
        );

        System.out.println(System.currentTimeMillis() - time);

        reader.close();
        bufferedReader.close();
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

    private static int getCountOfUniqueIps_UsingHashSet(BufferedReader bufferedReader) throws IOException {
        HashSet<String> ipSet = new HashSet<>();

        while (bufferedReader.ready()) {
            String ip = bufferedReader.readLine();

            ipSet.add(ip);
        }

        return ipSet.size();
    }
}
