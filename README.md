# 코리아 IT 아카데미 국비과정
<a name="readme-top"></a>
## spring 

#### Framework

	뼈대나 근간을 이루는 코드들의 묶음.
	라이브러리나, 개발자가 작성해놓은 코드파일을 의미하며
	API란, 여러 라이브러리가 모여있는 패키지(JAR)를 의미한다.
	프레임워크란, API가 굉장히 많이 모여저서 덩치가 커져있는 것을 의미한다.
	개발자는 각 개개인의 능력차이가 큰 직종이고, 개발자 구성에 따라 프로젝트 결과 역시
	큰 차이를 낳는다. 이런 상황을 극복하기 위한 코드의 결과물이 바로 프레임워크이다.
	프로그램의 기본 흐름이나 구조를 정하고 모든 팀원이 이 구조에 자신의 코드를 추가하는 방식으로
	개발하게 된다.

  
#### Framework의 장점

	개발에 필요한 구조를 이미 코드로 만들어 놓았기 때문에, 실력이 부족한 개발자라 하더라도
	반쯤 완성된 상태에서 필요한 부분을 조립하는 형태의 개발이 가능하다.
	회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을 수 있고,
	개발자 입장에서는 완성된 구조에 자신이 맡은 서비스에 대한 코드를 개발해서 넣기 때문에
	개발 시간을 단축할 수 있다.


#### Spring Framework

	경량 프레임워크, 
	예전 프레임워크는 다양한 경우를 처리하기 위해 여러 기능들을 넣다보니,
	하나의 기능을 위해서 아주 많은 구조가 필요했다. 기술이 너무나 복잡하고 방대했기 때문에,
	전체를 이해하고 개발하기에는 어려움이 많았다. 그래서 Spring Framework가 등장했고,
	특정 기능을 위주로 간단한 JAR파일 등을 선택하여 모든 개발이 가능하도록 구성되어 있다.


#### Spring Framework의 장점

	- 프로젝트 전체 구조를 설계할 때 유용하다(빠른 속도로  서버 제작 가능)
	- 다른 프레임워크들의 포용, 여러 프레임워크를 혼용해서 사용 가능하며 이를 접착성이 좋다고 한다.
	- 개발 생산성과 개발도구의 지원


#### Spring Boot

	Spring Framework를 사용함에 있어서 초기 설정 및 필요한 라이브러리에 대한 설정의 어려움이 많으며,
	시간이 너무 오래 걸리 때문에 자동 설정(AutoConfiguration)과 개발에 필요한 모든 것을 관리해주는
	스프링 부트를 선호한다. 각 코어 및 라이브러리의 버전들도 맞추어야 하지만 스프링 부트를 사용하면
	이러한 복잡성을 해결하기에도 좋다.

#### Spring Framework의 특징

	- POJO 기반의 구성
	- DI를 통한 객체간의 관계 구성
	- AOP 지원
	- Transaction 관리
	- 편리한 MVC 구조
	- WAS에 종속적이지 않은 개발 환경


#### ▶ POJO 기반의 구성

	오래된 방식의 간단한 자바 객체라는 의미이며, JAVA코드에서 일반적으로 객체를 구성하는 방식을
	Spring Framework에서 그대로 사용할 수 있다는 의미이다.


#### ▶ 의존성 주입(DI)을 통한 객체간의 관계 구성

	의존성(Dependency)이란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것을 의미한다.
	예를 들어 A객체가 B객체 없이 동작이 불가능한 상황을 "A가 B에 의존적이다"라고 표현한다.
	하지만 직접 A필드에 B객체를 선언하면 결합도가 단단해지기 때문에 유연성이 떨어진다.

	주입(Injection)은 외부에서 내부로 밀어 넣는 것을 의미한다.
	필요한 객체를 외부에서 밀어 넣어 유연성을 높이고 결합도를 느슨하게 해준다.
	주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고 어떤 객체에 의존하든 자신의 역할은 변하지 않는다.

   	***의존성
   	A →→→→→→→→→→→→→ B
   	A객체에서 B객체를 필드로 직접 생성

	***의존성 주입
	A ↔↔↔↔↔ ? ↔↔↔↔↔ B
	A는 B가 필요하다고 신호를 보내고, ?가 B객체를 외부에서 생성하여 주입하게 된다.
	Spring Framework에서는 ApplicationContext가 ?이며,
	필요한 객체들을 생성 및 주입해주는 역할을 한다. 따라서 개발자들은 기존의 프로그래밍과는 달리
	객체와 객체를 분리해서 생성하고, 이러한 객체를 엮는 wiring 작업의 형태로 개발하게 된다.

	ApplicationContext가 관리하는 객체들을 빈(Bean)이라 부르고,
	빈과 빈 사이의 의존관계를 처리하는 방식으로는 XML, 어노테이션, JAVA 방식이 있다.


