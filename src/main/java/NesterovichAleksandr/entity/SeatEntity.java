package NesterovichAleksandr.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat", schema = "online_reserved_tickets", catalog = "")
public class SeatEntity {
    private int idseat;
    private int row;
    private int place;

    @Id
    @Column(name = "idseat", nullable = false)
    public int getIdseat() {
        return idseat;
    }

    public void setIdseat(int idseat) {
        this.idseat = idseat;
    }

    @Basic
    @Column(name = "row", nullable = false)
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Basic
    @Column(name = "place", nullable = false)
    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeatEntity that = (SeatEntity) o;

        if (idseat != that.idseat) return false;
        if (row != that.row) return false;
        if (place != that.place) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idseat;
        result = 31 * result + row;
        result = 31 * result + place;
        return result;
    }
}
