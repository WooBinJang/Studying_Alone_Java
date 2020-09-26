# <혼자 공부하는 자바 책 내용 정리!!!>

# 형 변환
- 자동 형 변환 : 큰 허용 범위 <- 작은 허용 범위
- 강제 형 변환 : 작은 허용 범위 <- 큰 허용 범위
- String 타입을 기본 타입(int , double ...)으로 형 변환 : Integer.parseInt() String -> int
        									            Double.parseDouble() String -> double 

# 논리타입 ( ^ ) 
- 배타적 논리합 : 하나가 true 또 다른 하나가 false 인 경우 결과가 ture 이다

# for문
- 조건식, 초기화식 등 생략이 가능하다.

# break문
- break문은 가장 가까운 반복문만 종료시킨다. 만약 바깥쪽 반복문 종료시 라벨을 붙이고 break 라벨; 을 사용해야한다.

# 참조타입
- String / 배열 / 열거 / 인터페이스
- 스택 영역에 값이 아닌 힙영역에 생긴 번지가 저장
- 참조 타입변수 간의 비교연산자(==,!=) 시 값이 아닌 같은 객체를 참조하는지 비교

# 메모리 영역
- 메소드 영역  = 클레스 코드들이 저장 정적필드 메소드 .class 클래스에 바이트코드들이 저장
- 힙영역 = 클래스로 부터 생성된 객체들이 저장
- JVM 스택 영역 = 메소드가 호출될 때마다 프레임이 추가되고 (변수) 메소드가 종료되면 프레임이 제거

# 배열의 초기값
- 숫자타입 (int , double ,long) : 0
- String타입 : NUll
- 논리타입(boolean) : False

