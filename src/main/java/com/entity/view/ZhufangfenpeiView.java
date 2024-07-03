package com.entity.view;

import com.entity.ZhufangfenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 住房分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 09:44:22
 */
@TableName("zhufangfenpei")
public class ZhufangfenpeiView  extends ZhufangfenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhufangfenpeiView(){
	}
 
 	public ZhufangfenpeiView(ZhufangfenpeiEntity zhufangfenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, zhufangfenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
