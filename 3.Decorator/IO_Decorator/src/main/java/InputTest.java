package main.java;

import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public void method01() {
        InputStream resource = getClass().getClassLoader().getResourceAsStream("test.txt");
        if (resource == null) {
            System.out.println("지정된 파일을 찾을 수 없습니다.");
            return;
        }

        System.out.println("바보" + resource + "바보");

        try (InputStream is = new LowerCaseInputStream(resource)) {
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("오류 발생: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        new InputTest().method01();
    }
}
