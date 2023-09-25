package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "worknow")
public class MainWorkNow {

    @Id
    @Column(name = "worknow_id", nullable = false)
    private Integer workNowId;

    @Column(name = "worker_id", nullable = false)
    private Integer workerId;

    @Column(name = "error_id", nullable = false)
    private Integer errorId;

    @Column(name = "worknow_datebeg", nullable = false)
    private Date workNowDateBeg;

    @Column(name = "worknow_dateend", nullable = true)
    private Date workNowDateEnd;

    public Integer getWorkNowId() {
        return workNowId;
    }

    public void setWorkNowId(Integer workNowId) {
        this.workNowId = workNowId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Date getWorkNowDateBeg() {
        return workNowDateBeg;
    }

    public void setWorkNowDateBeg(Date workNowDateBeg) {
        this.workNowDateBeg = workNowDateBeg;
    }

    public Date getWorkNowDateEnd() {
        return workNowDateEnd;
    }

    public void setWorkNowDateEnd(Date workNowDateEnd) {
        this.workNowDateEnd = workNowDateEnd;
    }

    public MainWorkNow() {

    }

    public MainWorkNow(Integer workNowId,
                       Integer workerId,
                       Integer errorId,
                       Date workNowDateBeg,
                       Date workNowDateEnd) {
        this.workNowId = workNowId;
        this.workerId = workerId;
        this.errorId = errorId;
        this.workNowDateBeg = workNowDateBeg;
        this.workNowDateEnd = workNowDateEnd;
    }
}
