package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyuanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyuanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyuanshenqingView;


/**
 * 房源申请
 *
 * @author 
 * @email 
 * @date 2021-05-12 09:44:22
 */
public interface FangyuanshenqingService extends IService<FangyuanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyuanshenqingVO> selectListVO(Wrapper<FangyuanshenqingEntity> wrapper);
   	
   	FangyuanshenqingVO selectVO(@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);
   	
   	List<FangyuanshenqingView> selectListView(Wrapper<FangyuanshenqingEntity> wrapper);
   	
   	FangyuanshenqingView selectView(@Param("ew") Wrapper<FangyuanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyuanshenqingEntity> wrapper);
   	
}

