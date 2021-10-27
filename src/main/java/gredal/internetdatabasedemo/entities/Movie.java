package gredal.internetdatabasedemo.entities;

public class Movie {
    private Integer id;
    private String title;
    private String year;
    private String length;
    private String subject;
    private String popularity;
    private String awards;

    public Movie(Integer id, String title, String year, String length, String subject, String popularity, String awards) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.length = length;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", length='" + length + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity='" + popularity + '\'' +
                ", awards='" + awards + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getLength() {
        return length;
    }

    public String getSubject() {
        return subject;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getAwards() {
        return awards;
    }
}
