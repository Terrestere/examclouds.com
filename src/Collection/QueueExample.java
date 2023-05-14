package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Tabor");
        queue.offer("Maing");
        queue.offer("Kirov");
        queue.offer("Rester");
        queue.offer("Jinfus");

        System.out.println(queue);

        String town;
        while ((town = queue.poll()) != null) {
            System.out.println(town);
            System.out.println(queue);
        }

    }
}
