import java.io.*;
import java.net.*;
public class server 
{
    public static void main(String[] args) 
    {
        int port = 12345; // Port number for the server to listen on
        
        try 
        {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);
            
            Socket clientSocket = serverSocket.accept(); // Wait for a client to connect
            
            // Set up input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            
            String message;
            
            while ((message = in.readLine()) != null) {
                System.out.println("Client: " + message);
                out.println("Server received: " + message);
            }
            
            // Clean up
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
