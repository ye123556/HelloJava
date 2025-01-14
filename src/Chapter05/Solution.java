package Chapter05;
class Solution {
    public static void main(String[] args) {

        String str1 = "tbt";
        String str2 = "tbbttb";
        System.out.println(contains(str1, str2) ? 1 : 0);
    }

    private static boolean contains(String str1, String str2) {
        //'str2'에서 'str1'의 시작 위치를 찾기 위해 반복문을 실행.
        //'str2.length() - str1.length'는 검색 범위를 제한하여
        //'str1'가 'str2'을 초과하지 않도록 방지
        for(int i = 0; i <= str2.length() - str1.length(); i++) {
            // str1의 나머지 문자들도 일치하는지 확인하기 위한 내부 반복문
            if (str2.charAt(i) == str1.charAt(0)) {
                int j;
                for(j = 1; j < str1.length(); j++) {
                    // str1의 문자와 str2의 대응하는 문자가 일치하지 않으면 중단
                    if(str2.charAt(i+j) != str1.charAt(j)) {
                        break;// 내부 반복문을 종료하고 다음 위치에서 검색을 계속
                    }
                }
                // str1의 모든 문자가 일치했는지 확인
                if(j == str1.length()) {
                    return true;//일치하는 부분 문자열을 찾았으므로 true 반환
                }
            }
        }
        // 반복문이 끝날 때까지 일치하는 부분 문자열을 찾지 못하면 false 반환
        return false;
    }
}