package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "errortransit")
public class MainErrorTransit {

    @Id
    @Column(name = "errortransit_id", nullable = false)
    private Integer errorTransitId;

    @Column(name = "errortransittype_id", nullable = false)
    private Integer errorTransitTypeId;

    @Column(name = "error_id", nullable = false)
    private Integer errorId;

    @Column(name = "worker_id", nullable = false)
    private Integer workerId;

    @Column(name = "errortransit_date", nullable = false)
    private Date errorTransitDate;

    @Column(name = "errortransit_text", nullable = true)
    private String errorTransitText;

    @Column(name = "errortransit_plan", nullable = true)
    private Float errorTransitPlan;

    @Column(name = "errortransit_fact", nullable = true)
    private Float errorTransitFact;

    @Column(name = "errortransit_dateneed", nullable = true)
    private Date errorTransitDateNeed;

    @Column(name = "fromworker_id", nullable = false)
    private Integer fromWorkerId;

    @Column(name = "transitplan_flag", nullable = false)
    private Integer transitPlanFlag;

    public Integer getErrorTransitId() {
        return errorTransitId;
    }

    public void setErrorTransitId(Integer errorTransitId) {
        this.errorTransitId = errorTransitId;
    }

    public Integer getErrorTransitTypeId() {
        return errorTransitTypeId;
    }

    public void setErrorTransitTypeId(Integer errorTransitTypeId) {
        this.errorTransitTypeId = errorTransitTypeId;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Date getErrorTransitDate() {
        return errorTransitDate;
    }

    public void setErrorTransitDate(Date errorTransitDate) {
        this.errorTransitDate = errorTransitDate;
    }

    public String getErrorTransitText() {
        return errorTransitText;
    }

    public void setErrorTransitText(String errorTransitText) {
        this.errorTransitText = errorTransitText;
    }

    public Float getErrorTransitPlan() {
        return errorTransitPlan;
    }

    public void setErrorTransitPlan(Float errorTransitPlan) {
        this.errorTransitPlan = errorTransitPlan;
    }

    public Float getErrorTransitFact() {
        return errorTransitFact;
    }

    public void setErrorTransitFact(Float errorTransitFact) {
        this.errorTransitFact = errorTransitFact;
    }

    public Date getErrorTransitDateNeed() {
        return errorTransitDateNeed;
    }

    public void setErrorTransitDateNeed(Date errorTransitDateNeed) {
        this.errorTransitDateNeed = errorTransitDateNeed;
    }

    public Integer getFromWorkerId() {
        return fromWorkerId;
    }

    public void setFromWorkerId(Integer fromWorkerId) {
        this.fromWorkerId = fromWorkerId;
    }

    public Integer getTransitPlanFlag() {
        return transitPlanFlag;
    }

    public void setTransitPlanFlag(Integer transitPlanFlag) {
        this.transitPlanFlag = transitPlanFlag;
    }

    public MainErrorTransit() {

    }

    public MainErrorTransit(Integer errorTransitId,
                            Integer errorTransitTypeId,
                            Integer errorId,
                            Integer workerId,
                            Date errorTransitDate,
                            String errorTransitText,
                            Float errorTransitPlan,
                            Float errorTransitFact,
                            Date errorTransitDateNeed,
                            Integer fromWorkerId,
                            Integer transitPlanFlag) {
        this.errorTransitId = errorTransitId;
        this.errorTransitTypeId = errorTransitTypeId;
        this.errorId = errorId;
        this.workerId = workerId;
        this.errorTransitDate = errorTransitDate;
        this.errorTransitText = errorTransitText;
        this.errorTransitPlan = errorTransitPlan;
        this.errorTransitFact = errorTransitFact;
        this.errorTransitDateNeed = errorTransitDateNeed;
        this.fromWorkerId = fromWorkerId;
        this.transitPlanFlag = transitPlanFlag;
    }
}
