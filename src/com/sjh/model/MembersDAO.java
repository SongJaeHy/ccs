package com.sjh.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.*;
import javax.sql.*;


public class MembersDAO {
	private DataSource ds;
	
	private MembersDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static MembersDAO dao = new MembersDAO();
	
	public static MembersDAO getinstance() {
		if(dao == null) {
			dao = new MembersDAO();
		}
		return dao;
	}
	
	// ȸ�������� ó���ϴ� �޼��� ����
	// DB�� ���� ��, Ȥ�� DB���� ��µǾ� ������ ������
	// ��ΰ� UsersVO ���� �ڷ������� ��� �� �����Ƿ�
	// ��ټ� ������� ����VO�� �Ű��� �����մϴ�.
	public int joinMember(MembersVO member) {
		// members_join.jsp�ּ� ������ �ڵ带 �̰��� �ٿ��ֱ⸦ �մϴ�.
		// DB������ ���� Connector ����
		// Connection ��ü ����
		Connection con = null;
		// ������ ������ ���� pstmt ��ü ����
		PreparedStatement pstmt = null;
		
		try {
			// Ŀ�ؼ� Ǯ
			con = ds.getConnection();
			// ������
			String sql = "INSERT INTO members VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			// ������ ���� �� ������ ����
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMpw());
			pstmt.setString(3, member.getMname());
			pstmt.setInt(4, member.getMno());
			pstmt.setInt(5, member.getMdeptno());
			pstmt.setString(7, member.getMphone());
			pstmt.setString(8, member.getMemail());
			
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println("���� : " + e);
		}finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return 1;
	}// end joinMember
	public int login(MembersVO member) {
		// Connection, PreparedStatement ��ü ����
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int resultCode = 0;
		
		// ���� �ۼ�
		// bId�� auto_increment�� �پ������Ƿ� �Է� ���ص� ��
		// bName, bTitle, bContent�� ������ �����ذ� ����
		// bDate�� �ڵ����� ���� �����ð��� �Է���
		// bHit�� �ڵ����� 0�� �Է���
		String sql = "INSERT INTO member (mid, mpw) VALUES(?,?)";
				
		try {
			// Ŀ�ؼ� ���� �� pstmt�� ������ �ְ� �ϼ����Ѽ� ������� �ϰ�
			// close()�� �޸�ȸ������ ���ֻ���.
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMpw());
			
			pstmt.executeUpdate();
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
				if(con!=null && !con.isClosed()) {
					con.close();
				}
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

