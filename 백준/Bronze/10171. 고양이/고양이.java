public class Main {
    public static void main(String[] args) {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}


// 고양이 출력에선 1번을 선택해서 풀이함.
// 중요 : \출력을 위해 \\ 으로 기재하는 거 신경쓰기
// 출력하는 방법을 살펴보자.
// 1. 가장 기본적인 System.out.println 사용
//      => 속도가 느리다.
//          why? 리소스를 많이 사용해 성능 부하를 초래하기 때문
// 2. BufferedWriter 사용
//      => 속도가 빠르다.
//          why? 버퍼에 저장해두었다가 한번에 출력하는 방식 때문
//          (사용이 끝나면 무조건 .flush()로 스트림을 비우고, .close()로 스트림을 종료해야함)
// 3. StringBuilder 사용
//      => 개행해주는 메서드가 없음.
//         \n 을 통해 개행
// 4. StringBuffer 사용 (StringBuilder와 사용 방법이 같음)