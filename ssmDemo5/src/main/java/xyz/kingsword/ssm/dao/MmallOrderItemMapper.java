package xyz.kingsword.ssm.dao;

import org.springframework.stereotype.Repository;
import xyz.kingsword.ssm.pojo.MmallOrderItem;

import java.util.List;

@Repository
public interface MmallOrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmallOrderItem record);

    int insertSelective(MmallOrderItem record);

    MmallOrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MmallOrderItem record);

    int updateByPrimaryKey(MmallOrderItem record);

    List<MmallOrderItem> selectByUser(int userId);
}