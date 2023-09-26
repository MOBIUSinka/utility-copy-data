package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "projectaccounttype")
public class MainProjectAccountType {
    @Id
    @Column(name = "projectaccounttype_id", nullable = false)
    private Integer projectaccounttypeId;

    @Size(max = 50)
    @Column(name = "projectaccounttype_name", nullable = false)
    private String projectaccounttypeName;

    public Integer getProjectaccounttypeId() {
        return projectaccounttypeId;
    }

    public void setProjectaccounttypeId(Integer projectaccounttypeId) {
        this.projectaccounttypeId = projectaccounttypeId;
    }

    public String getProjectaccounttypeName() {
        return projectaccounttypeName;
    }

    public void setProjectaccounttypeName(String projectaccounttypeName) {
        this.projectaccounttypeName = projectaccounttypeName;
    }

    public MainProjectAccountType(Integer projectaccounttypeId, String projectaccounttypeName) {
        this.projectaccounttypeId = projectaccounttypeId;
        this.projectaccounttypeName = projectaccounttypeName;
    }

    public MainProjectAccountType() {
    }
}
