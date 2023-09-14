package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "workgroup")
public class WorkGroup {

    @Id
    @Column(name = "workgroup_id", nullable = false)
    private Integer workGroupId;

    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Column(name = "department_owner_id", nullable = true)
    private Integer departmentOwnerId;

    public Integer getWorkGroupId() {
        return workGroupId;
    }

    public void setWorkGroupId(Integer workGroupId) {
        this.workGroupId = workGroupId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentOwnerId() {
        return departmentOwnerId;
    }

    public void setDepartmentOwnerId(Integer departmentOwnerId) {
        this.departmentOwnerId = departmentOwnerId;
    }

    public WorkGroup() {

    }

    public WorkGroup(
            Integer id,
            Integer departmentId,
            Integer departmentOwnerId
    ) {
        this.workGroupId = id;
        this.departmentId = departmentId;
        this.departmentOwnerId = departmentOwnerId;
    }
}
