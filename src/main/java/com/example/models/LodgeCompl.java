package com.example.chargebackcalcdemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="lodgecompl" )
public class LodgeCompl {


    @Column(length = 16)
	private String firstname;
    @Column(length =16)
    private String lastname;
   @Column
    @Pattern(regexp = "[6789][0-9]{9}",message = "Invalid Mobile number")
	private String contactnumber;
   @Column
   @Pattern(regexp= "^[A-Za-z0-9+_.-]+@(.+)$", message="invalid emailid")
 
   private String emailid;
   
   
   
	
}
