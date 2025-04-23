package com.entity.model;

import com.entity.GushicishipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 古诗词视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GushicishipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 古诗词视频标题
     */
    private String gushicishipinName;


    /**
     * 古诗词类型
     */
    private Integer gushicishipinTypes;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：古诗词视频标题
	 */
    public String getGushicishipinName() {
        return gushicishipinName;
    }


    /**
	 * 设置：古诗词视频标题
	 */
    public void setGushicishipinName(String gushicishipinName) {
        this.gushicishipinName = gushicishipinName;
    }
    /**
	 * 获取：古诗词类型
	 */
    public Integer getGushicishipinTypes() {
        return gushicishipinTypes;
    }


    /**
	 * 设置：古诗词类型
	 */
    public void setGushicishipinTypes(Integer gushicishipinTypes) {
        this.gushicishipinTypes = gushicishipinTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getGushicishipinPhoto() {
        return gushicishipinPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setGushicishipinPhoto(String gushicishipinPhoto) {
        this.gushicishipinPhoto = gushicishipinPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getGushicishipinVideo() {
        return gushicishipinVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setGushicishipinVideo(String gushicishipinVideo) {
        this.gushicishipinVideo = gushicishipinVideo;
    }
    /**
	 * 获取：文件
	 */
    public String getGushicishipinFile() {
        return gushicishipinFile;
    }


    /**
	 * 设置：文件
	 */
    public void setGushicishipinFile(String gushicishipinFile) {
        this.gushicishipinFile = gushicishipinFile;
    }
    /**
	 * 获取：视频时长
	 */
    public String getGushicishipinDate() {
        return gushicishipinDate;
    }


    /**
	 * 设置：视频时长
	 */
    public void setGushicishipinDate(String gushicishipinDate) {
        this.gushicishipinDate = gushicishipinDate;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：古诗词视频类型
	 */
    public Integer getGushicishipinStatusTypes() {
        return gushicishipinStatusTypes;
    }


    /**
	 * 设置：古诗词视频类型
	 */
    public void setGushicishipinStatusTypes(Integer gushicishipinStatusTypes) {
        this.gushicishipinStatusTypes = gushicishipinStatusTypes;
    }
    /**
	 * 获取：作者
	 */
    public String getGushicishipinZuozhe() {
        return gushicishipinZuozhe;
    }


    /**
	 * 设置：作者
	 */
    public void setGushicishipinZuozhe(String gushicishipinZuozhe) {
        this.gushicishipinZuozhe = gushicishipinZuozhe;
    }
    /**
	 * 获取：古诗词翻译
	 */
    public String getGushicishipinText() {
        return gushicishipinText;
    }


    /**
	 * 设置：古诗词翻译
	 */
    public void setGushicishipinText(String gushicishipinText) {
        this.gushicishipinText = gushicishipinText;
    }
    /**
	 * 获取：古诗词视频详情
	 */
    public String getGushicishipinContent() {
        return gushicishipinContent;
    }


    /**
	 * 设置：古诗词视频详情
	 */
    public void setGushicishipinContent(String gushicishipinContent) {
        this.gushicishipinContent = gushicishipinContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
