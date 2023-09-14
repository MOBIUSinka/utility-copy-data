package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Table(name = "worker")
public class Worker {

    @Id
    @Column(name = "worker_id", nullable = false)
    public Integer workerId;

    @Column(name = "worker_family", nullable = false)
    public String workerFamily;

    @Column(name = "worker_shortname", nullable = false)
    public String workerShortname;

    @Column(name = "worker_surname", nullable = true)
    public String workerSurname;

    @Column(name = "worker_position", nullable = false)
    public String workerPosition;

    @Column(name = "worker_email", nullable = true)
    public String workerEmail;

    @Column(name = "worker_status", nullable = false)
    public Integer workerStatus;

    @Column(name = "department_id", nullable = false)
    public Integer departmentId;

    @Column(name = "worker_report_id", nullable = true)
    public Integer workerReportId;

    @Column(name = "worker_familyname", nullable = false)
    public String workerFamilyName;

    @Column(name = "worker_firstname", nullable = false)
    public String workerFirstname;

    @Column(name = "worker_phone", nullable = true)
    public String workerPhone;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerFamily() {
        return workerFamily;
    }

    public void setWorkerFamily(String workerFamily) {
        this.workerFamily = workerFamily;
    }

    public String getWorkerShortname() {
        return workerShortname;
    }

    public void setWorkerShortname(String workerShortname) {
        this.workerShortname = workerShortname;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    public void setWorkerSurname(String workerSurname) {
        this.workerSurname = workerSurname;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    public Integer getWorkerStatus() {
        return workerStatus;
    }

    public void setWorkerStatus(Integer workerStatus) {
        this.workerStatus = workerStatus;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getWorkerReportId() {
        return workerReportId;
    }

    public void setWorkerReportId(Integer workerReportId) {
        this.workerReportId = workerReportId;
    }

    public String getWorkerFamilyName() {
        return workerFamilyName;
    }

    public void setWorkerFamilyName(String workerFamilyName) {
        this.workerFamilyName = workerFamilyName;
    }

    public String getWorkerFirstname() {
        return workerFirstname;
    }

    public void setWorkerFirstname(String workerFirstname) {
        this.workerFirstname = workerFirstname;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    public Worker() {

    }

    public Worker (
            Integer workerId,
            String workerFamily,
            String workerShortname,
            String workerSurname,

    ) {

    }
}
