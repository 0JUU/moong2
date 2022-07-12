package com.kh.moong.qna.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.moong.common.model.vo.PageInfo;
import com.kh.moong.common.template.Pagination;
import com.kh.moong.qna.model.service.QnaService;
import com.kh.moong.qna.model.vo.QnaQuestion;

@Controller
public class QnaController {

	
	@Autowired
	private QnaService qnaService;


	//QnA
	//QnA ���
	@RequestMapping("qnaListView.me")
	public String qnaListView(
			@RequestParam(value="cpage",defaultValue="1") int currentPage,
			Model model
							) {

		//QnA�Խñ� �� ���� �� ��� �������� �����ֱ�
		
		//�Խñ� �� 
		int listCount = qnaService.selectQnaListCount();
		
		int pageLimit = 10;
		int boardLimit = 10;
		
		PageInfo pi = Pagination.getPageInfo(listCount, currentPage, pageLimit, boardLimit);
		
		ArrayList<QnaQuestion> list = qnaService.selectList(pi);
	
		
		
		model.addAttribute("list",list);
		model.addAttribute("pi",pi);
		
		return "qna/qnaListView";
	}
	
	//QnA �ۼ�
	@RequestMapping("qnaEnrollForm.me")
	public String qnaEnrollForm() {

		return "member/qnaEnrollForm";
	}
	
	//QnA ����
	//���� �� ���� �ҷ�����
	
	//�����ϱ�
}
