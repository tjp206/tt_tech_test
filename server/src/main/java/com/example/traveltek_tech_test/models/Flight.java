package com.example.traveltek_tech_test.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "carrier")
    private String carrier;
    @Column(name = "depair")
    private String depair;
    @Column(name = "destair")
    private String destair;

    @Column(name = "inarrivaldate")
    private Date inarrivaldate
    @Column(name = "inarrivaltime")
    private Time inarrivaltime;
    @Column(name = "inbookingclass")
    private String inbookingclass;
    @Column(name = "incarriercode")
    private String incarriercode;
    @Column(name = "indepartdate")
    private Date indepartdate;
    @Column(name = "indeparttime")
    private Time indeparttime;
    @Column(name = "inflightclass")
    private String inflightclass;
    @Column(name = "inflightno")
    private String inflightno;

    @Column(name = "oneway")
    private int oneway;
    @Column(name = "originalcurrency")
    private String originalcurrency;
    @Column(name = "originalprice")
    private Double originalprice;

    @Column(name = "outarrivaldate")
    private Date outarrivaldate
    @Column(name = "outarrivaltime")
    private Time outarrivaltime;
    @Column(name = "outbookingclass")
    private String outbookingclass;
    @Column(name = "outcarriercode")
    private String outcarriercode;
    @Column(name = "outdepartdate")
    private Date outdepartdate;
    @Column(name = "outdeparttime")
    private Time outdeparttime;
    @Column(name = "outflightclass")
    private String outflightclass;
    @Column(name = "outflightno")
    private String outflightno;

    @Column(name = "reservation")
    private String reservation;


    public Flight(Long id, String carrier, String depair, String destair, Date inarrivaldate,
                  Time inarrivaltime, String inbookingclass, String incarriercode, Date indepartdate,
                  Time indeparttime, String inflightclass, String inflightno, int oneway, String originalcurrency,
                  Double originalprice, Date outarrivaldate, Time outarrivaltime, String outbookingclass, String outcarriercode,
                  Date outdepartdate, Time outdeparttime, String outflightclass, String outflightno, String reservation) {
        this.id = id;
        this.carrier = carrier;
        this.depair = depair;
        this.destair = destair;
        this.inarrivaldate = inarrivaldate;
        this.inarrivaltime = inarrivaltime;
        this.inbookingclass = inbookingclass;
        this.incarriercode = incarriercode;
        this.indepartdate = indepartdate;
        this.indeparttime = indeparttime;
        this.inflightclass = inflightclass;
        this.inflightno = inflightno;
        this.oneway = oneway;
        this.originalcurrency = originalcurrency;
        this.originalprice = originalprice;
        this.outarrivaldate = outarrivaldate;
        this.outarrivaltime = outarrivaltime;
        this.outbookingclass = outbookingclass;
        this.outcarriercode = outcarriercode;
        this.outdepartdate = outdepartdate;
        this.outdeparttime = outdeparttime;
        this.outflightclass = outflightclass;
        this.outflightno = outflightno;
        this.reservation = reservation;
    }

    public Flight() {}

    public Flight(String carrier, String depair, String destair, Date inarrivaldate, Time inarrivaltime, String inbookingclass, String incarriercode, Date indepartdate, Time indeparttime, String inflightclass, String inflightno, int oneway, String originalcurrency, Double originalprice, Date outarrivaldate, Time outarrivaltime, String outbookingclass, String outcarriercode, Date outdepartdate, Time outdeparttime, String outflightclass, String outflightno, String reservation) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDepair() {
        return depair;
    }

    public void setDepair(String depair) {
        this.depair = depair;
    }

    public String getDestair() {
        return destair;
    }

    public void setDestair(String destair) {
        this.destair = destair;
    }

    public Date getInarrivaldate() {
        return inarrivaldate;
    }

    public void setInarrivaldate(Date inarrivaldate) {
        this.inarrivaldate = inarrivaldate;
    }

    public Time getInarrivaltime() {
        return inarrivaltime;
    }

    public void setInarrivaltime(Time inarrivaltime) {
        this.inarrivaltime = inarrivaltime;
    }

    public String getInbookingclass() {
        return inbookingclass;
    }

    public void setInbookingclass(String inbookingclass) {
        this.inbookingclass = inbookingclass;
    }

    public String getIncarriercode() {
        return incarriercode;
    }

    public void setIncarriercode(String incarriercode) {
        this.incarriercode = incarriercode;
    }

    public Date getIndepartdate() {
        return indepartdate;
    }

    public void setIndepartdate(Date indepartdate) {
        this.indepartdate = indepartdate;
    }

    public Time getIndeparttime() {
        return indeparttime;
    }

    public void setIndeparttime(Time indeparttime) {
        this.indeparttime = indeparttime;
    }

    public String getInflightclass() {
        return inflightclass;
    }

    public void setInflightclass(String inflightclass) {
        this.inflightclass = inflightclass;
    }

    public String getInflightno() {
        return inflightno;
    }

    public void setInflightno(String inflightno) {
        this.inflightno = inflightno;
    }

    public int getOneway() {
        return oneway;
    }

    public void setOneway(int oneway) {
        this.oneway = oneway;
    }

    public String getOriginalcurrency() {
        return originalcurrency;
    }

    public void setOriginalcurrency(String originalcurrency) {
        this.originalcurrency = originalcurrency;
    }

    public Double getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    public Date getOutarrivaldate() {
        return outarrivaldate;
    }

    public void setOutarrivaldate(Date outarrivaldate) {
        this.outarrivaldate = outarrivaldate;
    }

    public Time getOutarrivaltime() {
        return outarrivaltime;
    }

    public void setOutarrivaltime(Time outarrivaltime) {
        this.outarrivaltime = outarrivaltime;
    }

    public String getOutbookingclass() {
        return outbookingclass;
    }

    public void setOutbookingclass(String outbookingclass) {
        this.outbookingclass = outbookingclass;
    }

    public String getOutcarriercode() {
        return outcarriercode;
    }

    public void setOutcarriercode(String outcarriercode) {
        this.outcarriercode = outcarriercode;
    }

    public Date getOutdepartdate() {
        return outdepartdate;
    }

    public void setOutdepartdate(Date outdepartdate) {
        this.outdepartdate = outdepartdate;
    }

    public Time getOutdeparttime() {
        return outdeparttime;
    }

    public void setOutdeparttime(Time outdeparttime) {
        this.outdeparttime = outdeparttime;
    }

    public String getOutflightclass() {
        return outflightclass;
    }

    public void setOutflightclass(String outflightclass) {
        this.outflightclass = outflightclass;
    }

    public String getOutflightno() {
        return outflightno;
    }

    public void setOutflightno(String outflightno) {
        this.outflightno = outflightno;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
}