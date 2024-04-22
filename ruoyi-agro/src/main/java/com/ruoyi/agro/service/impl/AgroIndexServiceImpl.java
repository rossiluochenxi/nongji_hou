package com.ruoyi.agro.service.impl;

import com.ruoyi.agro.domain.AgroIndexVar;
import com.ruoyi.agro.mapper.AgroIndexMapper;
import com.ruoyi.agro.service.IAgroIndexService;
import com.ruoyi.common.annotation.DataScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgroIndexServiceImpl implements IAgroIndexService {

    @Autowired
    private AgroIndexMapper agroIndexMapper;


    @Override
    @DataScope(deptAlias = "t" ,userAlias = "t")
    public List<AgroIndexVar> selectIndexVarList(AgroIndexVar agroIndexVar) {
      return agroIndexMapper.selectIndexVarList();
    }

}