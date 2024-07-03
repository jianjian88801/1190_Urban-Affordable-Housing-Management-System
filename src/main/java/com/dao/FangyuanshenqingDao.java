package com.dao;

import com.entity.FangyuanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyuanshenqingVO;
import com.entity.view.FangyuanshenqingView;


/**
 * 房源申请
 * 
 * @author 
 * @email 
 * @date 2021-05-12 09:44:22
 */
public interface FangyuanshenqingDao extends BaseMapper<FangyuanshenqingEntity> {
	
	List<FangyuanshenqingVO> selectListVO(@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);
	
	FangyuanshenqingVO selectVO(@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);
	
	List<FangyuanshenqingView> selectListView(@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);

	List<FangyuanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);
	
	FangyuanshenqingView selectView(@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);
	
}
