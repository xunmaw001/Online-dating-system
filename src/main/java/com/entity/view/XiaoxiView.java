package com.entity.view;

import com.entity.XiaoxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
@TableName("xiaoxi")
public class XiaoxiView  extends XiaoxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoxiView(){
	}
 
 	public XiaoxiView(XiaoxiEntity xiaoxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
