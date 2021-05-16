package Pr_18_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Socket s = null;
        try {
            ServerSocket server = new ServerSocket(3456);
            s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("привет!");
            ps.flush();
            s.close(); // разрыв соединения
        }catch (IOException e){System.out.println("ошибка: " + e); }
    }
}
class Client{
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 3456);
            BufferedReader dis = new BufferedReader(new
                    InputStreamReader(socket.getInputStream()));
            String msg = dis.readLine();
            System.out.println(msg);
        } catch (IOException e) {System.out.println("ошибка: " + e); }
    }
}

