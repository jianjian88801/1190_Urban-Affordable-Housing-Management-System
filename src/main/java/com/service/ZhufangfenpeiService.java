package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhufangfenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhufangfenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhufangfenpeiView;


/**
 * 住房分配
 *
 * @author 
 * @email 
 * @date 2021-05-12 09:44:22
 */
public interface ZhufangfenpeiService extends IService<ZhufangfenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhufangfenpeiVO> selectListVO(Wrapper<ZhufangfenpeiEntity> wrapper);
   	
   	ZhufangfenpeiVO selectVO(@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);
   	
   	List<ZhufangfenpeiView> selectListView(Wrapper<ZhufangfenpeiEntity> wrapper);
   	
   	ZhufangfenpeiView selectView(@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhufangfenpeiEntity> wrapper);
   	
}

