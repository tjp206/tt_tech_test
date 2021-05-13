package com.example.traveltek_tech_test.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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
    private LocalDate inarrivaldate;
    @Column(name = "inarrivaltime")
    private LocalTime inarrivaltime;
    @Column(name = "inbookingclass")
    private String inbookingclass;
    @Column(name = "incarriercode")
    private String incarriercode;
    @Column(name = "indepartdate")
    private LocalDate indepartdate;
    @Column(name = "indeparttime")
    private LocalTime indeparttime;
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
    private LocalDate outarrivaldate;
    @Column(name = "outarrivaltime")
    private LocalTime outarrivaltime;
    @Column(name = "outbookingclass")
    private String outbookingclass;
    @Column(name = "outcarriercode")
    private String outcarriercode;
    @Column(name = "outdepartdate")
    private LocalDate outdepartdate;
    @Column(name = "outdeparttime")
    private LocalTime outdeparttime;
    @Column(name = "outflightclass")
    private String outflightclass;
    @Column(name = "outflightno")
    private String outflightno;

    @Column(name = "reservation")
    private String reservation;


    public Flight(Long id, String carrier, String depair, String destair, LocalDate inarrivaldate,
                  LocalTime inarrivaltime, String inbookingclass, String incarriercode, LocalDate indepartdate,
                  LocalTime indeparttime, String inflightclass, String inflightno, int oneway, String originalcurrency,
                  Double originalprice, LocalDate outarrivaldate, LocalTime outarrivaltime, String outbookingclass, String outcarriercode,
                  LocalDate outdepartdate, LocalTime outdeparttime, String outflightclass, String outflightno, String reservation) {
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

    public LocalDate getInarrivaldate() {
        return inarrivaldate;
    }

    public void setInarrivaldate(LocalDate inarrivaldate) {
        this.inarrivaldate = inarrivaldate;
    }

    public LocalTime getInarrivaltime() {
        return inarrivaltime;
    }

    public void setInarrivaltime(LocalTime inarrivaltime) {
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

    public LocalDate getIndepartdate() {
        return indepartdate;
    }

    public void setIndepartdate(LocalDate indepartdate) {
        this.indepartdate = indepartdate;
    }

    public LocalTime getIndeparttime() {
        return indeparttime;
    }

    public void setIndeparttime(LocalTime indeparttime) {
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

    public LocalDate getOutarrivaldate() {
        return outarrivaldate;
    }

    public void setOutarrivaldate(LocalDate outarrivaldate) {
        this.outarrivaldate = outarrivaldate;
    }

    public LocalTime getOutarrivaltime() {
        return outarrivaltime;
    }

    public void setOutarrivaltime(LocalTime outarrivaltime) {
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

    public LocalDate getOutdepartdate() {
        return outdepartdate;
    }

    public void setOutdepartdate(LocalDate outdepartdate) {
        this.outdepartdate = outdepartdate;
    }

    public LocalTime getOutdeparttime() {
        return outdeparttime;
    }

    public void setOutdeparttime(LocalTime outdeparttime) {
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