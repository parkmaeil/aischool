package kr.ac.model;
// 영화(Movie) : 제목, 주인공, 금액, 개봉일, 등급(12)
public class Movie {
   private String title;
   private String character;
   private int cost;
   private String date;
   private int rating;
    public Movie() {
    }

    public Movie(String title, String character, int cost, String date, int rating) {
        this.title = title;
        this.character = character;
        this.cost = cost;
        this.date = date;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", character='" + character + '\'' +
                ", cost=" + cost +
                ", date='" + date + '\'' +
                ", rating=" + rating +
                '}';
    }
}
