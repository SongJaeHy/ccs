package com.sjh.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sjh.model.MembersDAO;
import com.sjh.model.MembersVO;

public class MemberLoginService implements IMemberService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			String mid = request.getParameter("mid");
			String mpw = request.getParameter("mpw");
			
			MembersDAO dao = MembersDAO.getinstance();
			
			MembersVO member = new MembersVO();
			member.setMid(mid);
			member.setMpw(mpw);
			
			int resultCode = dao.login(member);
			if(resultCode == 1) {
				System.out.println("�α��ο� �����߽��ϴ�.");
			}else {
				System.out.println("�α��ο� �����߽��ϴ�.");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
