package com.entity.view;

import com.entity.GushicishipinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 古诗词视频留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gushicishipin_liuyan")
public class GushicishipinLiuyanView extends GushicishipinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gushicishipin
			/**
			* 古诗词视频标题
			*/
			private String gushicishipinName;
			/**
			* 古诗词类型
			*/
			private Integer gushicishipinTypes;
				/**
				* 古诗词类型的值
				*/
				private String gushicishipinValue;
			/**
			* 封面
			*/
			private String gushicishipinPhoto;
			/**
			* 视频
			*/
			private String gushicishipinVideo;
			/**
			* 文件
			*/
			private String gushicishipinFile;
			/**
			* 视频时长
			*/
			private String gushicishipinDate;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 古诗词视频类型
			*/
			private Integer gushicishipinStatusTypes;
			/**
			* 作者
			*/
			private String gushicishipinZuozhe;
			/**
			* 古诗词翻译
			*/
			private String gushicishipinText;
			/**
			* 古诗词视频详情
			*/
			private String gushicishipinContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 会员类型
			*/
			private Integer huanyuanTypes;
				/**
				* 会员类型的值
				*/
				private String huanyuanValue;
			/**
			* 会员到期时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date huiyuandaoqiTime;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public GushicishipinLiuyanView() {

	}

	public GushicishipinLiuyanView(GushicishipinLiuyanEntity gushicishipinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, gushicishipinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set gushicishipin

					/**
					* 获取： 古诗词视频标题
					*/
					public String getGushicishipinName() {
						return gushicishipinName;
					}
					/**
					* 设置： 古诗词视频标题
					*/
					public void setGushicishipinName(String gushicishipinName) {
						this.gushicishipinName = gushicishipinName;
					}

					/**
					* 获取： 古诗词类型
					*/
					public Integer getGushicishipinTypes() {
						return gushicishipinTypes;
					}
					/**
					* 设置： 古诗词类型
					*/
					public void setGushicishipinTypes(Integer gushicishipinTypes) {
						this.gushicishipinTypes = gushicishipinTypes;
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
					* 获取： 封面
					*/
					public String getGushicishipinPhoto() {
						return gushicishipinPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setGushicishipinPhoto(String gushicishipinPhoto) {
						this.gushicishipinPhoto = gushicishipinPhoto;
					}

					/**
					* 获取： 视频
					*/
					public String getGushicishipinVideo() {
						return gushicishipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setGushicishipinVideo(String gushicishipinVideo) {
						this.gushicishipinVideo = gushicishipinVideo;
					}

					/**
					* 获取： 文件
					*/
					public String getGushicishipinFile() {
						return gushicishipinFile;
					}
					/**
					* 设置： 文件
					*/
					public void setGushicishipinFile(String gushicishipinFile) {
						this.gushicishipinFile = gushicishipinFile;
					}

					/**
					* 获取： 视频时长
					*/
					public String getGushicishipinDate() {
						return gushicishipinDate;
					}
					/**
					* 设置： 视频时长
					*/
					public void setGushicishipinDate(String gushicishipinDate) {
						this.gushicishipinDate = gushicishipinDate;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 古诗词视频类型
					*/
					public Integer getGushicishipinStatusTypes() {
						return gushicishipinStatusTypes;
					}
					/**
					* 设置： 古诗词视频类型
					*/
					public void setGushicishipinStatusTypes(Integer gushicishipinStatusTypes) {
						this.gushicishipinStatusTypes = gushicishipinStatusTypes;
					}

					/**
					* 获取： 作者
					*/
					public String getGushicishipinZuozhe() {
						return gushicishipinZuozhe;
					}
					/**
					* 设置： 作者
					*/
					public void setGushicishipinZuozhe(String gushicishipinZuozhe) {
						this.gushicishipinZuozhe = gushicishipinZuozhe;
					}

					/**
					* 获取： 古诗词翻译
					*/
					public String getGushicishipinText() {
						return gushicishipinText;
					}
					/**
					* 设置： 古诗词翻译
					*/
					public void setGushicishipinText(String gushicishipinText) {
						this.gushicishipinText = gushicishipinText;
					}

					/**
					* 获取： 古诗词视频详情
					*/
					public String getGushicishipinContent() {
						return gushicishipinContent;
					}
					/**
					* 设置： 古诗词视频详情
					*/
					public void setGushicishipinContent(String gushicishipinContent) {
						this.gushicishipinContent = gushicishipinContent;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 会员类型
					*/
					public Integer getHuanyuanTypes() {
						return huanyuanTypes;
					}
					/**
					* 设置： 会员类型
					*/
					public void setHuanyuanTypes(Integer huanyuanTypes) {
						this.huanyuanTypes = huanyuanTypes;
					}


						/**
						* 获取： 会员类型的值
						*/
						public String getHuanyuanValue() {
							return huanyuanValue;
						}
						/**
						* 设置： 会员类型的值
						*/
						public void setHuanyuanValue(String huanyuanValue) {
							this.huanyuanValue = huanyuanValue;
						}

					/**
					* 获取： 会员到期时间
					*/
					public Date getHuiyuandaoqiTime() {
						return huiyuandaoqiTime;
					}
					/**
					* 设置： 会员到期时间
					*/
					public void setHuiyuandaoqiTime(Date huiyuandaoqiTime) {
						this.huiyuandaoqiTime = huiyuandaoqiTime;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
