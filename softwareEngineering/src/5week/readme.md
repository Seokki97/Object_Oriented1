5.5 제어 모델링
================
### 액티비티 다이어그램
- 제어 흐름을 모델링
- 알고리즘이나 프로세스에서 작업 절차를 모델링
- 예외 처리가 포함된 흐름도와 유사
- 상호작용 다이어그램을 보완

### 액티비티 다이어그램에서 사용하는 기본 심볼
- Activity : 계산 또는 프로세스
- Transition : 하나의 액티비티에서 다른 액티비티로 제어가 넘어감
- branch,merge: 조건부에서 제어 흐름


### 액티비티 다이어그램의 스윔레인과 병렬 수행 표현

-----------------

5.6 모델 검증
===================
### 요구 검증과 같이 모델링 작업 또한 검증이 필요

### 모델 검증 방법 (체크리스트)
- 리뷰: 워크스루, 인스펙션 등 사람의 눈으로 확인하는 방법으로 체크리스트를 활용
- 테스팅: 모델에 근거하여 테스트 데이터를 찾아내고 구현 후 테스팅
- 정형적 방법: 요구가 정확하고 모델이 일관성이 있음을 수학적으로 증명하는 방법
- 예 ) 상태 다이어그램 안의 각 상태에 대한 조건을 식으로 나타내고 변환 과정을 검증
- 프로토타이핑: 예상대로 동작함을 보이기 위해서 모델을 기반으로 프로토타입을 제작
- 요구 추적: 모델로부터 요구를 거꾸로 추적하는 방법

---------------
 일관성 체크
============

### UML 다이어그램 한쪽에 표현된 사실이 다른 UML 다이어그램의 정보와 모순되지 않아야 함

#### 유스케이스 다이어그램과 시퀀스 다이어그램에 대해 다음을 체크
- 유스케이스에 대한 명세가 기술되어 있고, 매칭되는 시퀀스 다이어그램이 있는지 체크

####  시퀀스 다이어그램 안에 포함된 클래스와 메세지가 클래스 다이어그램에 빠지지 않고 표현되었는지 체크
- 메세지를 받는 클래스에 메서드의 정의가 되어 있는지 확인

#### 상태 다이어그램과 클래스 다이어그램을 크로스체크
- 상태의 변화가 클래스 내의 메소드 호출에 의해 발쌩할때 해당 메소드가 정의되어 있는지를 확인