# 다차원 배열
- int [][] arr = new int [2][3]  => 2행 3열 배열
- 계단형 다차원 배열  int [][] arr = new int[2][];
					 arr[0] = new int[2];
					 arr[1] = new int[3];`
- 값 목록을 활용한 다차원 배열 int [][] arr ={{1,2},{3,4}}; 


# 배열복사
- System.arraycopy(원본배열 , 인덱스(원본배열) , 대상배열 , 인데스(대상배열) , 몇개);

# 향상된 for문
- for (타입 변수 : 배열) { ... } 
- 변수의 배열요소를 대입 후 배열의 요소 만큼 반복하고 끝남	

# 열거 타입
- 데이터 중에서 한정된 값을 갖는 타입 ex) 요일, 계절 등

# 객체 
- 물리적으로 존재하거나 추상적으로 생각할 수 있는것 중에서 자신의 속성을 가지며 식별 가능한 것 
- 속성(필드) + 동작(메소드)로 구성

# 객체 간의 관계
- 집합 관계 : 부품과 완성품의 관계 ex)  자동차 <- 엔진, 타이어, 핸들
- 사용 관계 : 객체 간의 상호작용 ex) 사람 -> 자동차
- 상속 관계 : 상위 객체를 기반으로 하위 객체를 생성 ex) 자동차 -> 기계

# 클래스(class)
- 자바의 설계도 
- 클래스에는 객체를 생성하기 위한 메소드와 필드가 정의되어 있다.

# 인스턴스
- 클래스로부터 만들어진 객체

# 라이브러리
- 객체 생성 및 메소드 제공 역할

# 클레스 멤버
- 필드 : 객체의 데이터가 저장되는 곳 
- 생성자 : 객체 생성 시 초기화 역활 담당
- 메소드 : 객체의 동작에 해당하는 실행 블록

# 필드 사용
- 클래스 내부에서 필드 이름으로 읽고 변경
- 클래스 외부에서 클래스로부터 객체 생성한 뒤 필드 사용
- 필드 선언은 생성자나 메소드 내부에서는 선언 불가

# 타입의 초기값
- 정수 타입 (byte, short, int long) = 0
- char 타입 = \u0000 (빈 공백)
- float 타입 = 0.0F
- double 타입 = 0.0
- boolean 타입 = false
- 참조 타입 (배열, 클래스(String), 인터페이스) = null

# 생성자
- 클래스로부터 new 연산자로 객체를 생성할 때 호출되어 객체의 초기화를 담당
- 생성자는 생략 가능하다 (클래스 내부에서 바이트 코드에 자동 추가)
- 생성자의 매개 변수는 생략할 수도 있고 여러 개 선언할 수도 있음
- 생성자의 매개 변수가 선언 될 경우 생성자 호출 시 매개 변수 값을 입력해줘야 함.
- 필드와 매개 변수 이름이 완전히 동일한 경우 this. 필드로 표현

# 생성자 오버로딩
- 매개 변수 달리하는 생성자를 여러 개 선언

# 메소드
- 리턴값이 없을 수도 있음 void 타입 
- void문에서 return 문을 사용하여 메소드 실행을 종료
- 리턴값이 있는 경우 리턴 타입이 선언부에 명시
- 매개 변수의 개수를 모를 경우 : 배열 타입으로 선언
- 객체 내부의 메소드호출 시 리턴 값이 있을경우 리턴값이 담을 수 있는 변수가 있어야하나 void 타입일 경우 변수 없이 가능하다.

# 메소드 오버로딩
- 같은 이름의 메소드를 여러 개 선언
- 매개값을 다양하게 받아 처리할 수 있도로 하기위함
- 매개변수의 타입, 개수, 순서 같은 경우 매개변수 이름이 달라도 메소드 오버로딩이 아니다.

# 인스턴스 멤버
- new 연산자로 객체를 생성한 후 사용할 수 있는 필드와 메소드 

# 정적(static)멥버
- 클래스에 고정된 멥버로서 객체 생성하지 않고 사용 할 수 있는 필드와 메소드

# 인스턴스 멤버와 정적 멤버 선택 기준
- 객체마다 가를 수 있는 필드 값 -> 인스턴스 필드로 선언
- 객체마다 다를 필요가 없는 필드값 -> 정적 필드로 선언
- 메소드 블록에 인스턴스 필드 또는 인스턴스 메소드가 사용할 경우 -> 인스턴스 메소드로 선언
- 메소드의 매개변수로만 작성이 되었거나 static 필드로만 작성되어 있을 경우  -> 정적 메소드로 선언

# 정적 메소드(static) 선언 시 주의할 점
- 정적 메소드 선언 시 그 내부에 인스턴스 필드 및 메소드 사용 불가
- 정적 메소드 선언 시 그 객체 자신 참조인 this 키워드 사용 불가

# 싱글톤
- 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
- new 연산자를 통해 호출하는 것을 불가하도록 private 접근 제한자 사용
 
# final 필드
- 초기값이 저장되면 최종값이 되어 프로그램 실행 도중 수정 불가
- 인스턴스 final 필드 : 객체에 한번 초기화된 데이터를 변경 불가로 만들 경우 ex) 주민번호
- final  타입 필드; // 객체마다 초기값이 다른 경우 생성자에서 초기화 
- 정적 final 필드 : 불변의 값인 상수를 만들 경우 ex) PI (관례적으로 모두 대문자로 작성)
- static final 타입 상수 =초기값;

# 패키지
- 클래스를 유일하게 만들어주는 식별자 역할
- 패키지의 물리적인 형태는 파일 시스템의 폴더
- 패키지 이름은 모두 소문자로 작성하는 것이 관례

# 접근 제한자
- 클래스와 인터페이스 및 이들이 가진 멤버의 접근 제한
- 접근 제한이 강화 : private > default > protected > public 
- private : 클래스 내부에서만 사용가능하며 외부에서는 사용할 수 없도록 함
- default : 같은 패키지에 소속된 클래스에서만 사용할 수 있도록 함
- protected : 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 함
- public : 외부 클래스가 자유롭게 사용할 수 있도록 함

# 클래스 접근 제한
- 같은 패키지 내에서만 사용할 것인지 다른 패키지 내에서도 사용할 수 있도록 할 것인지 결정 
- default 같은 패키지에서만 사용 가능 / public 다른 패키지에서도 사용 가능

# Getter 메소드 
- 외부로 필드값을 전달하는 것이 목적
- 필드값을 가공해서 외부로 전달할 수도 있음  ex) 필드값인 마일을 km단위로 환산 후 외부로 리턴

# Setter 메소드 
- 외부의 값을 받아 필드의 값을 변경하는 것을 목적
- 매개값 검증하여 유효한 값만 필드로 저장 할 수 있음 ex) 스피드는 음수일 수가 없으므로  if 문을 이용하여 값을 변경
