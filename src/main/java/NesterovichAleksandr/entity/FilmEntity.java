package NesterovichAleksandr.entity;

import javax.persistence.*;

@Entity
@Table(name = "film", schema = "online_reserved_tickets", catalog = "")
public class FilmEntity {
    private int idfilm;
    private String name;
    private String genre;
    private String country;
    private int duration;
    private int yearOfIssue;

    @Id
    @Column(name = "idfilm", nullable = false)
    public int getIdfilm() {
        return idfilm;
    }

    public void setIdfilm(int idfilm) {
        this.idfilm = idfilm;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "genre", nullable = false, length = 20)
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 20)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "duration", nullable = false)
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "yearOfIssue", nullable = false)
    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmEntity that = (FilmEntity) o;

        if (idfilm != that.idfilm) return false;
        if (duration != that.duration) return false;
        if (yearOfIssue != that.yearOfIssue) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idfilm;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + duration;
        result = 31 * result + yearOfIssue;
        return result;
    }
}
