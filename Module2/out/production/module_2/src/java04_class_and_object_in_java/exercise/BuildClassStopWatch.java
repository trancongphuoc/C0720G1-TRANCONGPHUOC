package java04_class_and_object_in_java.exercise;

import java.time.LocalTime;
import java.util.Date;

public class BuildClassStopWatch {
    public static void main(String[] args) {
        short arr[] = new short[50000];
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (short) ((Math.random() * (10000 - 0)) + 0);
        }

        short temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        stopWatch.stop();
        System.out.println("\n" + stopWatch.getElapsedTime());

    }

    public static class StopWatch {
        private long startTime ;
        private long endTime ;

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }
}
