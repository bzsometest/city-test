package com.chao.service;

import com.chao.bean.Region;
import com.chao.bean.RegionExample;
import com.chao.dao.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    RegionMapper regionMapper;

    public List<Region> getProvinceAll() {
        RegionExample example = new RegionExample();
        RegionExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(1);
        return regionMapper.selectByExample(example);
    }

    public List<Region> getCity(int province_id) {
        RegionExample example = new RegionExample();
        RegionExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(province_id);
        return regionMapper.selectByExample(example);
    }

    public List<Region> getArea(int city_id) {
        RegionExample example = new RegionExample();
        RegionExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(city_id);
        return regionMapper.selectByExample(example);
    }
}
