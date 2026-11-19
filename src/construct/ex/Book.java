package construct.ex;

public class Book {
    String title;
    String author;
    int page;


    //기본생성자
    Book() {
        this("", "", 0);
    }


    //모든 필드값 받기
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    //페이지 필드 기본값 설정
    Book(String title, String author) {
        this(title, author, 0);
    }


    //책 정보 보여주기
    void displayInfo() {
        System.out.println("제목: " + title + " | 저자: " + author + " | 페이지: " + page);
    }
}
