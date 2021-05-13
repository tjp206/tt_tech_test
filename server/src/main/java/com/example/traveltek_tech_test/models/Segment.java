package com.example.traveltek_tech_test.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "segments")
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "arrcode")
    private String arrcode;
    @Column(name = "arrdate")
    private LocalDate arrdate;
    @Column(name = "arrtime")
    private LocalTime arrtime;
    @Column(name = "arrterminal")
    private String arrterminal;

    @Column(name = "bookingclass")
    private String bookingclass;
    @Column(name = "seatclass")
    private String seatclass;

    @Column(name = "depcode")
    private String depcode;
    @Column(name = "depdate")
    private LocalDate depdate;
    @Column(name = "deptime")
    private LocalTime deptime;
    @Column(name = "depterminal")
    private String depterminal;

    @Column(name = "flightid")
    private int flightid;
    @Column(name = "flightno")
    private String flightno;
    @Column(name = "journey")
    private String journey;

    public Segment(String arrcode, LocalDate arrdate, LocalTime arrtime, String arrterminal,
                   String bookingclass, String seatclass, String depcode, LocalDate depdate,
                   LocalTime deptime, String depterminal, int flightid, String flightno, String journey) {
        this.arrcode = arrcode;
        this.arrdate = arrdate;
        this.arrtime = arrtime;
        this.arrterminal = arrterminal;
        this.bookingclass = bookingclass;
        this.seatclass = seatclass;
        this.depcode = depcode;
        this.depdate = depdate;
        this.deptime = deptime;
        this.depterminal = depterminal;
        this.flightid = flightid;
        this.flightno = flightno;
        this.journey = journey;
    }

    public Segment () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArrcode() {
        return arrcode;
    }

    public void setArrcode(String arrcode) {
        this.arrcode = arrcode;
    }

    public LocalDate getArrdate() {
        return arrdate;
    }

    public void setArrdate(LocalDate arrdate) {
        this.arrdate = arrdate;
    }

    public LocalTime getArrtime() {
        return arrtime;
    }

    public void setArrtime(LocalTime arrtime) {
        this.arrtime = arrtime;
    }

    public String getArrterminal() {
        return arrterminal;
    }

    public void setArrterminal(String arrterminal) {
        this.arrterminal = arrterminal;
    }

    public String getBookingclass() {
        return bookingclass;
    }

    public void setBookingclass(String bookingclass) {
        this.bookingclass = bookingclass;
    }

    public String getSeatclass() {
        return seatclass;
    }

    public void setSeatclass(String seatclass) {
        this.seatclass = seatclass;
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public LocalDate getDepdate() {
        return depdate;
    }

    public void setDepdate(LocalDate depdate) {
        this.depdate = depdate;
    }

    public LocalTime getDeptime() {
        return deptime;
    }

    public void setDeptime(LocalTime deptime) {
        this.deptime = deptime;
    }

    public String getDepterminal() {
        return depterminal;
    }

    public void setDepterminal(String depterminal) {
        this.depterminal = depterminal;
    }

    public int getFlightid() {
        return flightid;
    }

    public void setFlightid(int flightid) {
        this.flightid = flightid;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getJourney() {
        return journey;
    }

    public void setJourney(String journey) {
        this.journey = journey;
    }
}
