package Chapter05.lecture;

import Chapter05.PrintArray;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newStrArray = new String[5];

        //System.arraycopy(src(원본), srcPois, dest, destpos, length); // 원본, 복사 시작위치, 복사당할 배열,복사할 대상의 어느 시작지점을 쓸것인지,복사할 데이터 길이
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
