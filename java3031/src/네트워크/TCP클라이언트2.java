package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP클라이언트2 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9000);
		System.out.println("클라이언트가 9000포트 서버에 연결을 요청함.");
	}

}
