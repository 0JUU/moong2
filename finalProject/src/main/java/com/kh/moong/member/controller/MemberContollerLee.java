package com.kh.moong.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.moong.member.model.service.MemberServiceLee;
import com.kh.moong.member.model.vo.Student;
import com.kh.moong.member.model.vo.Teacher;

@Controller
public class MemberContollerLee {

	@Autowired 
	private MemberServiceLee memberService;
	
	//���������� �������� �̵�
	@RequestMapping("myPageMain.me")
	public String myPageMain() {

		return "member/myPageMain";
	}
	
	//�л� ��� ������
		@RequestMapping("stuEnrollForm.me")
		public String stuEnrollForm() {

			return "member/stuEnrollForm";
		}
		
		//������ ��� ������
		@RequestMapping("teaEnrollForm.me")
		public String teaEnrollForm() {

			return "member/teaEnrollForm";
		}
		
		//������ ��� �ϱ�
		@RequestMapping("teaEnroll.me")
		public String teaEnroll(Teacher tea, HttpSession session, Model model) {

			int result = memberService.teaEnroll(tea);
			
			if(result>0) {//����
				
				session.setAttribute("alertMsg","���������� ��ϵǾ����ϴ�.");
				
				return "redirect:myPageMain.me";
			}else {//����
				model.addAttribute("errorMsg","������ ��� ����");
				
				//���������� �����ֱ�
			}
			
			return "redirect:myPageMain.me";
		}
		
		//�л� ��� �ϱ�
		@RequestMapping("stuEnroll.me")
		public String stuEnroll(Student stu, HttpSession session, Model model) {

			int result = memberService.stuEnroll(stu);
			
			if(result>0) {//����
				
				session.setAttribute("alertMsg", "�л����� ��ϵǾ����ϴ�.");
				
				return "redirect:myPageMain.me";
			}else {//����
				model.addAttribute("errorMsg","�л� ��� ����");
				
				//���� ������ �����ֱ�
			}
			
			return "redirect:myPageMain.me";
		}
		
		//�л� ����������
		@RequestMapping("stuMyPage.me")
		public String stuMyPage() {

			return "member/stuMyPage";
		}
		
		
		//������ ����������
		@RequestMapping("teaMyPage.me")
		public String teaMyPage() {

			return "member/teaMyPage";
		}
		
		//���ܸ��
		@RequestMapping("lessonList.me")
		public String lessonList() {

			return "member/lessonList";
		}
		
		
		
		
		//�ۼ� �Խñ�
		//�ۼ� �Խñ� ���
		@RequestMapping("myBoardListView.me")
		public String myBoardListView() {

			return "member/myBoardListView";
		}
		
		//�ۼ� �Խñ� �󼼺���
		
		
		//���ƿ� �Խñ�
		//���ƿ� �Խñ� ���
		@RequestMapping("likeBoardListView.me")
		public String likeBoardListView() {

			return "member/likeBoardListView";
		}
		
		//���ƿ� �Խñ� �󼼺���
		
		
		
		//�л� ���� ����
		@RequestMapping("stuGradeUpdate.me")
		public String stuGradeUpdate() {

			return "member/stuGradeUpdate";
		}
		
	
	
}
