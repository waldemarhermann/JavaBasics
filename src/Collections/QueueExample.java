package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String [] args) {

        // Queue: FIFO
        Queue<String> downloads = new LinkedList<>();
        downloads.add("game1");
        downloads.add("game2");
        downloads.add("game3");

        System.out.println(downloads.peek());

        // Entfernt und gibt das erste Element aus
        String download1 = downloads.poll();

         for (String game : downloads) {
             System.out.println(game);
         }

    }
}