#### ▶ AOP의 지원

	관점 지향 프로그래밍.
	좋은 개발 환경에서는 개발자가 비지니스 로직에만 집중할 수 있게 한다.
	Spring Framework는 반복적인 코드를 제거해줌으로써 핵심 비지니스 로직에만
	집중할 수 있는 방법을 제공한다.
	보안이나 로그, 트랜잭션, 예외처리와 같이 비지니스 로직은 아니지만,
	반드시 처리가 필요한 부분을 주변 로직(횡단 관심사)라고 하고, 개발해야할 서비스는 메인 로직(종단 관심사)라고 한다.
	Spring Framwork는 이러한 횡단 관심사를 분리해서 설계하는 것이 가능하고, 횡단 관심사를 모듈로
	분리하는 프로그래밍을 AOP라고 한다.
	핵심 비지니스 로직에만 집중하여 코드 개발이 가능해지고, 각 프로젝트마다 다른 관심사 적용 시 코드 수정을
	최소화 할 수 있으며, 원하는 관심사의 유지보수가 수월한 코드로 구성이 가능해진다.
	※ 비지니스 로직: 서비스를 개발하기 위한 소스코드 및 알고리즘


<img width="900" src ="https://github.com/coder-juyeon/Spring/assets/122768623/1ee3c14b-b6dc-432b-a8aa-4387d8c36ab8">


#### ▶ 트랜젝션의 지원

	트랜젝션 작업의 최소 단위
	DB 작업 시 트랜잭션을 매번 상황에 맞게 코드로 작성하지 않고, 어노테이션이나
	XML로 트랜잭션을 쉽게 관리할 수 있다.


#### ▶ 단위 테스트

	전체 Application을 실행하지 않아도 기능별 단위 테스트가 용이하기 때문에
	버그를 줄이고 개발 시간을 단축할 수 있다.


#### 프로젝트 기본 경로

	1) src/main/java		: 서버단 JAVA 파일
	2) src/test/java		: 단위 테스트 JAVA 파일
	3) src/main/resources		: 설정 파일 및 뷰단 (/만 쳐도 알아서 resources까지)
	4) src/main/resources/static	: css, js, image 등 정적 파일 경로
	5) src/main/resources/templates : html 파일 경로
	6) build.gradel			: 라이브러리 관리
	7) application.yml		: Spring의 모든 설정 야멜


#### 필드주입

	사용 방법이 매우 편하다는 장점이 있다.
	주입된 객체를 불변(immutable)상태로 만들 수 없기 때문에 외부에서 수정될 위험이 있다.
	순환 참조 발생시 Application 동작 시점과 Runtime 시점 중 필드주입은 RunTime 시점에 해당하기 때문에
	메모리에 계속 할당되고 StackOverFlow가 발생했다. 하지만 2.6버전 이상부터는 Application 동작 시점에서 잡힌다.
	단위테스트에서는 필드주입만 사용
	생성자 -> 필드주입 -> 세터주입

#### Spring MVC(Front-Controller Pattern)

	MVC (Model-View-Controller) 아키텍처 패턴을 기반으로 하는 웹 개발
	
				HandlerMaping
	REQUEST		  ①	      ②↕	   ③		       ④
			  ↔	DispatcherServlet   ↔  HandlerAdapter   ↔  Controller
	RESPONSE	  ⑦	⑥↕	     ⑤↕
			View	ViewResolver
			   ↕
			HTML 및 기타


#### Spring MVC 패턴의 특징

	- HttpServletRequest, HttpServletResponse를 거의 사용할 필요 없이 구현 가능
	- 다양한 타입의 파라미터 처리, 다양한 타입의 리턴 타입 사용 가능
	- Get 방식, POST 방식 등 전송 방식에 대한 처리를 어노테이션으로 처리 가능
	- 상속/인터페이스 방식 대신 어노테이션으로만 설정 가능


#### 타임리프

	'템플릿 엔진'의 일종. html 태그에 속성을 추가해 페이지에 동적으로 값을 추가하거나 처리할 수 있음
	▶ html 태그에 속성 추가
	<html lang="en" xmlns:th="http://www.thymeleaf.org">


#### annotation 사용법
```
annotation
	클래스와 메서드에 추가하여 다양한 기능을 부여하는 역할
	Spring Framework는 해당 클래스가 어떤 역할인지 정함
	Bean을 주입
	자동으로 getter나 setter를 생성
	특별한 의미를 부여하거나 기능 부여
	
	1. Bean 등록
	2. 의존성 주입(Dependency Injection)
	3.트랜잭션 관리
	4. MVC 웹 애플리케이션 개발
```

