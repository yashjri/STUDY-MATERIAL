import java.io.*;
import java.net.*;

public class client 
{
    public static void main(String[] args) 
    {
        String serverAddress = "127.0.0.1"; // Server's IP address or hostname
        int serverPort = 12345; // Port number the server is listening on
        
        try {
            Socket socket = new Socket(serverAddress, serverPort);
            
            // Set up input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            
            while (true) {
                System.out.print("Enter a message to send to the server: ");
                message = userInput.readLine();
                out.println(message);
                
                String response = in.readLine();
                System.out.println("Server response: " + response);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
