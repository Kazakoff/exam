package by.vstu.isap.exam.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="faculty"
 ,catalog="gr" 
)

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "id")  
		  
public class Faculty  {

  private Long id;
  private String name;

 public Faculty() {
 }

 public Faculty(String nazvanie) {
     this.setName(nazvanie);
 }
 

 @Id @GeneratedValue(strategy=IDENTITY)
 @Column(name="Id", unique=true, nullable=false)
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

@Column(name="Name", unique=true, nullable=false, length=50)
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


}