#### ▶ Bean등록

@Bean
	Bean은 스프링 프레임워크에서 관리되는 객체를 의미
	@Bean Annotation은 개발자가 제어가 불가능한 외부 라이브러리와 같은 것들을 Bean으로 만들 때 사용
	스프링 컨테이너에 Bean으로 등록하기 위해
	예) @Component, @Service, @Repository, @Controller


#### ▶ 의존성 주입(Dependency Injection)

	객체 간의 관계를 자동으로 설정하기 위해
	@Autowired


#### ▶ 트랜잭션 관리

트랜잭션 
	데이터베이스의 상태를 변경하는 일련의 작업을 하나의 논리적인 단위로 묶은 것.
	이 작업들은 모두 성공적으로 수행되어야 하며, 그렇지 않을 경우 이전 상태로 롤백
	@Transactional


#### ▶ MVC 웹 애플리케이션 개발

	스프링 MVC를 사용하여 웹 애플리케이션을 개발할 때 어노테이션을 활용
	@Controller, @RequestMapping, @RequestParam, @ResponseBody 등의 어노테이션을 사용하여 요청을 처리하고 응답을 생성


#### @Controller

@Controller
	Controller의 역할을 수행 한다고 명시(해당 클래스를 Controller로 사용한다고 Spring FrameWork에 알린다.)

   	필요한 비즈니스 로직을 호출하여 전달할 모델(Model)과 이동할 뷰(View) 정보를 DispatherServlet에 반환 한다.

 	- Bean으로 등록

 	- @Component의 구체화 된 어노테이션
	frontController처럼 쓸 수 있다.

<img width="900" src="https://github.com/coder-juyeon/Spring/assets/122768623/efc551ae-b8a1-42c4-973d-2f2641e0103c">


#### @RequestMapping

	class와 Method를 같이 쓸때
	예) @RequestMapping("/ex/")
	공통적인 url을 설정해줌


#### @ModelAttribute

	@ModelAttribute("name")String name
	html에서 jstl을 쓰기 위해
	매개변수에 주기
	예)
	@GetMapping("ex04")
	    public void ex04(String name, Model model) {
		model.addAttribute("name", name);
		log.info(name);
	}

	= (위와 아래가 같음)

	@GetMapping("ex04")
	    public void ex04(@ModelAttribute("name")String name) {
		log.info(name);
	}


#### @RequestParam

@RequestParam
	1대1 매핑
	화면에서 받을 파라미터 이름과 자바에서 받을 매개변수 이름이 다를때 사용한다.
	예) 파라미터는 address(화면) 매개변수는 city면
	    @RequestParam("address") String city
    
@RequestParam, @ModelAttribute의 차이점
	modelAttribute은 파라미터를 객체 타입으로 받을 수 있지만
	RequestParam은 1대1 매핑으로 파라미터에 데이터 하나만 가져올 수 있다.

	예)
	public class UserSearchForm() {
		private int id;
		private String name;
		private String email;
		private String phone;
	}

	@ModelAttribute의 경우
	public String getTestPage(@ModelAttribute UserSearchForm userSearchForm){
	}

	@RequestParam의 경우
	public String getTestPage(@RequestParam int id, @RequestParam String name, @RequestParam String email,@RequestParam String phone){
	}


#### Assertions.asertThat()

 	친절한 오류 설명 및 빠른 단위 테스트 가능
 	assertj꺼 쓰기


#### REST

	- Representational State Transfer
	- 자원, 행위, 표현으로 구성되어 있다.
	- 언제, 어디서든 누구든 서버에 요청을 보낼 때 URI만으로도 데이터 및 CRUD의 상태를 이해할 수 있도록 설계하는 규칙.
	- HTTP에 존재하는 모든 자원에 고유한 URI를 부여하여 활용하는 것으로 자원을 정의하고 자원에 대한 주소를 지정하는 방법론
	- JSON 혹은 XML을 통해 데이터를 주고 받는 것이 일반적 
	- 네트워크 상에서 Client와 Server사이의 통신 방식 중 하나
	- HTTP URL을 통해 자원을 명시하고 HTTP Method(POST, GET, PUT, DELETE)를 통해 해당 자원에 대한 CRUD Operation을 적용하는 것을 의미

	* CRUD Operation
	Create : 생성(POST)
	Read : 조회(GET)
	Update : 수정(PUT)
	Delete : 삭제(DELETE)

	* RESTful
	-REST 방식을 따른 시스템

	* RESTful API
	-설계 방식이 모두 REST 규칙에 의해 작성된 API.


