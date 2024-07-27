package Collections;

import java.util.Stack;

public class StackExample {

    public static void main(String [] args) {

        // Stack: Stappel, LIFO
        Stack<String> books = new Stack<>();
        books.push("buch1");
        books.push("buch2");
        books.push("buch3");
        books.push("buch4");

        System.out.println(books.peek());

        // gibt oberstes Element zurück
        String book4 = books.pop();

        System.out.println(books.pop());

        books.push(book4);

        System.out.println(books);

    }

}
