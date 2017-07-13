import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) throws Exception {


		Scanner tc = new Scanner(System.in);
		System.out.println("Digite o Arquivo:");
		String fName = tc.nextLine();
                  
		Scanner ip = new Scanner(System.in);
		System.out.println("Difite o IP:");
		String fIp = ip.nextLine();

		File f = new File("C:\Users\AESSLINDER\Documents\Eudálio\RDC\trabalho final\Cliente"+fName);
		FileInputStream in = new FileInputStream(f);
		Socket socket = new Socket(FIp, 9000);
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);
		writer.write(f.getName()+"\n");
		writer.flush();
		 int c;
		 while ((c = in.read()) != -1) {
		 System.out.println(c);
		 out.write(c);
		 }
	}
}