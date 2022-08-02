package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> brandSelectAll();

    Brand brandSelectById(int id);

    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    void update(Brand brand);

    void update01(Brand brand);

    void deleteById(int id);

    void deleteByIdS(@Param("ids")int[] ids);
}
