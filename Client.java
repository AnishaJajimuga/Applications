import java.net.*;
import java.io.*;

class Client
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("Client applicaton is Running........");
        
        Socket s = new Socket("localhost",3300);
        System.out.println("Client is waiting for the server to accept the request ");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;
        while(!(str1 = br1.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.print("Enter message for server:");
            str2 = br2.readLine();
           System.out.println("server says:"+str2);

        }
    }
}