#### 3-tier

	3-tier
	   스프링 프로젝트는 3-tier 방식으로 구성한다.

	   ▶ Presentation Tier - 화면 계층
	      화면에 보여주는 기술을 사용하는 영역

	   ▶ Buisiness Tier - 비지니스 계층, 로직 계층
	      순수한 비지니스 로직을 담고 있는 영역

	   ▶ Persistence Tier - 영속 계층, 데이터 계층
	      데이터를 어떤 방식으로 보관하고, 사용하는 가에 대한 설계가 들어가는 영역

	3-tier의 목적
		각 영역은 독립적으로 설계되어 
		나중에 특정 기술이 변하더라도 필요한 부분을 전자제품의 부품처럼 쉽게 교환할 수 있게 하자는 방식이다.

	3-tier의 구조
		Presentation ↔ Business ↔ Persistence ↔ DBMS
				↑      ↑         ↑
			Controller   Service       Mapper

#### REST URI 규칙

	1. 소문자로 작성한다.
		대문자로 작성시 문제가 발생할 수 있기 때문에 소문자로 작성한다.

	2. 언더바 대신 하이픈을 사용한다.
		가독성을 높이기 위해서 하이픈으로 구분하는 것이 좋다.

	3. URI 마지막은 슬래시를 작성하지 않는다.	
		마지막에 작성하는 슬래시는 의미가 없다.		

	4. 계층 관계 표현 시 슬래시 구분자로 사용한다.
		계층 관계(포함 관계)에서는 슬래시로 구분해준다.

	5. 동사는 작성하면 안된다.
		행위는 URI로 표현하지 않고 HTTP METHOD를 통해 전달한다.
	
	6. 파일 확장자는 포함시키지 않는다.
		파일 확장자는 URI로 표현하지 않고 Header의 Content-Type을 사용하여
		body의 내용을 처리하도록 설계한다.

	7. 데이터를 대표할 때에는 명사를 사용하지만, 상태를 대표할 때에는 동사를 허용한다.
		http://www.app.com/writing (X)
		http://www.app.com/write (O)		

	8. URI에 사용되는 영어단어는 복수로 작성한다.



#### AOP(Aspect Oriented Programming)

	기존 코드와 부가 기능 코드를 따로 정의한 뒤 다시 합쳐서 모듈로 만드는 것이다.
	코드의 중복을 줄일 수 있으며, 핵심 로직과 주변 로직을 분리하여 관리할 수 있다.
	핵심 로직은 아니지만 반복적으로 개발에 필요한 관심사들을 주변 로직이라고 한다.
	따라서 AOP는 이러한 주변 로직을 횡단 관심사로 분리하여 작성하고 종단 관심사인
	핵심 비지니스 로직만을 해당 서버에서 작성하도록 한다.

	예) 나눗셈 프로그램 개발 시 두 개의 숫자를 나누는 것(핵심, 종단)
	0으로 나누는 지 검사하는 것(주변, 횡단)

	즉, 반복적으로 나타나는 횡단 관심사를 모듈로 분리한 후 적절한 시점에 로직을 주입하는 것이 AOP이다.
	스프링에서는 별도의 복잡한 설명 없이 간편하게 AOP의 기능들을 구현할 수 있기 때문에 중요한 특징 중 하나이다.

#### AOP를 사용할 수 있는 시점

	- Around(전 구역)
	- Before(메소드 시작 직후)
	- After(메소드 종료 직전)
	- AfterReturning(메소드 리턴 후)
	- AfterThrowing(메소드 예외 발생 후)


#### AOP 설계 순서

	1. 구현할 횡단 관심사를 의미할 수 있는 어노테이션 만들기
	2. 어노테이션을 Aspect로 등록하기
	3. 종단 관심사에 등록된 어노테이션 사용하기


<img width="900" src ="https://github.com/coder-juyeon/Spring/assets/122768623/2cea959c-d094-4328-aa52-97b58ce4e58b">

<p align="right">(<a href="#readme-top">back to top</a>)</p>


## JPA

#### ORM(Object Relational Mapping)
```
객체 진영과 RDB 진영을 자동으로 매핑하여 구조의 불일치를 개발자 대신 해결해주는 기술의 총칭이다.
객체 지향 구조에서 프로그래밍 언어를 사용하여 RDB의 데이터를 조작하는 방법이다.
ORM을 사용하면 개발자가 SQL문을 직접 작성하지 않아도 RDB와 상호 작용할 수 있다.
```

