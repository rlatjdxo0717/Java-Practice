package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//자바에서는 자동 import 컨트롤+쉬프트+o(오)
public class MemberDB {
	// crud기능
	public void create(String id, String pw, String name, String tel) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	public void update(String id, String pw, String tel) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		
		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		System.out.println("2. db연결 성공. <br>");
		
		// 3. SQL문을 만든다.=> 해당을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "update member set pw = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, tel);
		ps.setString(3, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception  {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}

	public void read() {

	}

	
}
