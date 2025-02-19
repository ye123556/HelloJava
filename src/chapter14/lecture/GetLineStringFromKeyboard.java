package chapter14.lecture;
//20250219 - 7
import java.io.*;

public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws IOException {
        // InputStream을 Reader로 변환하고 다시 BufferedReader를 연결
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            System.out.print("입력하세요: ");
            String lineStr = br.readLine(); // 라인 단위로 문자열을 읽음

            if(lineStr.equals("q") || lineStr.equals("quit"))
                break;
            System.out.println("입력된 내용: " + lineStr);
            System.out.println();
        }

        br.close();
    }
}
