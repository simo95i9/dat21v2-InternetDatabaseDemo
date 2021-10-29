package gredal.internetdatabasedemo.entities;

import java.util.regex.*;

public class Movie {
    private static final Pattern pattern = Pattern.compile("^(.+)(, )(The.*)$");

    private Integer id;
    private String year;
    private String length;
    private String title;
    private String subject;
    private String popularity;
    private String awards;

    public Movie(Integer id, String year, String length, String title, String subject, String popularity, String awards) {
        this.id = id;
        this.year = year;
        this.length = length;
        this.title = title;
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
        Matcher matcher = pattern.matcher(this.title);
        if (matcher.find()) {
            return matcher.group(3) + " " + matcher.group(1);
        }
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
