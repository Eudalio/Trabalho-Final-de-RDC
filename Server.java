import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
	public static void main(String[] args) {
		try {

			

			ServerSocket server = new ServerSocket(9000);
			Socket clSocket = server.accept();
			InputStream in = clSocket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(isr);
			String fName = reader.readLine();
			System.out.println(fName);
			File f1 = new File("C:\Users\AESSLINDER\Documents\Eudálio\RDC\trabalho final\Servidor"+ fName);
			FileOutputStream out = new FileOutputStream(f1);
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
		}
	}
}