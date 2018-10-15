package by.vstu.isap.exam.entity;
// Generated 26.01.2018 7:06:31 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * erated by hbm2java
 */
@Entity
@Table(name="studentyi"
    ,catalog="gr"
)
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "nomerZachetki") 
		  
public class Studentyi  {


     private long nomerZachetki;
     
    @JsonManagedReference
     private Gruppyi gruppyi;
     
     
     
     private String familiya;
     private String imya;
     private String otchestvo;
     private String gorod;
     private String adres;
     private String tel;
     private String status;
     private Date statusDate;

    public Studentyi() {
    }

	
    public Studentyi(long nomerZachetki, Gruppyi gruppyi, String familiya, String imya, String otchestvo, String gorod, String adres, String tel) {
        this.nomerZachetki = nomerZachetki;
        this.gruppyi = gruppyi;
        this.familiya = familiya;
        this.imya = imya;
        this.otchestvo = otchestvo;
        this.gorod = gorod;
        this.adres = adres;
        this.tel = tel;
    }
    public Studentyi(long nomerZachetki, Gruppyi gruppyi, String familiya, String imya, String otchestvo, String gorod, String adres, String tel, String status, Date statusDate) {
       this.nomerZachetki = nomerZachetki;
       this.gruppyi = gruppyi;
       this.familiya = familiya;
       this.imya = imya;
       this.otchestvo = otchestvo;
       this.gorod = gorod;
       this.adres = adres;
       this.tel = tel;
       this.status = status;
       this.statusDate = statusDate;
    }
   
     @Id 
    
    @Column(name="NomerZachetki", unique=true, nullable=false)
    public long getNomerZachetki() {
        return this.nomerZachetki;
    }
    
    public void setNomerZachetki(long nomerZachetki) {
        this.nomerZachetki = nomerZachetki;
    }

    //@ManyToOne(fetch=FetchType.LAZY)
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ShifrGruppyi", nullable=false)
    //@JsonProperty(access = Access.WRITE_ONLY)
    public Gruppyi getGruppyi() {
        return this.gruppyi;
    }
    
    public void setGruppyi(Gruppyi gruppyi) {
        this.gruppyi = gruppyi;
    }
    
    @Column(name="Familiya", nullable=false, length=30)
    public String getFamiliya() {
        return this.familiya;
    }
    
    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }
    
    @Column(name="Imya", nullable=false, length=30)
    public String getImya() {
        return this.imya;
    }
    
    public void setImya(String imya) {
        this.imya = imya;
    }
    
    @Column(name="Otchestvo", nullable=false, length=30)
    public String getOtchestvo() {
        return this.otchestvo;
    }
    
    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }
    
    @Column(name="Gorod", nullable=false, length=30)
    public String getGorod() {
        return this.gorod;
    }
    
    public void setGorod(String gorod) {
        this.gorod = gorod;
    }
    
    @Column(name="Adres", nullable=false, length=80)
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    @Column(name="Tel", nullable=false, length=30)
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="Status", length=50)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="StatusDate", length=10)
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }




}


