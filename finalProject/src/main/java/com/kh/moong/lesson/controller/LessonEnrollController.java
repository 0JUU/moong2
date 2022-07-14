package com.kh.moong.lesson.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.moong.lesson.model.service.LessonEnrollService;
import com.kh.moong.lesson.model.vo.LessonEnroll;

@Controller
public class LessonEnrollController {
	
	@Autowired
	private LessonEnrollService ls;
		//첨부파일
	
	
	public String saveFile(MultipartFile upfile,HttpSession session) {
		
		
		String originName =upfile.getOriginalFilename(); 
			
		
		String currentTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		
		int ranNum =(int)(Math.random() * 90000 +10000); //5자리 랜덤값
		
		
		
		String ext = originName.substring(originName.lastIndexOf("."));
		
		
		String changeName = currentTime+ranNum+ext;
		
		
		
		String savePath = session.getServletContext().getRealPath("/resources/lesson_video/");
		
		try {
			upfile.transferTo(new File(savePath+changeName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return changeName;
	}
	
	
	
	
		//선생님 개인
	
		//과외등록 리스트 뽑기
		@RequestMapping("list.le")
		public String LessonList(int userNo,Model model) {
			
			ArrayList<LessonEnroll> list = ls.selectList(userNo);
			
			model.addAttribute("list",list);
			return "lesson/lessonEnrollList";
		}
		
		//과외등록 페이지로 이동
		@RequestMapping("enrollFrom.le")
		public String lessonEnrollForm() {
			
			return "lesson/lessonEnrollForm";
		}
		
		
		//과외등록
		@RequestMapping("insert.le")
		public ModelAndView lessonInsert(LessonEnroll le,ModelAndView mv,HttpSession session,MultipartFile upfile) {
			
			//똑같은 과목으로 등록된 과외가 있는지 확인
			int result  = ls.lessonInsertCheck(le);
					 
					 
				if(result>0) { //똑같은 과목으로 생성된 과외가 있음(과외등록불가능)
					session.setAttribute("alertMsg", "등록된 같은 과목이 있습니다 ");
					mv.setViewName("lesson/lessonEnrollForm");
				}else { //똑같은 과목으로 생성된 과외가 없음(과외등록가능) 
					
						
						
						String changeName = saveFile(upfile,session);
						
						le.setLeOriginname(upfile.getOriginalFilename());
						le.setLeChangename("resources/lesson_video/"+changeName);
						
					
					int result2 = ls.lessonInsert(le);
					
					if(result2>0) { //과외등록 성공
						session.setAttribute("alertMsg", "과외등록성공");
						mv.setViewName("redirect:list.le?userNo="+le.getUserNo());
					}else {	//과외등록 실패
						mv.addObject("errorMsg","과외등록실패").setViewName("common/errorPage");
					}
				}
			
				
			return mv;
		}
		
		
		
		
		
		
		
		//모든 선생님 과외정보 페이지 공통
		//등록한 과외정부 세부보기
				@RequestMapping("detail.le")
				public ModelAndView selectLesson(int leNo,ModelAndView mv) {
					
					LessonEnroll l = ls.selectLesson(leNo);
					
					
					//조회성공
					if(l.getLeNo()>0) {
						mv.addObject("l",l).setViewName("lesson/lessonDetail");
					//조회실패
					}else {
						mv.addObject("errorMsg","조회실패").setViewName("common/errorPage");
					}
					
					return mv;
				}
}