#### JPA(Java Persistence API)
```
ORM을 사용하기 위한 설계도(틀)이다.
Java Application용 RDB 매핑 관리를 위한 인터페이스이며, DBMS 벤더사에 의존하지 않고 독립적으로
ORM을 사용할 수 있는 ORM 표준이다. 인터페이스이기 때문에 구현되어 있지 않은 틀만 제공하며,
자체적인 작업을 수행하지 않는다. JPA에 설계된 구조에 맞춰서 각 메소드를 재정의하여 
직접 ORM을 구현하여 사용한다. JPA는 ORM을 사용할 수 있는 ORM 접근 방식이며, 구현되지 않은
JPA를 ORM이라고 말하기는 어렵다.
```

#### Hibernate Framework
```
모든 Java Application에 대해 객체 관계를 그대로 유지한 채 쿼리 서비스를 제공하는 오픈 소스의 경량 ORM이다.
JPA를 구현한 구현체이며, 여러 구현체 중 가장 대표적인 구현체이다.
객체 간 관계 구성을 지원하며, 상속, 지연성, 페이징 처리, 예외 처리 불필요를 지원한다.
```

#### Spring Data JPA
```
JPA를 추상화한 Repository 인터페이스를 제공하여 JPA를 쓰기 편하게 다양한 기능을 지원한다.
내부적으로는 JPA를 사용하기 때문에 JPA를 모르면 내부 구조를 이해하기 힘들 수 있다.
```

#### 객체와 관계형 데이터베이스의 차이

##### 1. 상속
```
▶ RDB의 상속
[개발자]      [기획자]

 번호      	번호
 -----------   -----------
 이름      	이름
 생년월일      	생년월일
 경력      	경력
 기술등급      	OA등급
 프로젝트 수   	클라이언트 수

또는

 [사원]

 번호
 -----------
 이름
 생년월일
 경력
 기술등급
 OA등급
 프로젝트 수
 클라이언트 수

또는

 [사원] - 슈퍼

 번호(PK)
 -----------   
 이름
 생년월일
 경력

 [개발자] - 서브   [기획자] - 서브

 번호(PK, FK)   번호(PK, FK)
 -----------   -----------
 기술등급      OA등급
 프로젝트 수   클라이언트 수

 1:1 관계에서 INSERT를 하기 위해서는 쿼리를 2번 작성해야하는 불편함이 생긴다.
 게다가 SELECT를 하기 위해서는 JOIN을 사용해야 하는데 쿼리가 굉장히 복잡해진다.
 만약에 이런 RDB의 테이블 관계를 자바 컬렉션으로 바꿀 수 있다면,

▶ 컬렉션 사용

 Developer developer = list.get(developerId);
 위와 같이 간단하게 조회할 수 있다.
```

##### 2. 연관관계
```
▶ 객체 연관 관계: 단방향으로 흘러간다(Flower에서 Pot접근은 가능, Pot에서 Flower접근 불가능)

Flower   →   Pot

id      	id
name      	shape
Pot pot      color


▶ RDB 연관 관계: 양방향으로 흘러간다(FLOWER에서 POT을, POT에서 FLOWER를 접근할 수 있다)

 FLOWER   ↔   POT

 ID(PK)      ID(PK)
 --------   --------
 NAME      	SHAPE
 POT_ID(FK)   COLOR


▶ RDB 중심 설계

 class Flower{
    Long id;
    String name;
    String potId; //FK는 RDB방식에서의 연관관계이기 때문에 객체방식으로 바꿔야 함.
 }

 RDB 방식으로 설계하면, 조회 시 JOIN을 하여 FLOWER테이블과 POT테이블에서 각각 필요한 정보를 가져와
 각 객체에 담아주거나 DTO에 담아주어야 한다.

▶ 객체 중심 설계

 class Flower{
    Long id;
    String name;
    Pot pot; // 참조로 연관관계를 맺도록 함.
 }

 flower.setPot(pot)형태와 같이 복잡하게 작업해야 한다.

▶ 컬렉션 사용

 하지만 만약 자바 컬렉션으로 관리가 가능하다면,

 list.add(꽃);
 Flower flower = list.get(flowerId);
 Pot pot = flower.getPot();

 훨씬 편하게 작업이 가능하다.
```

##### 3. 그래프 탐색
```
┌─Market─┐
│        │
Client──Order   Flower──Pot
│
Delivery  

객체는 모든 객체 그래프를 탐색할 수 있어야 한다.

하지만 SQL 작성 시 이미 탐색 범위가 결정된다.
만약 Market과 Flower를 JOIN해서 조회를 한다면,
market.getFlower()는 사용 가능하지만
market.getPot()는 null일 수 밖에 없다.

따라서 엔티티에 대한 신뢰가 무너질 수 밖에 없다.

Market market = marketDAO.findById(marketId);
market.getFlower(); // null이 아니라고 확신할 수 없다.
market.getOrder().getClient(); // null이 아니라고 확신할 수 없다.

marketDAO에 있는 findById()를 분석하지 않는 이상 각 엔티티에 대해 신뢰할 수 없다.
따라서 상황에 따라 조회에 대한 메소드를 여러 개 선언해놓아야 한다.

marketDAO.getFlower();
marketDAO.getOrderWithClient();
marketDAO.getOrderWithClientWithDelivery();
...

하지만 위와 같은 방법은 사실상 불가능에 가깝다.
```

