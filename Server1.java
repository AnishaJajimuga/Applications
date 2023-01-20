import java.net.*;
import java.io.*;

class Server1
{
    public static void main(String a[])
    {
        System.out.println("Server is Running .....");
        ServerSocket ss = new ServerSocket(3000);

        System.out.println("Server is running on part no 3000 and Waiting from Client Request....");
        Socket s = ss.accept();
        System.out.println("Client is Connected to Server is succesfully");

    }
}