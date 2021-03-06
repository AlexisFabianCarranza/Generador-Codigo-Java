/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:21:09 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.demo.persistence.impl.jpa.record;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Persistent class for "Providerxjob" entity stored in table "providerXjob" <br>
 * This class is a "record entity" without JPA links  <br>
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="providerXjob", catalog="agser" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ProviderxjobJpaRecord.countAll",  query="SELECT COUNT(x) FROM ProviderxjobJpaRecord x" ),
  @NamedQuery ( name="ProviderxjobJpaRecord.countById", query="SELECT COUNT(x) FROM ProviderxjobJpaRecord x WHERE x.id = ?1 " )
} )
public class ProviderxjobJpaRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="id", nullable=false)
    private Integer    id           ; 

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="providerId", nullable=false)
    private Integer    providerid   ; // Foreign Key 

    @Column(name="jobId", nullable=false)
    private Integer    jobid        ; // Foreign Key 


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ProviderxjobJpaRecord() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : providerId ( INT ) 
    public void setProviderid( Integer providerid ) {
        this.providerid = providerid;
    }
    public Integer getProviderid() {
        return this.providerid;
    }

    //--- DATABASE MAPPING : jobId ( INT ) 
    public void setJobid( Integer jobid ) {
        this.jobid = jobid;
    }
    public Integer getJobid() {
        return this.jobid;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(providerid);
        sb.append("|");
        sb.append(jobid);
        return sb.toString(); 
    } 

}
