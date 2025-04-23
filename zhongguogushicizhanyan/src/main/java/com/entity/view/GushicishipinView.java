package com.entity.view;

import com.entity.GushicishipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 古诗词视频
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gushicishipin")
public class GushicishipinView extends GushicishipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 古诗词类型的值
		*/
		private String gushicishipinValue;
		/**
		* 古诗词视频类型的值
		*/
		private String gushicishipinStatusValue;



	public GushicishipinView() {

	}

	public GushicishipinView(GushicishipinEntity gushicishipinEntity) {
		try {
			BeanUtils.copyProperties(this, gushicishipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 古诗词类型的值
			*/
			public String getGushicishipinValue() {
				return gushicishipinValue;
			}
			/**
			* 设置： 古诗词类型的值
			*/
			public void setGushicishipinValue(String gushicishipinValue) {
				this.gushicishipinValue = gushicishipinValue;
			}
			/**
			* 获取： 古诗词视频类型的值
			*/
			public String getGushicishipinStatusValue() {
				return gushicishipinStatusValue;
			}
			/**
			* 设置： 古诗词视频类型的值
			*/
			public void setGushicishipinStatusValue(String gushicishipinStatusValue) {
				this.gushicishipinStatusValue = gushicishipinStatusValue;
			}










}
