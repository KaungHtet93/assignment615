package com.pearl.training.collectiontest;

import java.util.concurrent.TimeUnit;

public class CompletableFuture {
    public static java.util.concurrent.CompletableFuture<Integer> getMathMarks() {
        return java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            delay(3);
            return 85;
        });
    }

    public static java.util.concurrent.CompletableFuture<Integer> getScienceMarks() {
        return java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            delay(3);
            return 90;
        });
    }

    public static java.util.concurrent.CompletableFuture<Integer> getEnglishMarks() {
        return java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            delay(1);
            return 88;
        });
    }

    public static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);  // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.concurrent.CompletableFuture<Integer> mathFuture = getMathMarks();
        java.util.concurrent.CompletableFuture<Integer> scienceFuture = getScienceMarks();
        java.util.concurrent.CompletableFuture<Integer> englishFuture = getEnglishMarks();

        // Combine all marks and calculate total + average
        java.util.concurrent.CompletableFuture<Void> result = mathFuture
                .thenCombine(scienceFuture, Integer::sum)
                .thenCombine(englishFuture, Integer::sum)
                .thenAccept(total -> {
                    double average = total / 3.0;
                    System.out.println("Total Marks: " + total);
                    System.out.println("Average Marks: " + average);
                });

        // Wait for all async operations to finish
        result.join();
    }
}
