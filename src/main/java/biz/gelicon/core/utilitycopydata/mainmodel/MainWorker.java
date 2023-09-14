package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name = "worker")
public class MainWorker {

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

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerTabNumber() {
        return workerTabNumber;
    }

    public void setWorkerTabNumber(String workerTabNumber) {
        this.workerTabNumber = workerTabNumber;
    }

    public String getWorkerFamilyname() {
        return workerFamilyname;
    }

    public void setWorkerFamilyname(String workerFamilyname) {
        this.workerFamilyname = workerFamilyname;
    }

    public String getWorkerFirstname() {
        return workerFirstname;
    }

    public void setWorkerFirstname(String workerFirstname) {
        this.workerFirstname = workerFirstname;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    public void setWorkerSurname(String workerSurname) {
        this.workerSurname = workerSurname;
    }

    public Integer getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(Integer workerSex) {
        this.workerSex = workerSex;
    }

    public Date getWorkerBirthday() {
        return workerBirthday;
    }

    public void setWorkerBirthday(Date workerBirthday) {
        this.workerBirthday = workerBirthday;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    public String getWorkerHomephone() {
        return workerHomephone;
    }

    public void setWorkerHomephone(String workerHomephone) {
        this.workerHomephone = workerHomephone;
    }

    public String getWorkerWorkphone() {
        return workerWorkphone;
    }

    public void setWorkerWorkphone(String workerWorkphone) {
        this.workerWorkphone = workerWorkphone;
    }

    public String getWorkerContactphone() {
        return workerContactphone;
    }

    public void setWorkerContactphone(String workerContactphone) {
        this.workerContactphone = workerContactphone;
    }

    public String getWorkerRemark() {
        return workerRemark;
    }

    public void setWorkerRemark(String workerRemark) {
        this.workerRemark = workerRemark;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public MainWorker () {

    }

    public MainWorker(
            Integer workerId,
            String workerTabNumber,
            String workerFamilyname,
            String workerFirstname,
            String workerSurname,
            Integer workerSex,
            Date workerBirthday,
            String workerEmail,
            String workerHomephone,
            String workerWorkphone,
            String workerContactphone,
            String workerRemark,
            Integer departmentId
    ) {
        this.workerId = workerId;
        this.workerTabNumber = workerTabNumber;
        this.workerFamilyname = workerFamilyname;
        this.workerFirstname = workerFirstname;
        this.workerSurname = workerSurname;
        this.workerSex = workerSex;
        this.workerBirthday = workerBirthday;
        this.workerEmail = workerEmail;
        this.workerHomephone = workerHomephone;
        this.workerWorkphone = workerWorkphone;
        this.workerContactphone = workerContactphone;
        this.workerRemark = workerRemark;
        this.departmentId = departmentId;
    }
}

