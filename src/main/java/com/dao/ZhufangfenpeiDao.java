package com.dao;

import com.entity.ZhufangfenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhufangfenpeiVO;
import com.entity.view.ZhufangfenpeiView;


/**
 * 住房分配
 * 
 * @author 
 * @email 
 * @date 2021-05-12 09:44:22
 */
public interface ZhufangfenpeiDao extends BaseMapper<ZhufangfenpeiEntity> {
	
	List<ZhufangfenpeiVO> selectListVO(@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);
	
	ZhufangfenpeiVO selectVO(@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);
	
	List<ZhufangfenpeiView> selectListView(@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);

	List<ZhufangfenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);
	
	ZhufangfenpeiView selectView(@Param("ew") Wrapper<ZhufangfenpeiEntity> wrapper);
	
}
