# Week 07 클론 프로젝트 || Clone Instagram 📱 5조
- 팀 노션: [https://www.notion.so/7-SA-2fae9f8b335f4a8cbccbc4245daa91c3](https://www.notion.so/Week-07-Clone-Instagram-5-cdcce94f9ee7454b91172093e4109004)
- FE Github: [https://github.com/INSTAFIVE99/FE](https://github.com/INSTAFIVE99/FE)
- BE Github: [https://github.com/kwongyumin/cloneProject](https://github.com/kwongyumin/cloneProject)
- ---

# 🏆 Goal
글로벌 기업 META 의 핵심 서비스인 Instagram 을 클론 코딩하여, 실제 서비스에서 어떤 기능이 구현되어 있는지 살펴보고, 새로운 기능들을 구현하는 동시에 현업에서 백엔드 개발자가 어떤 능력을 필요로 하는지 알아보자!</br>
<div align="center">실전 프로젝트 전 마지막 스텝을 잘 밟는 것이 우리의 최종 목표 !! 🧗🏻</div>

- ---

# 🧑🏻‍🎨 Wire Frame
<details>
<summary><span style="color:yellow">와이어 프레임</span></summary>
<div markdown="1">
</br>
1. 로그인 페이지 (로그인, 회원가입, 메인페이지 이동)
</br>
</br>
<img width="963" alt="1" src="https://user-images.githubusercontent.com/101050600/164271905-5d731352-5583-404f-8fb8-13892092690f.png">
</br>
</br>
2. 회원가입 페이지 (아이디, 비밀번호 유효성 검사, 중복확인 | 회원가입 버튼 | 로그인 페이지 이동)
</br>
</br>
<img width="963" alt="2" src="https://user-images.githubusercontent.com/101050600/164273370-ece8a251-2499-4be0-b4ad-d1dfb73c874e.png">
</br>
</br>
3. 피드(게시글 리스트) (피드 전체 프레임 | 좋아요 | 댓글 입력(입력만) | 슬라이드 X)
</br>
</br>
<img width="963" alt="3" src="https://user-images.githubusercontent.com/101050600/164272035-84a00487-2cbe-4ef6-b289-b9a54ec4efef.png">
</br>
</br>
4. 게시글 상세 페이지 (본인이 작성한 댓글 삭제 버튼 ⇒ 댓글 삭제)
</br>
</br>
<img width="963" alt="4" src="https://user-images.githubusercontent.com/101050600/164272105-79aff4ac-2fa5-42b3-a49f-c77dcd1517bb.png">
</br>
</br>
5. 게시글 작성 / 수정 페이지 (이미지 업로드 및 내용 작성 / 수정)
</br>
</br>
<img width="963" alt="5" src="https://user-images.githubusercontent.com/101050600/164272126-d4495dba-b5b4-4185-9c1b-cfa73bd83f80.png">
</br>
</br>
6. 게시글 삭제
</br>
</br>
<img width="963" alt="6" src="https://user-images.githubusercontent.com/101050600/164272157-68e653a3-8223-43f4-b496-8095f00862fc.png">
</br>
</details>



- ---



# 🩻 ERD
</br>
<img width="963" alt="6" src="https://user-images.githubusercontent.com/101050600/164274293-804bdec5-8e89-4b37-86b7-aa0f0a2c0916.png">



- ---



# 🧾 API 명세서
<details>
<summary><span style="color:blue">API 명세서</span></summary>
<div markdown="1">
</br>
<img width="963" alt="1" src="https://user-images.githubusercontent.com/101050600/164267638-5da652d9-7b9e-4974-8540-af8352bb160f.png">
<img width="961" alt="2" src="https://user-images.githubusercontent.com/101050600/164267687-9fd2c30d-8b02-4c0c-a96b-00dfe718205f.png">
<img width="964" alt="3" src="https://user-images.githubusercontent.com/101050600/164267677-879badee-344a-4c01-a823-4d6c2526d4fd.png">
</div><img width="966" alt="4" src="https://user-images.githubusercontent.com/101050600/164267672-fb22c691-0ce0-4e9d-9cc5-19611db5cad2.png">
</details>




- ---



# 🧑🏻‍💻 Roles & Responsibilities
- 권규민 : JWT 를 이용한 회원가입, 로그인 구현 및 BE 전반적인 SUPPORT
- 권윤주 : 댓글 작성, 삭제, 수정, 좋아요 기능 구현
- 김태현 : 게시글 작성(s3 사용 이미지 업로드), 삭제, 수정 구현






- ---
# 💻 Technologies Used

**Back-end**

- Java 8
- SpringBoot 2.5.3
- Spring Security
- Gradle
- JPA
- MySQL
- JWT
- CORS

**DevOps**

- AWS EC2
- AWS RDS(MySQL)
- AWS s3
- FileZilla

**Tool**

- Git
- GitHub




---




# 🧑🏻‍🔧 Trouble Shooting
<details>
<summary><span style="color:red">좋아요 취소 문제</span></summary>
<div markdown="1">
</br>
* findTrouble
</br>
하나의 게시물에 좋아요를 취소하면, 내가 클릭한 모든 좋아요 기록 삭제
</br>
<img width="636" alt="스크린샷 2022-04-21 오전 10 34 34" src="https://user-images.githubusercontent.com/101050600/164354297-3cafdf08-d0b4-472b-aa6b-8745ece59700.png">
</br>
</br>
* fix
</br>
특정 게시물의 로그인한 유저의 좋아요 정보만 삭제됬어야했는데 , 현재 게시글 정보를 전달하지 않아서 해당 유저가 좋아요한 모든 게시글의 좋아요 정보가 전부 삭제되는 문제
</br>
<img width="686" alt="스크린샷 2022-04-21 오전 10 31 10" src="https://user-images.githubusercontent.com/101050600/164354270-7237075f-21c3-480a-964f-40aa7d8d04fc.png">
</details>






- ---
