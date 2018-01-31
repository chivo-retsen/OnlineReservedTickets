package NesterovichAleksandr.OnlineReservedTickets.service;

public class Film {

    private int idFilm;
    private String name;
    private String genre;
    private String country;
    private int duration;
    private int yearOfIssue;

    public Film(){

    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getName(){
      return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public int getDuration() {
        return duration;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

}
