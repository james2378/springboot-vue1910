package com.entity.view;

import com.entity.JiezhangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 结账信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 09:46:11
 */
@TableName("jiezhangxinxi")
public class JiezhangxinxiView  extends JiezhangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiezhangxinxiView(){
	}
 
 	public JiezhangxinxiView(JiezhangxinxiEntity jiezhangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiezhangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
