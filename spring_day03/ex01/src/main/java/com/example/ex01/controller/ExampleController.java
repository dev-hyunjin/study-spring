package com.example.ex01.controller;

import com.example.ex01.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {

    @RequestMapping(value = "ex01", method = RequestMethod.GET)
    public String ex01(){
        log.info("ex01..............");
        return "ex01";
    }

    @GetMapping("ex02")
    public void ex02(){
        log.info("ex02..............");
    }

    @GetMapping("ex03")
    public void ex03(HttpServletRequest request){
        String name = request.getParameter("name");
        log.info(name);
    }

    @GetMapping("ex04")
    public void ex04(@ModelAttribute("name") String name/*, Model model*/){
//        model.addAttribute("name", name);
        log.info(name);
    }

//    이름, 나이, 성별 받고 출력
    @GetMapping("ex05")
    public void ex05(MemberVO memberVO){
        log.info("이름 : " + memberVO.getName());
        log.info("나이 : " + memberVO.getAge() + "살");
        log.info("성별 : " + memberVO.getGender());
    }

    @GetMapping("ex06")
    public void ex06(MemberVO memberVO, @RequestParam("address") String city/*, Model model*/){
        log.info("이름 : " + memberVO.getName());
        log.info("나이 : " + memberVO.getAge() + "살");
        log.info("성별 : " + memberVO.getGender());
        log.info("사는 도시 : " + city);
        /*model.addAttribute("city", city);*/
    }

    @GetMapping("ex07")
    public void ex07(String name, Integer age) {;}

//    [실습 1]
//    외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
//    화면에서 4개 정보 입력 후 form태그로 전송한다.

//    [실습 2]
//    TaskVO 선언
//    int num, int kor, int eng, int math 선언
//    총점과 평균 점수 화면에 출력

//    [실습 3]
//    아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.html로 이동
//    아이디가 user일 경우 user.html로 이동
//
//    - login.html : 아이디와 비밀번호 입력 페이지 출력
//    - admin.html : 관리자 페이지 출력
//    - user.html : 일반 회원 페이지 출력

//    [실습 4]
//    이름을 입력하고 출근 또는 퇴근 버튼을 클릭한다.
//    출근 시간은 09:00이며, 퇴근 시간은 17:00이다.
//    출근 버튼 클릭 시 9시가 넘으면 지각으로 처리하고,
//    퇴근 버튼 클릭 시 17시 전이라면 퇴근이 아닌 업무시간으로 처리한다.
//    - getToWork.html
//    - leaveWork.html
//    - late.html
//    - work.html
}
