package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 古诗词视频
 *
 * @author 
 * @email
 */
@TableName("gushicishipin")
public class GushicishipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GushicishipinEntity() {

	}

	public GushicishipinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 古诗词视频标题
     */
    @TableField(value = "gushicishipin_name")

    private String gushicishipinName;


    /**
     * 古诗词类型
     */
    @TableField(value = "gushicishipin_types")

    private Integer gushicishipinTypes;


    /**
     * 封面
     */
    @TableField(value = "gushicishipin_photo")

    private String gushicishipinPhoto;


    /**
     * 视频
     */
    @TableField(value = "gushicishipin_video")

    private String gushicishipinVideo;


    /**
     * 文件
     */
    @TableField(value = "gushicishipin_file")

    private String gushicishipinFile;


    /**
     * 视频时长
     */
    @TableField(value = "gushicishipin_date")

    private String gushicishipinDate;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 古诗词视频类型
     */
    @TableField(value = "gushicishipin_status_types")

    private Integer gushicishipinStatusTypes;


    /**
     * 作者
     */
    @TableField(value = "gushicishipin_zuozhe")

    private String gushicishipinZuozhe;


    /**
     * 古诗词翻译
     */
    @TableField(value = "gushicishipin_text")

    private String gushicishipinText;


    /**
     * 古诗词视频详情
     */
    @TableField(value = "gushicishipin_content")

    private String gushicishipinContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：古诗词视频标题
	 */
    public String getGushicishipinName() {
        return gushicishipinName;
    }
    /**
	 * 获取：古诗词视频标题
	 */

    public void setGushicishipinName(String gushicishipinName) {
        this.gushicishipinName = gushicishipinName;
    }
    /**
	 * 设置：古诗词类型
	 */
    public Integer getGushicishipinTypes() {
        return gushicishipinTypes;
    }
    /**
	 * 获取：古诗词类型
	 */

    public void setGushicishipinTypes(Integer gushicishipinTypes) {
        this.gushicishipinTypes = gushicishipinTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getGushicishipinPhoto() {
        return gushicishipinPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setGushicishipinPhoto(String gushicishipinPhoto) {
        this.gushicishipinPhoto = gushicishipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getGushicishipinVideo() {
        return gushicishipinVideo;
    }
    /**
	 * 获取：视频
	 */

    public void setGushicishipinVideo(String gushicishipinVideo) {
        this.gushicishipinVideo = gushicishipinVideo;
    }
    /**
	 * 设置：文件
	 */
    public String getGushicishipinFile() {
        return gushicishipinFile;
    }
    /**
	 * 获取：文件
	 */

    public void setGushicishipinFile(String gushicishipinFile) {
        this.gushicishipinFile = gushicishipinFile;
    }
    /**
	 * 设置：视频时长
	 */
    public String getGushicishipinDate() {
        return gushicishipinDate;
    }
    /**
	 * 获取：视频时长
	 */

    public void setGushicishipinDate(String gushicishipinDate) {
        this.gushicishipinDate = gushicishipinDate;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：古诗词视频类型
	 */
    public Integer getGushicishipinStatusTypes() {
        return gushicishipinStatusTypes;
    }
    /**
	 * 获取：古诗词视频类型
	 */

    public void setGushicishipinStatusTypes(Integer gushicishipinStatusTypes) {
        this.gushicishipinStatusTypes = gushicishipinStatusTypes;
    }
    /**
	 * 设置：作者
	 */
    public String getGushicishipinZuozhe() {
        return gushicishipinZuozhe;
    }
    /**
	 * 获取：作者
	 */

    public void setGushicishipinZuozhe(String gushicishipinZuozhe) {
        this.gushicishipinZuozhe = gushicishipinZuozhe;
    }
    /**
	 * 设置：古诗词翻译
	 */
    public String getGushicishipinText() {
        return gushicishipinText;
    }
    /**
	 * 获取：古诗词翻译
	 */

    public void setGushicishipinText(String gushicishipinText) {
        this.gushicishipinText = gushicishipinText;
    }
    /**
	 * 设置：古诗词视频详情
	 */
    public String getGushicishipinContent() {
        return gushicishipinContent;
    }
    /**
	 * 获取：古诗词视频详情
	 */

    public void setGushicishipinContent(String gushicishipinContent) {
        this.gushicishipinContent = gushicishipinContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gushicishipin{" +
            "id=" + id +
            ", gushicishipinName=" + gushicishipinName +
            ", gushicishipinTypes=" + gushicishipinTypes +
            ", gushicishipinPhoto=" + gushicishipinPhoto +
            ", gushicishipinVideo=" + gushicishipinVideo +
            ", gushicishipinFile=" + gushicishipinFile +
            ", gushicishipinDate=" + gushicishipinDate +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", gushicishipinStatusTypes=" + gushicishipinStatusTypes +
            ", gushicishipinZuozhe=" + gushicishipinZuozhe +
            ", gushicishipinText=" + gushicishipinText +
            ", gushicishipinContent=" + gushicishipinContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
