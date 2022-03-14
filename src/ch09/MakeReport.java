package ch09;

//StringB
public class MakeReport {
    StringBuffer buffer = new StringBuffer();

    private String line = "=====================\n";
    private String title = " 이름\t    주소 \t\t  전화번호   \n";

    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("James \t");
        buffer.append("Seoul Korea");
        buffer.append("010-9240-0996\n");

        buffer.append("Jenny");
        buffer.append("NewYork \t");
        buffer.append("010-5587-9752\n");

    }

    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){ //외부에서 쓸수있는 유일한 메서드.
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

}
