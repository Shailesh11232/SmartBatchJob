package com.smartbatchjobui.smartbatchjobui.services;

import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJob;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJobParameter;
import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobEntity;
import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobParameterEntity;
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
    private Object CreateBatchJobEntity;

    public CreateBatchJob CreateBJob( CreateBatchJob createBatchJob){
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
    public List<CreateBatchJobParameter> getIdBatchJob(Long createBatchJobId){


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

    public List<CreateBatchJob> getAllBatchJob(){

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
        return  createBatchJobList;
    }
    public void deleteById(Long id){
            createBatchJobParameterRepository.deleteById(id);
    }

    public CreateBatchJobParameter UpadetParameter
            (CreateBatchJobParameter createBatchJobParameter,Long batchJobId){
CreateBatchJobEntity createBatchJobEntity =
        createBatchJobRepository.findById(batchJobId).get();

            CreateBatchJobParameterEntity createBatchJobParameterEntity
                    = new CreateBatchJobParameterEntity();
            createBatchJobParameterEntity.setBatchJobParameterId(batchJobId);
            createBatchJobParameterEntity.setCreateBatchJobId(createBatchJobEntity.getBatchJobId());
            createBatchJobParameterEntity.setDefaultValue(createBatchJobParameter.getDefaultValue());
            createBatchJobParameterEntity.setVisibleFlag(createBatchJobParameter.getVisibleFlag());
            createBatchJobParameterEntity.setRegexforValidation(createBatchJobParameter.getRegexforValidation());
            createBatchJobParameterEntity.setParameterType(createBatchJobParameter.getParameterType());
            createBatchJobParameterEntity.setParameterName(createBatchJobParameter.getParameterName());
            createBatchJobParameterEntity.setParameterFormat(createBatchJobParameter.getParameterFormat());
            createBatchJobParameterEntity.setParameterDescription(createBatchJobParameter.getParameterDescription());
            createBatchJobParameterEntity.setMandatoryFlag(createBatchJobParameter.getMandatoryFlag());
            CreateBatchJobParameterEntity createBatchJobParameterEntityResult
                = createBatchJobParameterRepository.save(createBatchJobParameterEntity);

            CreateBatchJobParameter createBatchJobParameter1 = new CreateBatchJobParameter();
            createBatchJobParameter1.setParameterId(createBatchJobParameterEntityResult.getBatchJobParameterId());
            createBatchJobParameter1.setVisibleFlag(createBatchJobParameterEntityResult.getVisibleFlag());
            createBatchJobParameter1.setRegexforValidation(createBatchJobParameterEntityResult.getRegexforValidation());
            createBatchJobParameter1.setParameterType(createBatchJobParameterEntityResult.getParameterType());
            createBatchJobParameter1.setParameterName(createBatchJobParameterEntityResult.getParameterName());
            createBatchJobParameter1.setParameterFormat(createBatchJobParameterEntityResult.getParameterFormat());
            createBatchJobParameter1.setParameterDescription(createBatchJobParameterEntityResult.getParameterDescription());
            createBatchJobParameter1.setMandatoryFlag(createBatchJobParameterEntityResult.getMandatoryFlag());
            createBatchJobParameter1.setDefaultValue(createBatchJobParameterEntityResult.getDefaultValue());
            return createBatchJobParameter1;
    }
    public void deleteById(long BatchJobId) {
        createBatchJobParameterRepository.deleteById(BatchJobId);
        createBatchJobRepository.deleteById(BatchJobId);
    }

    public  List<CreateBatchJobParameter>  get(Long BatchJobId){

        CreateBatchJobEntity =
                createBatchJobRepository.findById(BatchJobId).get();

        List<CreateBatchJobParameterEntity> createBatchJobParameterEntityList =
                createBatchJobParameterRepository.findAllByCreateBatchJobId(BatchJobId);

        ArrayList<CreateBatchJobParameter> createBatchJobParameterList =
                new ArrayList<>();
        createBatchJobParameterEntityList.forEach(createBatchJobParameterEntity -> {

            CreateBatchJobParameter createBatchJobParameter = new CreateBatchJobParameter();
            createBatchJobParameter.setParameterId(createBatchJobParameterEntity.getBatchJobParameterId());
            createBatchJobParameter.setParameterName(createBatchJobParameterEntity.getParameterName());
            createBatchJobParameter.setParameterDescription(createBatchJobParameterEntity.getParameterDescription());
            createBatchJobParameter.setParameterType(createBatchJobParameterEntity.getParameterType());
            createBatchJobParameter.setParameterFormat(createBatchJobParameterEntity.getParameterFormat());
            createBatchJobParameter.setMandatoryFlag(createBatchJobParameterEntity.getMandatoryFlag());
            createBatchJobParameter.setVisibleFlag(createBatchJobParameterEntity.getVisibleFlag());
            createBatchJobParameter.setDefaultValue(createBatchJobParameterEntity.getDefaultValue());
            createBatchJobParameter.setRegexforValidation(createBatchJobParameterEntity.getRegexforValidation());
            createBatchJobParameterList.add(createBatchJobParameter);


        });
      CreateBatchJob createBatchJob;
        createBatchJob = new CreateBatchJob();

        CreateBatchJobEntity createBatchJobEntity = new CreateBatchJobEntity();
        createBatchJob.setBatchJobId(createBatchJobEntity.getBatchJobId());
        createBatchJob.setBatchJobName(createBatchJobEntity.getBatchJobName());
        createBatchJob.setBatchJobDescription(createBatchJobEntity.getBatchJobDescription());
        createBatchJob.setBatchJobType(createBatchJobEntity.getBatchJobType());
        createBatchJob.setCreateBatchJobParameter(createBatchJobParameterList);

        return  createBatchJobParameterList;
    }
}