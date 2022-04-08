package ch14;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance(); //클래스 이름으로 가져다쓴거
        Company company2 = Company.getInstance();

        System.out.println(company);
        System.out.println(company2);
    }
}
