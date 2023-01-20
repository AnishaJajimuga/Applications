import java.net.*;
import java.io.*;

class Server
{
    public static void main(String a[]) throws SocketException
    {
        System.out.println("Server applicaton is Running........");

        ServerSocket ss = new ServerSocket(2100);
        System.out.println("Server is running at port on 2100 and waitimg for client request");
        
        Socket s =ss.accept();
        System.out.println("Request of client get Connected");

        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;
        while((str1 = br1.readLine()) != null)
        {
          System.out.println("Clients says :"+str1);
          System.out.println("Enter the Message for client :");
          str2 = br2.readLine();

          ps.println(str2);  
        }
    }
    }
