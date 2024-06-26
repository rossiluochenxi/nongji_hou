package com.ruoyi.agro.service.impl;

import com.ruoyi.agro.domain.AgroIndexVar;
import com.ruoyi.agro.domain.AgroLivestockVarieties;
import com.ruoyi.agro.domain.AgroOnOffLineDevice;
import com.ruoyi.agro.domain.AgroRankingFarmers;
import com.ruoyi.agro.mapper.AgroIndexMapper;
import com.ruoyi.agro.service.IAgroIndexService;
import com.ruoyi.common.annotation.DataScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgroIndexServiceImpl implements IAgroIndexService {

    @Autowired
    private AgroIndexMapper agroIndexMapper;
    @Autowired
    private AgroLivestockVarietiesServiceImpl agroLivestockVarietiesServiceImpl;


    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<AgroIndexVar> selectIndexVarList(AgroIndexVar agroIndexVar) {
        AgroLivestockVarieties agroLivestockVarieties = new AgroLivestockVarieties();
        List<AgroLivestockVarieties> varietiesList= agroLivestockVarietiesServiceImpl.selectAgroLivestockVarietiesList(agroLivestockVarieties);

       return agroIndexMapper.selectIndexVarList(agroIndexVar);
    }

    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
     public List<AgroRankingFarmers> selectIndexUserNumList(AgroRankingFarmers agroRankingFarmers) {

        return agroIndexMapper.selectIndexUserNumList(agroRankingFarmers);
    }

    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<AgroRankingFarmers> selectEbOnOffLineDevice(AgroOnOffLineDevice agroOnOffLineDevice) {

        return  agroIndexMapper.selectEbOnOffLineDevice(agroOnOffLineDevice);
    }

    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<AgroRankingFarmers> selectXqOnOffLineDevice(AgroOnOffLineDevice agroOnOffLineDevice) {


        return    agroIndexMapper.selectXqOnOffLineDevice(agroOnOffLineDevice);
    }

}
