package com.sharingif.blockchain.ether.app.autoconfigure.components;

import com.sharingif.cube.batch.core.JobConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class JobConfigComponentsAutoconfigure {

    @Bean("blockChainSynchingDataJobConfig")
    public JobConfig createBlockChainSynchingDataJobConfig() {
        JobConfig jobConfig = new JobConfig(null,"/blockChain/synchingData", null);
        jobConfig.setMaxExecuteCount(100);
        return jobConfig;
    }

    @Bean("blockChainSettleBolckSuccessDataJobConfig")
    public JobConfig createBlockChainSettleBolckSuccessDataJobConfig() {
        JobConfig jobConfig = new JobConfig(null,"/blockChain/settleBolckSuccess", null);
        jobConfig.setIntervalPlanExecuteTime(1000*60*5);
        jobConfig.setMaxExecuteCount(5);
        return jobConfig;
    }

    @Bean("blockChainSettleBolckFailureDataJobConfig")
    public JobConfig createBlockChainSettleBolckFailureDataJobConfig() {
        JobConfig jobConfig = new JobConfig(null,"/blockChain/settleBolckFailure", null);
        jobConfig.setIntervalPlanExecuteTime(1000*60*5);
        jobConfig.setMaxExecuteCount(5);
        return jobConfig;
    }

    @Bean("depositInitDepositNoticeJobConfig")
    public JobConfig createDepositInitDepositNoticeJobConfigJobConfig() {
        JobConfig jobConfig = new JobConfig(null,"/deposit/initDepositNotice", null);
        jobConfig.setIntervalPlanExecuteTime(1000*60*5);
        jobConfig.setMaxExecuteCount(5);
        return jobConfig;
    }

    @Bean("allJobConfig")
    public Map<String, JobConfig> createAllJobConfig(List<JobConfig> jobConfigList) {
        Map<String, JobConfig> allJobConfig = new HashMap<>(jobConfigList.size());
        for(JobConfig jobConfig : jobConfigList) {
            allJobConfig.put(jobConfig.getLookupPath(), jobConfig);
        }

        return allJobConfig;
    }

}
