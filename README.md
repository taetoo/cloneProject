# Week 07 클론 프로젝트 || Clone Instagram 📱 5조
- 팀 노션: [https://www.notion.so/7-SA-2fae9f8b335f4a8cbccbc4245daa91c3](https://www.notion.so/Week-07-Clone-Instagram-5-cdcce94f9ee7454b91172093e4109004)
- FE Github: [https://github.com/INSTAFIVE99/FE](https://github.com/INSTAFIVE99/FE)
- BE Github: [https://github.com/kwongyumin/cloneProject](https://github.com/kwongyumin/cloneProject)
</br>

- ---

# 🏆 Goal
</br>
글로벌 기업 META 의 핵심 서비스인 Instagram 을 클론 코딩하여, 실제 서비스에서 어떤 기능이 구현되어 있는지 살펴보고, 새로운 기능들을 구현하는 동시에 현업에서 백엔드 개발자가 어떤 능력을 필요로 하는지 알아보자!</br>
<div align="center">실전 프로젝트 전 마지막 스텝을 잘 밟는 것이 우리의 최종 목표 !! 🧗🏻</div>
</br>
</br>

- ---

# 📺 구현 영상

[![유튜브 링크](http://img.youtube.com/vi/BmfaBBLQis0/0.jpg)](https://www.youtube.com/watch?v=BmfaBBLQis0)

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
</br>
</br>
</br>
</br>

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
</br>
</br>
</br>
</br>

- ---

# 🧑🏻‍💻 Roles & Responsibilities
- 권규민 : JWT 를 이용한 회원가입, 로그인 구현 및 BE 전반적인 SUPPORT
- 권윤주 : 댓글 작성, 삭제, 수정, 좋아요 기능 구현
- 김태현 : 게시글 작성(s3 사용 이미지 업로드), 삭제, 수정 구현

- ---

# 💻 Technologies Used

## **Back-end**

	
- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
- ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
- ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
- ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
- ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
- ![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)

## **DevOps**

- ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)
- AWS RDS(MySQL)
- AWS S3
- FileZilla

## **Tool**

- ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
- ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)


---

# 🧑🏻‍🔧 Trouble Shooting
<details>
<summary><span style="color:red"> 좋아요 취소 문제 </span></summary>
<div markdown="1">
</br>
* findTrouble
</br>
</br>
하나의 게시물에 좋아요를 취소하면, 내가 클릭한 모든 좋아요 기록 삭제
</br>
</br>
<img width="636" alt="스크린샷 2022-04-21 오전 10 34 34" src="https://user-images.githubusercontent.com/101050600/164354297-3cafdf08-d0b4-472b-aa6b-8745ece59700.png">
</br>
</br>
* fix
</br>
</br>
특정 게시물의 로그인한 유저의 좋아요 정보만 삭제됬어야했는데 , 현재 게시글 정보를 전달하지 않아서 해당 유저가 좋아요한 모든 게시글의 좋아요 정보가 전부 삭제되는 문제
</br>
</br>
<img width="686" alt="스크린샷 2022-04-21 오전 10 31 10" src="https://user-images.githubusercontent.com/101050600/164354270-7237075f-21c3-480a-964f-40aa7d8d04fc.png">
</details>

<details>
<summary><span style="color:red"> 게시글 삭제 안되는 문제(엔티티 영속성 전이) </span></summary>
<div markdown="1">
</br>
* findTrouble
</br>
</br>
좋아요가 되어 있을 경우 게시글 삭제가 안되는 문제가 발생. 아마도 Posts, Likes 엔티티의 연관관계에서 영속성 전이 문제라고 의심
</br>
</br>
<img width="969" alt="스크린샷 2022-04-21 오전 11 07 59" src="https://user-images.githubusercontent.com/101050600/164363641-276cee52-65a0-4fe0-a02c-cb3344acc425.png">
</br>
</br>
* fix
</br>
</br>
참조무결성 제약 조건 때문에 게시글에 좋아요 데이터가 존재할 시, 게시글이 삭제가 안됐다. 👉 cascade 옵션으로 해결
</br>
</br>
<img width="687" alt="스크린샷 2022-04-21 오후 12 01 59" src="https://user-images.githubusercontent.com/101050600/164364382-3c6828de-c93a-4437-a0e9-b8a5dcf6a48f.png">
</details>

<details>
<summary><span style="color:red"> 이모지 잭슨 파싱 오류 예외 처리 </span></summary>
<div markdown="1">
</br>
* findTrouble
</br>
</br>
게시물(String 타입의 contents 필드)에 이모지가 있을 경우, 필드에 빈값을 허용하게 되서 예외가 발생
</br>
</br>
<img width="807" alt="스크린샷 2022-04-21 오후 4 06 53" src="https://user-images.githubusercontent.com/101050600/164428204-31d22568-23f2-4439-b8ed-4c9e33417433.png">
</br>
</br>
* fix
</br>
</br>
config 패키지에 Xss Filter를 처리하는 클래스에서 emoji jackson parse 오류에 따른 예외 처리 부분 추가
</br>
</br>
<img width="807" alt="스크린샷 2022-04-21 오후 4 06 53" src="https://user-images.githubusercontent.com/101050600/164428553-551348f8-fe45-49de-b590-6b6faa76458c.png">
</br>
</details>
