package com.kh.moong.qna.model.service;

import java.util.ArrayList;

import com.kh.moong.common.model.vo.PageInfo;
import com.kh.moong.qna.model.vo.QnaAnswer;
import com.kh.moong.qna.model.vo.QnaQuestion;

public interface QnaService {

	//��ü QnA �Խñ� �� ��ȸ
	int selectQnaListCount();

	//QnA ����Ʈ ��ȸ
	ArrayList<QnaQuestion> selectList(PageInfo pi);

	//QnA �ۼ��ϱ�
	int insertQna(QnaQuestion qq);
	
	//QnA ����ȸ
	//��ȸ�� ����
	int increaseCount(int qnaNo);
	
	//����ȸ
	QnaQuestion selectQuestion(int qnaNo);
	
	//QnA ����
	int deleteQna(int qnaNo);
	
	//QnA ����
	int updateQna(QnaQuestion qq);
	
	//�亯 ����Ʈ ��ȸ
	ArrayList<QnaAnswer> selectAnswerList(int qnaNo);

	//�亯 �ۼ� - �����ڸ� ����
	int insertAnswer(QnaAnswer qa);
}
