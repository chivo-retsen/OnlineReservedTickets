package NesterovichAleksandr.OnlineReservedTickets.service;

public class IndividualCabinet {

    private int login;
    private String firstName;
    private String lastName;
    private long phoneNumber;

    public IndividualCabinet(){

    }

    public void createReserverTicket(){

    }

    public void readReserverTicket(){

    }

    public void deleteReserverTicket(){

    }

    public void setLogin(int login) {
        this.login = login;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
