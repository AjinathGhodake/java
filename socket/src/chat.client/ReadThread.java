package chat.client;

import java.io.*;
import java.net.*;

/**
 * This thread is responsible for reading chat.server's input and printing it
 * to the console.
 * It runs in an infinite loop until the chat.client disconnects from the chat.server.
 *
 * @author www.codejava.net
 */
public class ReadThread extends Thread {
    private BufferedReader reader;
    private Socket socket;
    private ChatClient client;

    public ReadThread(Socket socket, ChatClient client) {
        this.socket = socket;
        this.client = client;

        try {
            InputStream input = socket.getInputStream();
            reader = new BufferedReader(new InputStreamReader(input));
        } catch (IOException ex) {
            System.out.println("Error getting input stream: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            try {
                String response = reader.readLine();
                System.out.println("\n" + response);

                // prints the username after displaying the chat.server's message
                if (client.getUserName() != null) {
                    System.out.print("[" + client.getUserName() + "]: ");
                }
            } catch (IOException ex) {
                System.out.println("Error reading from chat.server: " + ex.getMessage());
                ex.printStackTrace();
                break;
            }
        }
    }
}