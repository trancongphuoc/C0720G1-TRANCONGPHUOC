package draft.class_object;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis(); // 3h00
    }

    public void stop() {
        this.endTime = System.currentTimeMillis(); //3h15
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
