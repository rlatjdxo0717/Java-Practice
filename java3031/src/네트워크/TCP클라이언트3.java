package 네트워크;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCP클라이언트3 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10000; i++) {
			Socket socket = new Socket("localhost", 9100);
			System.out.println(i + "번: 클라이언트가 9000포트 서버에 연결을 요청함.");
			//BuffredReader클래스는 문자들을 줄단위로 가지고 와서 처리할 수 있는 클래스
			//Reader, Writer클래스는 문자들만 처리하는 클래스
			//1.1byte단위로 받음.아직 문자인지 인식이 안된 상태
//			InputStream input = socket.getInputStream(); 
//			//2. 1byte로 처리되는 아직 문자인지 인식이 안된 데이터형태를 2byte 문자로 인식시켜주는 클래스
//			InputStreamReader reader = new InputStreamReader(input);
//			BufferedReader buffer = new BufferedReader(reader);
			//3. 2byte단위로 처리된 문자들을 줄단위로 읽어올 수 있는 클래스
			
			BufferedReader buffer2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//buffer: 임시 기억장소
			String data = buffer2.readLine();
			System.out.println("서버로 부터 받은 데이터 >> " + data);
			Thread.sleep(1000);
		}
	}

}
