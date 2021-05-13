package com.example.traveltek_tech_test.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "segments")
public class Segment extends Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "arrcode")
    private String arrcode;
    @Column(name = "arrdate")
    private Date arrdate;
    @Column(name = "arrtime")
    private Time arrtime;
    @Column(name = "arrterminal")
    private String arrterminal;

    @Column(name = "bookingclass")
    private String bookingclass;
    @Column(name = "seatclass")
    private String seatclass;

    @Column(name = "depcode")
    private String depcode;
    @Column(name = "depdate")
    private Date depdate;
    @Column(name = "deptime")
    private Time deptime;
    @Column(name = "depterminal")
    private String depterminal;

    @Column(name = "flightid")
    private int flightid;
    @Column(name = "flightno")
    private String flightno;
    @Column(name = "journey")
    private String journey;

    public Segment(String carrier, String depair, String destair, Date inarrivaldate, Time inarrivaltime,
                   String inbookingclass, String incarriercode, Date indepartdate, Time indeparttime, String inflightclass,
                   String inflightno, int oneway, String originalcurrency, Double originalprice, Date outarrivaldate, Time outarrivaltime,
                   String outbookingclass, String outcarriercode, Date outdepartdate, Time outdeparttime, String outflightclass,
                   String outflightno, String reservation, String arrcode, Date arrdate, Time arrtime, String arrterminal,
                   String bookingclass, String seatclass, String depcode, Date depdate, Time deptime, String depterminal, int flightid,
                   String flightno, String journey) {
        super(carrier, depair, destair, inarrivaldate, inarrivaltime, inbookingclass, incarriercode,
                indepartdate, indeparttime, inflightclass, inflightno, oneway, originalcurrency,
                originalprice, outarrivaldate, outarrivaltime, outbookingclass, outcarriercode,
                outdepartdate, outdeparttime, outflightclass, outflightno, reservation);
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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getArrcode() {
        return arrcode;
    }

    public void setArrcode(String arrcode) {
        this.arrcode = arrcode;
    }

    public Date getArrdate() {
        return arrdate;
    }

    public void setArrdate(Date arrdate) {
        this.arrdate = arrdate;
    }

    public Time getArrtime() {
        return arrtime;
    }

    public void setArrtime(Time arrtime) {
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

    public Date getDepdate() {
        return depdate;
    }

    public void setDepdate(Date depdate) {
        this.depdate = depdate;
    }

    public Time getDeptime() {
        return deptime;
    }

    public void setDeptime(Time deptime) {
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