##### 4. 값 비교
```
SQL 실행 결과를 담은 뒤 생성자를 호출하여 객체에 담으면 매번 new가 사용되기 때문에
동일한 조회 결과의 객체일지라도 주소가 모두 다르다.

▶ 컬렉션 사용
하지만 만약 자바 컬렉션에서 객체 조회가 가능하다면 
list.get(memberId) == list.get(memberId);
```
##### 5. 결론
```
즉, 객체지향으로 설계할 수록 작업이 오히려 복잡해지고 늘어나기 때문에 RDB 중심으로 설계할 수밖에 없다.
RDB를 자바 컬렉션에 저장하듯 사용하면 굉장히 편해지고 많은 문제가 해결되는데,
바로 이 기술을 JPA라고 한다.
```

#### JPA를 사용해야 하는 이유
```
1. SQL 중심 개발에서 객체 중심으로 개발

2. 생산성
  저장: jpa.persist(market);
  조회: jpa.find(marketId);
  수정: market.setMarketName("이마트");
  삭졔: jpa.remove(market);

3. 유지보수
  클라이언트가 새로운 필드를 요청하여 새로운 필드 추가 시
  클래스 안에 필드만 한 개 추가하면 끝. SQL문을 수정할 필요 없음.

4. 패러다임의 불일치 해결
```

#### JPA와 상속
```
Employee	Developer extends Employee

employeeId	developerId
employeeName	developerLevel
  developerProjectCount


- INSERT

▷ 개발자
  jpa.persist(developer);

▷ JPA
  INSERT 두 번 해줌.

자식 필드에 부모 필드가 포함되어 있기 때문에 필요한 데이터를 자식 객체에 채우기만 하면 됨.

- SELECT

▷ 개발자
  jpa.findById(Developer.class, developerId);

▷ JPA
  부모 테이블과 JOIN해서 데이터를 가져옴
```

#### JPA와 연관관계
```
Flower	→	Pot

id		id
name		shape
Pot pot	color

flower.setPot(pot);
jpa.persist(flower);

jpa.findById(Flower.class, flowerId);
```

#### JPA와 객체 그래프 탐색
```
 ┌─Market─┐
 │        │
Client──Order	Flower──Pot
 │
 Delivery  


Flower flower = jpa.findById(Flower.class, flowerId);
Pot pot = flower.getPot();
market.getOrder().getClient();

※ SELECT 결과가 없으면 문제가 생기기 때문에 NPE 체크는 반드시 해야한다.
```


#### JPA와 값 비교
```
Market market1 = jpa.findById(Market.class, marketId);
Market market2 = jpa.findById(Market.class, marketId);

market1 == market2;

동일한 트랜잭션에서 조회한 엔티티는 무조건 같다.
```

#### JPQL
```
객체 지향 쿼리 언어
엔티티 객체를 대상으로 쿼리를 작성해야 한다.
SQL은 SQL로 변환된다.
키워드는 대소문자 구분이 없다.
별칭(as) 필수
typedQuery: 리턴 타입을 정확히 알때
Query: 리턴 타입이 정확하지 않을때

JPQL을 사용하는 QueryDSL은 무조건 쿼리가 발생한다.
가져온 결과를 1차 캐시에 INSERT 한다.
만약 동일한 객체가 1차 캐시에 존재하면, 쿼리 실행 결과를 버린다.
```

#### Entity의 4가지 상태
```
영속 상태 : 1차 캐시에 등록된 상태
준영속 상태 : detached instance이며. detached()를 사용하여 1차 캐시로부터 분리된 상태
비영속 상태 : 1차 캐시에 등록되지 않은 상태
삭제 상태: remove()를 사용하여 1차 캐시로부터 삭제된 상태
영속 상태인 객체일 경우에만 삭제가 가능하다.
```

#### table 전략

##### 1.SINGLE_TABLE 전략
```
단일 테이블 전략
모든 자식 객체를 모아서 하나의 테이블로 생성하며, 
구분 컬럼을 추가하여 각 정보를 구분할 수 있도록 하는 전략
부모 테이블 extends 해주기
조인을 사용할 필요 없이 조회 가능.
쿼리를 단순하게 작성하여 조회할 수 있다.
자식 엔티티의 필드는 @NotNull을 사용할 수 없다.
테이블의 컬럼이 많아질 수록 조회 성능이 떨어질 수 있다.
```

