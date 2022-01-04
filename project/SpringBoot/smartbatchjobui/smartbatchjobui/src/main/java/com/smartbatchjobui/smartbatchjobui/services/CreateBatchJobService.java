package com.smartbatchjobui.smartbatchjobui.services;

import com.smartbatchjobui.smartbatchjobui.dto.BatchJobAudit;
import com.smartbatchjobui.smartbatchjobui.dto.BatchJobParameterAudit;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJob;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJobParameter;
import com.smartbatchjobui.smartbatchjobui.entity.BatchJobAuditEntity;
import com.smartbatchjobui.smartbatchjobui.entity.BatchJobParameterAuditEntity;
import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobEntity;
import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobParameterEntity;
import com.smartbatchjobui.smartbatchjobui.repositoris.BatchJobAuditRepository;
import com.smartbatchjobui.smartbatchjobui.repositoris.BatchJobParameterAuditRepository;
import com.smartbatchjobui.smartbatchjobui.repositoris.CreateBatchJobParameterRepository;
import com.smartbatchjobui.smartbatchjobui.repositoris.CreateBatchJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class CreateBatchJobService {

    @Autowired
    CreateBatchJobRepository createBatchJobRepository;

    @Autowired
    CreateBatchJobParameterRepository createBatchJobParameterRepository;
    @Autowired
    BatchJobAuditRepository batchJobAuditRepository;
    @Autowired
    BatchJobParameterAuditRepository batchJobParameterAuditRepository;

    //create  new batch job
    public CreateBatchJob CreateBJob(CreateBatchJob createBatchJob) {
        CreateBatchJobEntity createBatchJobEntity = new CreateBatchJobEntity();
        createBatchJobEntity.setBatchJobId(0L);
        createBatchJobEntity.setBatchJobDescription(createBatchJob.getBatchJobDescription());
        createBatchJobEntity.setBatchJobName(createBatchJob.getBatchJobName());
        createBatchJobEntity.setBatchJobType(createBatchJob.getBatchJobType());
        CreateBatchJobEntity createBatchJobEntityResult
                = createBatchJobRepository.save(createBatchJobEntity);

        CreateBatchJob createBatchJob1 = new CreateBatchJob();
        createBatchJob1.setBatchJobId(createBatchJobEntityResult.getBatchJobId());
        createBatchJob1.setBatchJobDescription(createBatchJobEntityResult.getBatchJobDescription());
        createBatchJob1.setBatchJobName(createBatchJobEntityResult.getBatchJobName());
        createBatchJob1.setBatchJobType(createBatchJobEntityResult.getBatchJobType());
        ArrayList<CreateBatchJobParameter> createBatchJobParameterList = new ArrayList<>();
        createBatchJob1.setCreateBatchJobParameter(createBatchJobParameterList);


        createBatchJob.getCreateBatchJobParameter().forEach(createBatchJobParameter -> {
            CreateBatchJobParameterEntity createBatchJobParameterEntity
                    = new CreateBatchJobParameterEntity();
            createBatchJobParameterEntity.setCreateBatchJobId(0L);
            createBatchJobParameterEntity.setCreateBatchJobId(createBatchJobEntityResult.getBatchJobId());
            createBatchJobParameterEntity.setDefaultValue(createBatchJobParameter.getDefaultValue());
            createBatchJobParameterEntity.setMandatoryFlag(createBatchJobParameter.getMandatoryFlag());
            createBatchJobParameterEntity.setParameterDescription(createBatchJobParameter.getParameterDescription());
            createBatchJobParameterEntity.setParameterFormat(createBatchJobParameter.getParameterFormat());
            createBatchJobParameterEntity.setParameterName(createBatchJobParameter.getParameterName());
            createBatchJobParameterEntity.setParameterType(createBatchJobParameter.getParameterType());
            createBatchJobParameterEntity.setRegexforValidation(createBatchJobParameter.getRegexforValidation());
            createBatchJobParameterEntity.setVisibleFlag(createBatchJobParameter.getVisibleFlag());
            CreateBatchJobParameterEntity createBatchJobParameterEntityResult
                    = createBatchJobParameterRepository.save(createBatchJobParameterEntity);

            CreateBatchJobParameter createBatchJobParameter1 = new CreateBatchJobParameter();
            createBatchJobParameter1.setParameterId(createBatchJobParameterEntityResult.getBatchJobParameterId());
            createBatchJobParameter1.setDefaultValue(createBatchJobParameterEntityResult.getDefaultValue());
            createBatchJobParameter1.setMandatoryFlag(createBatchJobParameterEntityResult.getMandatoryFlag());
            createBatchJobParameter1.setParameterDescription(createBatchJobParameterEntityResult.getParameterDescription());
            createBatchJobParameter1.setParameterFormat(createBatchJobParameterEntityResult.getParameterFormat());
            createBatchJobParameter1.setParameterName(createBatchJobParameterEntityResult.getParameterName());
            createBatchJobParameter1.setParameterType(createBatchJobParameterEntityResult.getParameterType());
            createBatchJobParameter1.setRegexforValidation(createBatchJobParameterEntityResult.getRegexforValidation());
            createBatchJobParameter1.setVisibleFlag(createBatchJobParameterEntityResult.getVisibleFlag());
            createBatchJobParameterList.add(createBatchJobParameter1);
        });
        return createBatchJob1;
    }
    // update perametre by deleting old and create new
    public CreateBatchJob createparameter(CreateBatchJob createBatchJob) {
        CreateBatchJobEntity createBatchJobEntity = new CreateBatchJobEntity();


        CreateBatchJob createBatchJob1 = new CreateBatchJob();
        ArrayList<CreateBatchJobParameter> createBatchJobParameterList = new ArrayList<>();
        createBatchJob1.setCreateBatchJobParameter(createBatchJobParameterList);


        createBatchJob.getCreateBatchJobParameter().forEach(createBatchJobParameter -> {
            CreateBatchJobParameterEntity createBatchJobParameterEntity
                    = new CreateBatchJobParameterEntity();
            createBatchJobParameterEntity.setCreateBatchJobId(0L);
            createBatchJobParameterEntity.setCreateBatchJobId(createBatchJob.getBatchJobId());
            createBatchJobParameterEntity.setDefaultValue(createBatchJobParameter.getDefaultValue());
            createBatchJobParameterEntity.setMandatoryFlag(createBatchJobParameter.getMandatoryFlag());
            createBatchJobParameterEntity.setParameterDescription(createBatchJobParameter.getParameterDescription());
            createBatchJobParameterEntity.setParameterFormat(createBatchJobParameter.getParameterFormat());
            createBatchJobParameterEntity.setParameterName(createBatchJobParameter.getParameterName());
            createBatchJobParameterEntity.setParameterType(createBatchJobParameter.getParameterType());
            createBatchJobParameterEntity.setRegexforValidation(createBatchJobParameter.getRegexforValidation());
            createBatchJobParameterEntity.setVisibleFlag(createBatchJobParameter.getVisibleFlag());
            CreateBatchJobParameterEntity createBatchJobParameterEntityResult
                    = createBatchJobParameterRepository.save(createBatchJobParameterEntity);

            CreateBatchJobParameter createBatchJobParameter1 = new CreateBatchJobParameter();
            createBatchJobParameter1.setParameterId(createBatchJobParameterEntityResult.getBatchJobParameterId());
            createBatchJobParameter1.setDefaultValue(createBatchJobParameterEntityResult.getDefaultValue());
            createBatchJobParameter1.setMandatoryFlag(createBatchJobParameterEntityResult.getMandatoryFlag());
            createBatchJobParameter1.setParameterDescription(createBatchJobParameterEntityResult.getParameterDescription());
            createBatchJobParameter1.setParameterFormat(createBatchJobParameterEntityResult.getParameterFormat());
            createBatchJobParameter1.setParameterName(createBatchJobParameterEntityResult.getParameterName());
            createBatchJobParameter1.setParameterType(createBatchJobParameterEntityResult.getParameterType());
            createBatchJobParameter1.setRegexforValidation(createBatchJobParameterEntityResult.getRegexforValidation());
            createBatchJobParameter1.setVisibleFlag(createBatchJobParameterEntityResult.getVisibleFlag());
            createBatchJobParameterList.add(createBatchJobParameter1);
        });
        return createBatchJob1;
    }
//get batch job parameter by batch job id
    public List<CreateBatchJobParameter> getIdBatchJob(Long createBatchJobId) {


        List<CreateBatchJobParameterEntity> createBatchJobParameterEntityList =
                createBatchJobParameterRepository.findAllByCreateBatchJobId(createBatchJobId);

        ArrayList<CreateBatchJobParameter> createBatchJobParameterList = new ArrayList<>();
        createBatchJobParameterEntityList.forEach(createBatchJobParameterEntity -> {
            CreateBatchJobParameter createBatchJobParameter = new CreateBatchJobParameter();
            createBatchJobParameter.setParameterId(createBatchJobParameterEntity.getBatchJobParameterId());
            createBatchJobParameter.setDefaultValue(createBatchJobParameterEntity.getDefaultValue());
            createBatchJobParameter.setMandatoryFlag(createBatchJobParameterEntity.getMandatoryFlag());
            createBatchJobParameter.setParameterDescription(createBatchJobParameterEntity.getParameterDescription());
            createBatchJobParameter.setParameterFormat(createBatchJobParameterEntity.getParameterFormat());
            createBatchJobParameter.setParameterName(createBatchJobParameterEntity.getParameterName());
            createBatchJobParameter.setParameterType(createBatchJobParameterEntity.getParameterType());
            createBatchJobParameter.setRegexforValidation(createBatchJobParameterEntity.getRegexforValidation());
            createBatchJobParameter.setVisibleFlag(createBatchJobParameterEntity.getVisibleFlag());
            createBatchJobParameterList.add(createBatchJobParameter);
        });
        return createBatchJobParameterList;
    }

    public List<CreateBatchJob> getAllBatchJob() {

        List<CreateBatchJobEntity> createBatchJobEntityList =
                createBatchJobRepository.findAll();

        ArrayList<CreateBatchJob> createBatchJobList = new ArrayList<>();

        createBatchJobEntityList.forEach(createBatchJobEntity -> {


            CreateBatchJob createBatchJob =
                    new CreateBatchJob();
            createBatchJob.setBatchJobId(createBatchJobEntity.getBatchJobId());
            createBatchJob.setBatchJobName(createBatchJobEntity.getBatchJobName());
            createBatchJob.setBatchJobDescription(createBatchJobEntity.getBatchJobDescription());
            createBatchJob.setBatchJobType(createBatchJobEntity.getBatchJobType());
            createBatchJobList.add(createBatchJob);
        });
        return createBatchJobList;
    }

    public void deleteById(Long batchJobParameterId) {
        createBatchJobParameterRepository.deleteById(batchJobParameterId);
    }

    // delete batchjob and parametr by bachjob id

    public void deleteById(long BatchJobId) {
        createBatchJobParameterRepository.deleteById(BatchJobId);
        createBatchJobRepository.deleteById(BatchJobId);
    }
  // delete all parameter by  batchjob id
    public void  deleteAllParameter(long BatchJobId) {
        createBatchJobParameterRepository.deleteById(BatchJobId);
        System.out.println("batchjob id for delete all data:"+BatchJobId);
    }

    //get batchjob data
    public CreateBatchJob get(Long BatchJobId) {

        CreateBatchJobEntity createBatchJobEntity =
                createBatchJobRepository.findById(BatchJobId).get();

        List<CreateBatchJobParameterEntity> createBatchJobParameterEntityList =
                createBatchJobParameterRepository.findAllByCreateBatchJobId(BatchJobId);

        ArrayList<CreateBatchJobParameter> createBatchJobParameterList =
                new ArrayList<>();
        createBatchJobParameterEntityList.forEach(createBatchJobParameterEntity -> {

            CreateBatchJobParameter createBatchJobParameter = new CreateBatchJobParameter();
            createBatchJobParameter.setParameterId(createBatchJobParameterEntity.getBatchJobParameterId());
            createBatchJobParameter.setDefaultValue(createBatchJobParameterEntity.getDefaultValue());
            createBatchJobParameter.setMandatoryFlag(createBatchJobParameterEntity.getMandatoryFlag());
            createBatchJobParameter.setParameterDescription(createBatchJobParameterEntity.getParameterDescription());
            createBatchJobParameter.setParameterFormat(createBatchJobParameterEntity.getParameterFormat());
            createBatchJobParameter.setParameterName(createBatchJobParameterEntity.getParameterName());
            createBatchJobParameter.setParameterType(createBatchJobParameterEntity.getParameterType());
            createBatchJobParameter.setRegexforValidation(createBatchJobParameterEntity.getRegexforValidation());
            createBatchJobParameter.setVisibleFlag(createBatchJobParameterEntity.getVisibleFlag());
            createBatchJobParameterList.add(createBatchJobParameter);
        });
        CreateBatchJob createBatchJob =
                new CreateBatchJob();

        createBatchJob.setBatchJobId(createBatchJobEntity.getBatchJobId());
        createBatchJob.setBatchJobName(createBatchJobEntity.getBatchJobName());
        createBatchJob.setBatchJobDescription(createBatchJobEntity.getBatchJobDescription());
        createBatchJob.setBatchJobType(createBatchJobEntity.getBatchJobType());
        createBatchJob.setCreateBatchJobParameter(createBatchJobParameterList);
        return createBatchJob;
    }
    ////audit service
    public BatchJobAudit BatchJobAudit(BatchJobAudit batchJobAudit){
        BatchJobAuditEntity batchJobAuditEntity = new BatchJobAuditEntity();
        //batchJobAuditEntity.setBatchJobAuditId(0L);
        batchJobAuditEntity.setBatchJobName(batchJobAudit.getBatchJobName());
        batchJobAuditEntity.setBatchJobType(batchJobAudit.getBatchJobType());
        batchJobAuditEntity.setAuditUserId(batchJobAudit.getAuditUserId());
       batchJobAuditEntity.setOperation(batchJobAudit.getOperation());
        batchJobAuditEntity.setBatchJobDescription(batchJobAudit.getBatchJobDescription());
        BatchJobAuditEntity batchJobAuditEntityResult =
                batchJobAuditRepository.save(batchJobAuditEntity);
        BatchJobAudit batchJobAudit1 =
                new BatchJobAudit();
        batchJobAudit1.setAuditUserId(batchJobAuditEntityResult.getAuditUserId());
       // batchJobAudit1.setBatchJobAuditId(batchJobAuditEntityResult.getBatchJobAuditId());
        batchJobAudit1.setBatchJobDescription(batchJobAuditEntityResult.getBatchJobDescription());
        batchJobAudit1.setBatchJobId(batchJobAuditEntityResult.getBatchJobId());
        batchJobAudit1.setBatchJobName(batchJobAuditEntityResult.getBatchJobName());
        batchJobAudit1.setBatchJobType(batchJobAuditEntityResult.getBatchJobType());
        batchJobAudit1.setOperation(batchJobAuditEntityResult.getOperation());
        List<CreateBatchJobParameter> batchJobParameterAuditList = new ArrayList<>();
        batchJobAudit1.setCreateBatchJobParameter(batchJobParameterAuditList);

          batchJobAudit.getCreateBatchJobParameter().forEach(createBatchJobParameter -> {
            BatchJobParameterAuditEntity batchJobParameterAuditEntity
                    = new BatchJobParameterAuditEntity();
           // batchJobParameterAuditEntity.setCreateBatchJobId(0L);
         //   batchJobParameterAuditEntity.setCreateBatchJobId(batchJobAuditEntityResult.getBatchJobId());
            batchJobParameterAuditEntity.setAuditUserId(batchJobAudit.getAuditUserId());
            batchJobParameterAuditEntity.setOperation(batchJobAudit.getOperation());
            batchJobParameterAuditEntity.setDefaultValue(createBatchJobParameter.getDefaultValue());
            batchJobParameterAuditEntity.setMandatoryFlag(createBatchJobParameter.getMandatoryFlag());
            batchJobParameterAuditEntity.setParameterDescription(createBatchJobParameter.getParameterDescription());
            batchJobParameterAuditEntity.setParameterFormat(createBatchJobParameter.getParameterFormat());
            batchJobParameterAuditEntity.setParameterName(createBatchJobParameter.getParameterName());
            batchJobParameterAuditEntity.setParameterType(createBatchJobParameter.getParameterType());
            batchJobParameterAuditEntity.setRegexForValidation(createBatchJobParameter.getRegexforValidation());
            batchJobParameterAuditEntity.setVisibleFlag(createBatchJobParameter.getVisibleFlag());
            BatchJobParameterAuditEntity batchJobParameterAuditEntity1
                    = batchJobParameterAuditRepository.save(batchJobParameterAuditEntity);

            BatchJobParameterAudit batchJobParameterAudit1 = new BatchJobParameterAudit();
            batchJobParameterAudit1.setParameterId(batchJobParameterAuditEntity1.getBatchJobParameterId());
            batchJobParameterAudit1.setDefaultValue(batchJobParameterAuditEntity1.getDefaultValue());
            batchJobParameterAudit1.setMandatoryFlag(batchJobParameterAuditEntity1.getMandatoryFlag());
            batchJobParameterAudit1.setParameterDescription(batchJobParameterAuditEntity1.getParameterDescription());
            batchJobParameterAudit1.setParameterFormat(batchJobParameterAuditEntity1.getParameterFormat());
            batchJobParameterAudit1.setParameterName(batchJobParameterAuditEntity1.getParameterName());
            batchJobParameterAudit1.setParameterType(batchJobParameterAuditEntity1.getParameterType());
            batchJobParameterAudit1.setRegexforValidation(batchJobParameterAuditEntity1.getRegexForValidation());
            batchJobParameterAudit1.setVisibleFlag(batchJobParameterAuditEntity1.getVisibleFlag());
            batchJobParameterAudit1.setOperation(batchJobParameterAuditEntity1.getOperation());
            batchJobParameterAudit1.setAuditUserId(batchJobParameterAuditEntity1.getAuditUserId());
            batchJobParameterAuditList.add(batchJobParameterAudit1);
        });

        return  batchJobAudit1;
    }

   public BatchJobParameterAudit batchJobParameterAudit(BatchJobParameterAudit batchJobParameterAudit){
        BatchJobParameterAuditEntity batchJobParameterAuditEntity =
                new BatchJobParameterAuditEntity();
        batchJobParameterAuditEntity.setBatchJobParameterAuditId(0L);
        batchJobParameterAuditEntity.setAuditUserId(batchJobParameterAudit.getAuditUserId());
        batchJobParameterAuditEntity.setOperation(batchJobParameterAudit.getOperation());
        batchJobParameterAuditEntity.setParameterName(batchJobParameterAudit.getParameterName());
        batchJobParameterAuditEntity.setParameterFormat(batchJobParameterAudit.getParameterFormat());
        batchJobParameterAuditEntity.setDefaultValue(batchJobParameterAudit.getDefaultValue());
        batchJobParameterAuditEntity.setMandatoryFlag(batchJobParameterAudit.getMandatoryFlag());
        batchJobParameterAuditEntity.setParameterDescription(batchJobParameterAudit.getParameterDescription());
        batchJobParameterAuditEntity.setParameterType(batchJobParameterAudit.getParameterType());
        batchJobParameterAuditEntity.setRegexForValidation(batchJobParameterAudit.getRegexforValidation());
        batchJobParameterAuditEntity.setVisibleFlag(batchJobParameterAudit.getVisibleFlag());
        BatchJobParameterAuditEntity batchJobParameterAuditEntityResult =
                batchJobParameterAuditRepository.save(batchJobParameterAuditEntity);

        BatchJobParameterAudit batchJobParameterAudit1 = new BatchJobParameterAudit();
       batchJobParameterAuditEntity.setAuditUserId(batchJobParameterAudit.getAuditUserId());
       batchJobParameterAuditEntity.setOperation(batchJobParameterAudit.getOperation());
        batchJobParameterAudit1.setParameterId(batchJobParameterAuditEntityResult.getBatchJobParameterId());
        batchJobParameterAudit1.getBatchJobId(batchJobParameterAuditEntityResult.getBatchJobId());
       batchJobParameterAudit1.setAuditUserId(batchJobParameterAuditEntityResult.getAuditUserId());
        batchJobParameterAudit1.setOperation(batchJobParameterAuditEntityResult.getOperation());
        batchJobParameterAudit1.setParameterName(batchJobParameterAuditEntityResult.getParameterName());
        batchJobParameterAudit1.setParameterFormat(batchJobParameterAuditEntityResult.getParameterFormat());
        batchJobParameterAudit1.setDefaultValue(batchJobParameterAuditEntityResult.getDefaultValue());
        batchJobParameterAudit1.setMandatoryFlag(batchJobParameterAuditEntityResult.getMandatoryFlag());
        batchJobParameterAudit1.setParameterDescription(batchJobParameterAuditEntityResult.getParameterDescription());
        batchJobParameterAudit1.setParameterType(batchJobParameterAuditEntityResult.getParameterType());
        batchJobParameterAudit1.setRegexforValidation(batchJobParameterAuditEntityResult.getRegexForValidation());
        batchJobParameterAudit1.setVisibleFlag(batchJobParameterAuditEntityResult.getVisibleFlag());
        return batchJobParameterAudit1;
    }


}