/**
 * This file was generated by the JPA Modeler
 */
package jinet.SUMS.Marking.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 * @author a
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Project.cohort", query
            = "SELECT s FROM Staff  s WHERE s.person.cohort.id= :cohortid"),
    @NamedQuery(name = "Staff.findStaffwithProjectId", query
            = "SELECT s FROM Staff s JOIN S.finalProject fp where fp.id =:projectid"),
    @NamedQuery(name = "Project.findByStudentId",
            query = "SELECT ap FROM AllocatedProject ap WHERE ap.student.id = :studentid")
})

public class Grade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String Description;
    
    @Basic
    private String Overallmarks;
    
    @Basic
    private String Projectunit;
    
    @Basic
    private String Prize;
    
    @Basic
    private String Gradedby;
    
    @Basic
    private String Generalcomments;
    
    @Basic
    private String Projectcontext;
    
    @Basic
    private String Literature;
    
    @Basic
    private String Methodological;
    
    @Basic
    private String Specification;
    
    @Basic
    private String Analysis;
    
    @Basic
    private String Implementation;
    
    @Basic
    private String Verification;
    
    @Basic
    private String Evaluation;
    
    @Basic
    private String Planning;
    
    @Basic
    private String Finalartefact;
    
    @Basic
    private String Summary;
    
    @Basic
    private String Status;
    
    @Basic
    private String Structure;

    @Basic
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date ActiveDate;
 
  

    @OneToMany(targetEntity = GradeUpdate.class)
    private List<GradeUpdate> updates;

 
    
     public String getProjectcontext() {
        return Projectcontext;
    }

    public void setProjectcontext(String Projectcontext) {
        this.Projectcontext = Projectcontext;
    }
    
    public String getLiterature() {
        return Literature;
    }

    public void setLiterature(String Literature) {
        this.Literature = Literature;
    }
    
    public String getMethodological() {
        return Methodological;
    }

    public void setMethodological(String Methodological) {
        this.Methodological = Methodological;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }
    
    public String getAnalysis() {
        return Analysis;
    }

    public void setAnalysis(String Analysis) {
        this.Analysis = Analysis;
    }
    
    public String getImplementation() {
        return Implementation;
    }

    public void setImplementation(String Implementation) {
        this.Implementation = Implementation;
    }
    
    public String getVerification() {
        return Verification;
    }

    public void setVerification(String Verification) {
        this.Verification = Verification;
    }
    
    public String getEvaluation() {
        return Evaluation;
    }

    public void setEvaluation(String Evaluation) {
        this.Evaluation = Evaluation;
    }
    
    public String getPlanning() {
        return Planning;
    }

    public void setPlanning(String Planning) {
        this.Planning = Planning;
    }
    
    public String getFinalartefact() {
        return Finalartefact;
    }

    public void setFinalartefact(String Finalartefact) {
        this.Finalartefact = Finalartefact;
    }
    
    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }
    
    public String getStructure() {
        return Structure;
    }

    public void setStructure(String Structure) {
        this.Structure = Structure;
    }
    
    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getActiveDate() {
        return ActiveDate;
    }

    public void setActiveDate(Date ActiveDate) {
        this.ActiveDate = ActiveDate;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public String getOverallmarks() {
        return this.Overallmarks;
    }

    public void setOverallmarks(String Overallmarks) {
        this.Overallmarks = Overallmarks;       
    }
    
     public String getGeneralcomments() {
        return this.Generalcomments;
    }

    public void setGeneralcomments(String Generalcomments) {
        this.Generalcomments = Generalcomments;       
    }
    
     public String getProjectunit() {
        return this.Projectunit;
    }

    public void setProjectunit(String Projectunit) {
        this.Projectunit = Projectunit;
    }
    
    public String getPrize() {
        return this.Prize;
    }

    public void setPrize(String Prize) {
        this.Prize = Prize;
    }
    
    public String getGradedby() {
        return this.Gradedby;
    }

    public void setGradedby(String Gradedby) {
        this.Gradedby = Gradedby;
    }
    

    public List<GradeUpdate> getUpdates() {
        return this.updates;
    }

    public void setUpdates (List<GradeUpdate> updates) {
        this.updates = updates;
    }

}
