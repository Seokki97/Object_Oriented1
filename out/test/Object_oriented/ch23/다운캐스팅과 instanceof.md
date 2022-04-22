다운캐스팅과 instanceof
================
다운캐스팅
--------------------
1. 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
2. 하위 클래스로의 형 변환은 명시적으로 해야함

Customer vc = new VIPCustomer();  
VipCustomer vCustomer = (VipCustomer)vc;