##### 2.TABLE_PER_CLASS 전략
```
엔티티 당 한개 테이블 전략
부모 엔티티와 자식 엔티티마다 테이블을 생성하는 전략, 실무에서의 사용을 권장하지 않는다.
자식 엔티티의 필드는 @NotNull 사용할 수 있다.
자식 테이블끼리 JOIN시 겹치는 컬럼으로 인해 조회 성능이 떨어지고 쿼리가 복잡해진다.

부모 클래스에 abstract를 붙이면 부모를 단독으로 쓰지 않고 자식 테이블 2개 생성
```

##### 3.joined 전략
```
1.  부모 엔티티 PK를 슈퍼키로 설정하고, 자식 엔티티의 PK를 서브키로 설정하는 전략
2.  정규화 방식
3.  조회 시 JOIN으로 인해 성능 저하가 발생한다.
4.  복잡한 쿼리 작성 필요
5.  INSERT 작성 시 쿼리 2번 실행
```

```
성능 좋은순
일반쿼리 -> 한방쿼리 -> 쿼리 두번
```

#### fetch
```
연관관계를 맺고 있는 경우, 조회시 객체를 가져오는 방법을 기술하는 옵션이다.
- EAGER
	모든 연관관계 객체를 JOIN하여 한방 쿼리로 가져온다.
- LAZY
	첫 객체만 SELECT 하고, 연관관계 객체를 사용할 때 쿼리가 다시 실행된다.
 
복잡한 연관관계 속에서 EAGER로 사용하면 불필요한 JOIN이 발생하기 때문에 성능이슈가 발생할 수 있다.
따라서 실무에서는 LAZY로 설정해야 하며,
한방 쿼리가 필요할 때에는 JPQL을 사용하여 정확히 원하는 테이블끼리만 JOIN하여 사용한다.
```

#### cascade(영속성 전이)
```
엔티티가 영속상태로 전활될 때 참조 엔티티도 영속상태로 같이 전환되고,
삭제상태로 전환될 때도 참조 엔티티까지 삭제상태로 전환된다.
즉, 연관관계 객체에도 영속 상태를 전이하고 싶을 때 사용하는 옵션이다.

참조 엔티티 모두 영속 상태로 전환해야 한다.
하지만 cascade에 CascadeType.PERSIST를 설정하면,
자동으로 참조 엔티티까지 영속 상태로 전환되기 때문에
아래의 코드를 작성할 필요 없다. 
boardDAO.save(reply1);
boardDAO.save(reply2);

엔티티를 영속상태로 변경하고 참조 엔티티까지 영속상태로 변경되었다면,
현재 1차 캐시에는 엔티티 및 참조 엔티티 모두 등록되어 있는 상태이다.

1:1 관계에서는 추후 유지보수시 N이 될 수 있는 개체를 연관관계의 주인으로 설정한다.
CascadeType.Remove는 로직에 따라 설정해야 하며,
잘못 설정 시 참조 엔티티 삭제 후 기존 엔티티까지 삭제하는 이슈가 발생한다.
반려동물 정보를 삭제하면 주인 정보도 삭제된다.
```

#### Hibernate의 쓰기지연저장소 쿼리 실행 순서
```
-find, updqte, insert, remove 순서로 실행된다.
-find를 하기 전에 대상 엔티티 쿼리가 있다면, flush 후 find가 진행된다.
```

<img width="900" src="https://github.com/coder-juyeon/JPA/assets/122768623/1d681348-a215-4a29-926b-6d6f327b334d">

#### FK
```
insert 실행 시, @JoinColum으로 설정된 객체로만 FK를 추가할 수 있다.
@joinColum이 설정되지 않은 연관객체로는 FK를 추가할 수 없다.
```

#### 단방향
```
INSERT 실행 시, @JoinColumn으로 설정된 객체로만 FK를 추가할 수 있다.
//        @JoinColumn이 설정되지 않은 연관객체로는 FK를 추가할 수 없다.
```

#### 양방향 
```
관계에서는 @JoinColumn을 사용하지 않아도 mappedBy로 FK를 설정한다.
mappedBy를 생략하면 모든 테이블에 FK가 생긴다.
RDB에서 설계할 때 N 쪽에 FK를 두기 때문에
FK를 필드로 가지고 있는 엔티티가 연관관계의 주인이 되어야 한다.
```

