package com.kh.moong.lesson.model.service;

import java.util.ArrayList;

import com.kh.moong.common.model.vo.PageInfo;
import com.kh.moong.lesson.model.vo.LessonEnroll;

public interface LessonEnrollService {

	ArrayList<LessonEnroll> selectList(int userNo);

	int lessonInsertCheck(LessonEnroll le);

	int lessonInsert(LessonEnroll le);

	LessonEnroll selectLesson(int leNo);

	ArrayList<LessonEnroll> selectAllLesson(PageInfo pi);

	int selectAllLessonCount();

	

	

}
