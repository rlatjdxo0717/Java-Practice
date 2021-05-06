package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;

public class TCP서버 {

	public static void main(String[] args) throws Exception {
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중...");
		while (true) {
			server.accept();
			System.out.println("서버가 클라이언트의 요청을 승인함.");
		}
	}

}
