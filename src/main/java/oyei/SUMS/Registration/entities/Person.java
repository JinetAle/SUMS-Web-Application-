/**
 * This file was generated by the JPA Modeler
 */
package oyei.SUMS.Registration.entities;

import Entities.Cohort;
import Entities.Organisation;
import Entities.PersonStatus;
import Entities.Phonenumber;
import Entities.Staff;
import Entities.Student;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author a
 */
@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic @Column(unique=true)
    private String username;

    @Basic
    private String surname;

    @Basic
    private String forername;

    @Basic
    private String password;

    @Basic
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateConfirmation;

    @Basic
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreation;

    @Basic
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastlogin;

    @OneToOne(targetEntity = Cohort.class)
    private Cohort cohort;

    @OneToOne(targetEntity = Organisation.class)
    private Organisation organisation;

    @OneToOne(targetEntity = PersonStatus.class)
    private PersonStatus personStatus;
    
    @OneToOne(targetEntity = Student.class)
    private Student student;

    @OneToMany(targetEntity = Email.class)
    private List<Email> emails;

    @OneToMany(targetEntity = Phonenumber.class)
    private List<Phonenumber> phonenumbers;
    
    @OneToOne(mappedBy="person")
    private Staff staff;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForername() {
        return this.forername;
    }

    public void setForername(String forername) {
        this.forername = forername;
    }
    
    public String getFullName(){
        return getForername()+" "+getSurname();
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateConfirmation() {
        return dateConfirmation;
    }

    public void setDateConfirmation(Date dateConfirmation) {
        this.dateConfirmation = dateConfirmation;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getLastlogin() {
        return this.lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Cohort getCohort() {
        return this.cohort;
    }

    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }

    public Organisation getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public PersonStatus getPersonStatus() {
        return this.personStatus;
    }

    public void setPersonStatus(PersonStatus personStatus) {
        this.personStatus = personStatus;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Email> getEmails() {
        return this.emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Phonenumber> getPhonenumbers() {
        return this.phonenumbers;
    }

    public void setPhonenumbers(List<Phonenumber> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }
    
    /**
    @author Reciprocal
    */
    public boolean isStaff(){
        return PersonStatus.Name_Staff.equals(getPersonStatus().getName());
    }
    
    /**
    @author Reciprocal
    */
    public boolean isStudent(){
        return PersonStatus.Name_Student.equals(getPersonStatus().getName());
    }
    
    /**
    @author Reciprocal
    */
    public boolean isExternal(){
        return PersonStatus.Name_External.equals(getPersonStatus().getName());
    }
    
    /**
    @author Reciprocal
    */
    public boolean isCoordinator(){
        return staff!=null && staff.isIsCoordinator();
    }
    
    /**
    @author Reciprocal
    */
    public boolean isAdministrator(){
        return staff!=null && staff.isIsAdministrator();
    }

    /**
    @author Reciprocal
    */
    public @Override int hashCode(){
        return username.hashCode();
    }
    /**
    @author Reciprocal
    */
    public @Override boolean equals(Object _operand){
        if(!(_operand instanceof Person)){
            return false;
        }
        Person operand=(Person)_operand;
        return this.username!=null && this.username.equals(operand.username);
    }

}
