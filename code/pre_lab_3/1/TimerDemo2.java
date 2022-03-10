import java.util.Timer;
import java.util.TimerTask;
public class TimerDemo2 {
    public static void main (String args[]){
        Timer timer = new Timer();
        Task task = new Task();
        timer.schedule(task, 0, 100);
    }
}

class Task extends TimerTask{
    @Override
    public void run() {
        System.out.println("Test!!");    
    }
}