#### mappedBy 
```
단방향 2개로 양방향을 설계했을 경우 서로 FK를 수정 및 추가할 수 있다.
그런데, 서로 수정을 하게 되면 양쪽 모두의 fk를 동기화해야 하기 때문에(일관성) 번거롭고 무결성에 위반될 수도 있다.
따라서, mappedBy를 사용하여 N 쪽의 FK를 연관관계의 주인으로 설정해야 한다.
mappedBy에 작성한 필드명은 RDB 진영에서 "_id"를 붙여 FK의 이름으로 사용된다. 

문제 발생
mappedBy를 question으로 설정했기 때문에,
question_id는 Question엔티티에서 관리하게 된다.
따라서 Answer 엔티티에 question_id를 추가하고 싶다면,
answer에 question을 넣어주어야 한다.
```

#### 편의메소드 
```
연관관계의 주인 엔티티가 아닌 반대편 엔티티로 FK를 추가하고자 할 때
NULL값을 기존 FK값으로 변경하고자 사용한다.
```

#### orphanRemoval = true 
```
컬렉션으로 삭제된 객체들까지 전부 감지하도록 설정
```

#### JpaRepository<Type, Id>
```
Type: 엔티티 이름
Id: PK 자료형
```

#### Spring Data JPA
```
JpaRepository를 상속받은 인터페이스에 직접 구현체를 만든 후 주입해준다.
```

#### @NoArgsConstructor(access = AccessLevel.PROTECTED)
```
외부에서 객체 생성을 막음과 동시에, Spring에서는 사용할 수 있도록 PORTECTED로 설정한다.
```

#### @Builder
```
기본 생성자 만든 후 setter 썼을 때 빼먹은 값이 있을 수 있음
초기화 생성자의 모든 매개변수에 값이 들어와야 메모리에 할당된다.
```

#### 쿼리 메소드
```
메소드 이름으로 쿼리를 생성할 수 있다.
```

#### 정규화
```
정규화란, 한 개의 테이블에서 이상현상 또는 동일한 데이터 중복 발생으로 인해 문제가 생길 경우 여러 테이블로 분리하는 작업을 말한다. 
정규화 후에는 조회 시 JOIN을 사용하여 데이터를 가져오게 된다.
```
#### 반정규화
```
정규화란, 한 개의 테이블에서 이상현상 또는 동일한 데이터 중복 발생으로 인해 문제가 생길 경우 여러 테이블로 분리하는 작업을 말한다. 
정규화 후에는 조회 시 JOIN을 사용하여 데이터를 가져오게 된다.

**
정규화: JOINED
반정규화: SINGLE_COLUMN
```

#### 패치조인
```
패치 조인 시, 해당 테이블의 항목만 다른 절에서 사용가능하다.
pay, pay.order를 패치 조인으로 진행 시, pay만 select 절에서 사용할 수 있다.(pay, order, pay.product X)
from 절에 pay만 작성하고 다른 절에서 원하는 객체를 그래프 탐색으로 접근해야 한다.
```
#### 패치조인을 사용해야 할 때
```
해당 객체를 select절에 작성한 뒤 java쪽에서 엔티티 그래프 탐색을 진행할 때
select(order).from(order).join(order.member).fecthJoin()
```

#### 패치 조인을 사용하면 안될 때
```
select절에 원하는 연관 엔티티를 작성하거나 DTO를 작성해야 할 때
select(order.member).from(order)

기준
  1	    :	  N 	=>  	select(a) 쓴다 ( select(a).~ join(). fetchJoin())
  N 	    :	  1  	=> 	select(b.a)를 쓴다 ( select(b.a) ~ join())
1-> a

패치조인시 추가 적인 조건절은 on절이 아닌 where절에 작성해야 한다.
```

#### DTO(QueryProjection)
```
- 집계함수 사용
- 화면으로 여러 엔티티를 보낼 때
1. 두 개의 엔티티일 경우(fetchJoin, QueryProjection이 필요 없음)
2. 세 개 이상의 엔티티일 경우(join이 가능하면 QueryProjection사용)
```

#### 세션
```
JWT -> 세션저장 안하는 방식 토큰
security

```

#### 스프링 세션 문제점
```
서버 증설시 세션 정보 공유 불가능
```

#### rest로 설계하는 이유
```
	타언어, 타서버와 세션이 연결이 되야됨
```
#### L4 switch
```
동일한 ip로 연결해도 분배기 역할
클라우드 인프라 구축 (클러스터링)
```

#### Redis
```
no sql, no schema
key, value
속도 빠름
```

#### Spring Security
```
스프링 기반의 어플리케이션에서 보안을 위해 인증과 권한 부여를 사용해 접근을 제어하는 프레임워크
```

#### Spring Security 흐름
<img width="900" src="https://github.com/coder-juyeon/JPA/assets/122768623/0a5e2392-1666-4573-b819-b292c745f23d">

<p align="right">(<a href="#readme-top">back to top</a>)</p>
