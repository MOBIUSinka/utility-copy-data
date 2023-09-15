package biz.gelicon.core.utilitycopydata.mainmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Table(name = "department")
public class MainDepartment {

    @Id
    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Column(name = "department_code", nullable = true)
    @Size(max = 15)
    private String departmentCode;

    @Column(name = "department_name", nullable = false)
    @Size(max = 250)
    private String departmentName;

    @Column(name = "department_report_id", nullable = true)
    private Integer departmentReportId;

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

    public MainDepartment() {

    }

    public MainDepartment(
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
