package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview incepton = new MovieReview();
        incepton.title = "인셉션";
        incepton.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {incepton, aboutTime};

        for (MovieReview review : movieReviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
