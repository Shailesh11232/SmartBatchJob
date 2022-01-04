package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "batch_job_audit")
@EntityListeners(AuditingEntityListener.class)
public class BatchJobAuditEntity extends AudiTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Batch_job_audit_id")
      private Long BatchJobAuditId;
    @Column(name = "Batch_job_id")
    private Long BatchJobId;
    @Column(name = "Batch_Job_Name")
    private String BatchJobName;
    @Column(name = "Batch_Job_Description")
    private String BatchJobDescription;
    @Column(name = "Batch_Job_Type")
    private String BatchJobType;
   @Column(name = "Operation")
    private String Operation;
    @Column(name = "audit_user_Id")
    private String auditUserId;

    public BatchJobAuditEntity(){}

    public BatchJobAuditEntity(LocalDateTime createdDate,
                               LocalDateTime lastModifiedDate,
                               Long batchJobAuditId, Long batchJobId,
                               String batchJobName, String batchJobDescription,
                               String batchJobType,
                               String operation, String auditUserId) {
        super(createdDate, lastModifiedDate);
        BatchJobAuditId = batchJobAuditId;
        BatchJobId = batchJobId;
        BatchJobName = batchJobName;
        BatchJobDescription = batchJobDescription;
        BatchJobType = batchJobType;
        Operation = operation;
        this.auditUserId = auditUserId;
    }

    public BatchJobAuditEntity(Long batchJobAuditId, Long batchJobId, String batchJobName, String batchJobDescription, String batchJobType, String operation, String auditUserId) {
        BatchJobAuditId = batchJobAuditId;
        BatchJobId = batchJobId;
        BatchJobName = batchJobName;
        BatchJobDescription = batchJobDescription;
        BatchJobType = batchJobType;
        Operation = operation;
        this.auditUserId = auditUserId;
    }

    @Override
    public String toString() {
        return "BatchJobAuditEntity{" +
                "BatchJobAuditId=" + BatchJobAuditId +
                ", BatchJobId=" + BatchJobId +
                ", BatchJobName='" + BatchJobName + '\'' +
                ", BatchJobDescription='" + BatchJobDescription + '\'' +
                ", BatchJobType='" + BatchJobType + '\'' +
               ", Operation='" + Operation + '\'' +
                ", auditUserId='" + auditUserId + '\'' +
                '}';
    }

    public Long getBatchJobAuditId() {
        return BatchJobAuditId;
    }

    public void setBatchJobAuditId(Long batchJobAuditId) {
        BatchJobAuditId = batchJobAuditId;
    }

    public Long getBatchJobId() {
        return BatchJobId;
    }

    public void setBatchJobId(Long batchJobId) {
        BatchJobId = batchJobId;
    }

    public String getBatchJobName() {
        return BatchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        BatchJobName = batchJobName;
    }

    public String getBatchJobDescription() {
        return BatchJobDescription;
    }

    public void setBatchJobDescription(String batchJobDescription) {
        BatchJobDescription = batchJobDescription;
    }

    public String getBatchJobType() {
        return BatchJobType;
    }

    public void setBatchJobType(String batchJobType) {
        BatchJobType = batchJobType;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
    }
}