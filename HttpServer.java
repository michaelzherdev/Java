import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 	http://habrahabr.ru/post/69136/
 * 	как запустить:
 * 	1. cmd: cd path-to-file\...
 * 	2. javac HttpServer.java
 * 	3. java -cp . HttpServer
 * 	4. http://localhost:8080/
 */

public class HttpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new  ServerSocket(8080);
		while(true) {
			Socket socket = serverSocket.accept();
			System.err.println("Client accepted");
			new Thread(new SocketProcessor(socket)).start();
		}
	}
	
	private static class SocketProcessor implements Runnable {
		private Socket s;
		private InputStream is;
		private OutputStream os;
		
		private SocketProcessor(Socket s) throws IOException {
			this.s = s;
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
		}

		@Override
		public void run() {
			try {
				readInputHeaders();
				writeResponse("<html><body><h1>Hello from Habra</h1></body></html>");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.err.println("Client processing finished");
		}
		
		private void readInputHeaders() throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while(true) {
				String s = br.readLine();
				if(s == null || s.trim().length() == 0) {
					break;
				}
			}
		}
		
		private void writeResponse(String s) throws IOException {
			String response = "HTTP/1.1 200 OK\r\n" + 
						"Server: MikeServer/2015-08-19\r\n" + 
						"Content-Type: text/html\r\n" + 
						"Content-Length: " + s.length() + "\r\n" + 
						"Connection: close\r\n\r\n";
			String result = response + s;
			os.write(result.getBytes());
			os.flush();
		}
	}

}
