package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	// 싱글톤
	private static UserDAO instance = new UserDAO();
	
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	// DB 정보 - 상수로 변환
	private final String HOST = "jdbc:mysql://127.0.0.1:3306/userdb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST,USER,PASS);
		
	}
	
	//자주 사용될 변수
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void insertUser(UserVO vo) {
		
		try {
			conn = getConnection();
			 psmt = conn.prepareStatement(SQL.INSERT_USER); //sql 클래스에서 static 메서드 호출
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());
			
			psmt.executeUpdate();
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	public UserVO selectUser(String uid) {
		
		UserVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			// 검색은 하나만 출력하기에 while이 아닌 if
			if(rs.next()) {
				vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
			}

			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
		
	}
	public List<UserVO> selectUsers() {	
		
		List<UserVO> users = new ArrayList<>();
		
		
		try {
			 conn = getConnection();
			 stmt = conn.createStatement();
			 rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				
				users.add(vo);
			}

			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
		
	}
	public int updateUser(UserVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());
			
			result = psmt.executeUpdate(); //리턴값 받기
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	public int deleteUser(String uid) {
		
		int data = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, uid);
			
			data = psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	// 사용중이면 닫기
	public void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (psmt != null) {
			psmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		
	}
	
}
