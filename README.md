# 뭉과외

### ◎ 기획 의도
  - 과외를 중개해주는 사이트는 많으나 그룹과외를 중개해주는 사이트는 찾기 힘듦
  - 모르는 사람들과 스터디를 구해서 공부하듯이 새로운 사람들과의 그룹과외를 중개하고자 함<br>
→ 랜덤매칭을 통해 그룹을 생성해준 뒤 채팅방으로 연결해주는 그룹과외 중개 사이트를 구상함
<br/><br/>

### ◎ 구현 기능
  #### 1. 회원 기능<br>
    - 로그인 및 회원가입
    - 아이디/비밀번호 찾기

  #### 2. 관리자 페이지<br>
    - 매칭그룹 리스트를 받은 후 각각 채팅방 링크 입력하기

  #### 3. 학생 페이지<br>
    - 매칭그룹 과목의 채팅방 링크 확인하기

  #### 4. 선생님 후기<br>
    - 선생님의 특정 과목을 들은 학생만 후기 작성하기
    - 위의 해당 학생 외에는 후기 작성칸 안보이게 하기
    - 한 번 작성하면 재작성 못하게 하기
    - 작성한 후기 수정하기
-----------

#### Tech Stack

+ FE(Front-End)

   - JSP
   - CSS
   - Javascript
   - jQuery
   - Ajax
   - bootstrap
   

+ BE(Back-End)

   - Spring
   - Maven
   - jdk 1.8
   - WAS(Web-Application-Server) : Apache Tomcat 8.5
   - Database
     * RDBMS : Oracle 11g XE
   - Developer tool
     * Java : STS
     * Oracle : SQL-Developer

 + Design Pattern
   - SpringMVC
-----------

### 1-1. 회원 기능 - 로그인 및 회원가입
![image](https://user-images.githubusercontent.com/97891349/184546988-5c0a60f7-8f0c-4028-923f-87fc343867f7.png)
![image](https://user-images.githubusercontent.com/97891349/184547149-203fd8c2-7ffa-49b3-8353-4585df8e7d7c.png)
![image](https://user-images.githubusercontent.com/97891349/184547288-8328fe73-0ba7-493c-ad22-7e7816c617d2.png)
<br/>

### 1-2. 회원 기능 - 아이디/비밀번호 찾기
![image](https://user-images.githubusercontent.com/97891349/184547205-2fcabc1c-3e66-425e-a004-cde2759318dd.png)
![image](https://user-images.githubusercontent.com/97891349/184547235-e94aac27-b54d-4ada-a519-b6c7f2941598.png)
![image](https://user-images.githubusercontent.com/97891349/184547376-29186bbe-80f5-451c-bd86-7b9118fd93e4.png)
<br/>

### 2. 관리자 페이지 - 매칭그룹 리스트를 받은 후 각각 채팅방 링크 입력하기
![image](https://user-images.githubusercontent.com/97891349/184547557-9e5caafc-13b9-4719-a06e-6eae4e67d82a.png)
![image](https://user-images.githubusercontent.com/97891349/184547569-6bb53158-3ac9-4a12-9d55-789c803726b5.png)
![image](https://user-images.githubusercontent.com/97891349/184547588-fd1bea5f-522f-496d-9349-4fc37dec7b63.png)
<br/>

### 3. 학생 페이지 - 매칭그룹 과목의 채팅방 링크 확인하기
![image](https://user-images.githubusercontent.com/97891349/184547639-f7698b9d-a7eb-4cb0-9797-9b9ed6ee8aac.png)
<br/>

### 4-1. 선생님 후기 - 선생님의 특정 과목을 들은 학생만 후기 작성하기(해당 학생 외에는 후기 작성칸 안보이게 하기)
![image](https://user-images.githubusercontent.com/97891349/184547723-05fa31dd-8b62-446e-b090-ddd8918ac678.png)
![image](https://user-images.githubusercontent.com/97891349/184547804-a29653c7-f335-4354-9c7e-5ba354853051.png)
<br/>

### 4-2. 선생님 후기 - 한 번 작성하면 재작성 못하게 하기
![image](https://user-images.githubusercontent.com/97891349/184547839-928653ab-2322-4afa-a0a6-2ab099424d46.png)
<br/>

### 4-3. 선생님 후기 - 작성한 후기 수정하기
![image](https://user-images.githubusercontent.com/97891349/184547853-30020e16-43e8-4c86-8a5e-5efade581002.png)
![image](https://user-images.githubusercontent.com/97891349/184547868-3e59fe3c-e52e-4033-921e-fff318bd64d5.png)
<br/>
