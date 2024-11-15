import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> players = new Stack<>();
        // adding element in stack
        players.push("Ritik Mishra");
        players.push("Virat Kohli");
        players.push("Dhoni");
        System.out.println(players);

        // deleting elements
        players.pop();
        System.out.println(players);

        // checking top
        System.out.println(players.peek());
    }

}
