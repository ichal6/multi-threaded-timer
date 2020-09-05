import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private List<TimerThread> threadList;

    public static void main(String[] args) throws InterruptedException {
        Main program = new Main();
        program.initialize();
        program.check();
    }

    private void check(){
        for(TimerThread thread: threadList){
            System.out.printf("Name: %s, ThreadId: %d, Seconds: %d%n", thread.getName(), thread.getId(), thread.getTimeFromStart());
            thread.setIsRunning(false);
        }
    }

    private void initialize() throws InterruptedException {
        this.threadList = new ArrayList<>(Arrays.asList(
                new TimerThread("noname"),
                new TimerThread("car"),
                new TimerThread("bus"),
                new TimerThread("school"),
                new TimerThread("covid")));
        for(TimerThread thread: threadList){
            thread.start();
            Thread.sleep(1000);
        }
    }
}
