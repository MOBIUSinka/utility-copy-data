package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Table(name = "worker")
public class Worker {

    @Id
    @Column(name = "worker_id", nullable = false)
    private Integer workerId;

    @Column(name = "worker_tabnumber", nullable = false)
    private String workerTabNumber;

    @Column(name = "worker_familyname", nullable = false)
    private String workerFamilyname;

    @Column(name = "worker_firstname", nullable = false)
    private String workerFirstname;

    @Column(name = "worker_surname", nullable = true)
    private String workerSurname;

    @Column(name = "worker_sex", nullable = false)
    private Integer workerSex;

    @Column(name = "worker_birthday", nullable = true)
    private Date workerBirthday;

    @Column(name = "worker_email", nullable = true)
    private String workerEmail;

    @Column(name = "worker_homephone", nullable = true)
    private String workerHomephone;

    @Column(name = "worker_workphone", nullable = true)
    private String workerWorkphone;

    @Column(name = "worker_contactphone", nullable = true)
    private String workerContactphone;

    @Column(name = "worker_remark", nullable = true)
    private String workerRemark;

    @Column(name = "department_id", nullable = true)
    private Integer departmentId;
}

