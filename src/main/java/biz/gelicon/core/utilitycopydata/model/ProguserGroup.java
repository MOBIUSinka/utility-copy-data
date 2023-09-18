package biz.gelicon.core.utilitycopydata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ProguserGroup")
public class ProguserGroup {
    @Id
    @Size(max = 10)
    @Column(name = "ProguserGroup_Id", nullable = false)
    private Integer proguserGroupId;
    @Size(max = 50)
    @Column(name = "ProguserGroup_Note", nullable = true)
    private String proguserGroupNote;
    @Size(max = 30)
    @Column(name = "ProguserGroup_Name", nullable = false)
    private String proguserGroupName;

    @Size(max = 10)
    @Column(name = "ProguserGroup_Visible", nullable = false)
    private Integer proguserGroupVisible;

    public Integer getProguserGroupId() {
        return proguserGroupId;
    }

    public void setProguserGroupId(Integer proguserGroupId) {
        this.proguserGroupId = proguserGroupId;
    }

    public String getProguserGroupNote() {
        return proguserGroupNote;
    }

    public void setProguserGroupNote(String proguserGroupNote) {
        this.proguserGroupNote = proguserGroupNote;
    }

    public String getProguserGroupName() {
        return proguserGroupName;
    }

    public void setProguserGroupName(String proguserGroupName) {
        this.proguserGroupName = proguserGroupName;
    }

    public Integer getProguserGroupVisible() {
        return proguserGroupVisible;
    }

    public void setProguserGroupVisible(Integer proguserGroupVisible) {
        this.proguserGroupVisible = proguserGroupVisible;
    }

    public ProguserGroup(Integer proguserGroupId, String proguserGroupNote, String proguserGroupName, Integer proguserGroupVisible) {
        this.proguserGroupId = proguserGroupId;
        this.proguserGroupNote = proguserGroupNote;
        this.proguserGroupName = proguserGroupName;
        this.proguserGroupVisible = proguserGroupVisible;
    }

    public ProguserGroup() {
    }
}
