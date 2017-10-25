/**
 * This file was generated by the JPA Modeler
 */
package syafiqah.SUMS.Allocation.Entities;

import Entities.FinalProject;
import Entities.Staff;
import Entities.Student;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author a
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "getAllocatedProjectByID", query="SELECT ap FROM AllocatedProject ap JOIN FinalProject fp where ap.finalProject.id = :valueID"),
    @NamedQuery(name = "countSv", query = "SELECT ap FROM AllocatedProject ap JOIN ap.staffs s WHERE ap.staffs.id = :staffID"),
    @NamedQuery(name = "getLastValue", query = "SELECT ap FROM AllocatedProject ap Order By ap.id DESC")
})
public class AllocatedProject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = FinalProject.class)
    private FinalProject finalProject;

    @OneToOne(targetEntity = Student.class)
    private Student student;

   @OneToOne(targetEntity = Staff.class)
    private Staff staffs;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FinalProject getFinalProject() {
        return this.finalProject;
    }

    public void setFinalProject(FinalProject finalProject) {
        this.finalProject = finalProject;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Staff getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff staffs) {
        this.staffs = staffs;
    }
    
    
   

}
