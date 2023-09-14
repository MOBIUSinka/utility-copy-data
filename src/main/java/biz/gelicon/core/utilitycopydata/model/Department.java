package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Table(name = "department")
public class Department {

    @Id
    @Column(name = "department_id", nullable = false)
    public Integer departmentId;

    @Column(name = "department_code", nullable = true)
    @Size(max = 15)
    public String departmentCode;

    @Column(name = "department_name", nullable = false)
    @Size(max = 250)
    public String departmentName;

    @Column(name = "department_report_id", nullable = true)
    public Integer departmentReportId;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentReportId() {
        return departmentReportId;
    }

    public void setDepartmentReportId(Integer departmentReportId) {
        this.departmentReportId = departmentReportId;
    }

    public Department() {

    }

    public Department(
            Integer id,
            String departmentCode,
            String departmentName,
            Integer departmentReportId
    ) {
        this.departmentId = id;
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.departmentReportId = departmentReportId;
    }
}
