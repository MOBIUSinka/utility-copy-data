package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proguserworker")
public class MainProgUserWorker {

    @Id
    @Column(name = "proguser_id", nullable = false)
    private Integer progUserId;

    @Column(name = "worker_id", nullable = false)
    private Integer workerId;

    public Integer getProgUserId() {
        return progUserId;
    }

    public void setProgUserId(Integer progUserId) {
        this.progUserId = progUserId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public MainProgUserWorker() {

    }

    public MainProgUserWorker(Integer progUserId, Integer workerId) {
        this.progUserId = progUserId;
        this.workerId = workerId;
    }
}
