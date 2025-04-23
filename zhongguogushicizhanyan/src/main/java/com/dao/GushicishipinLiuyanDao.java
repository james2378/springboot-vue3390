package com.dao;

import com.entity.GushicishipinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GushicishipinLiuyanView;

/**
 * 古诗词视频留言 Dao 接口
 *
 * @author 
 */
public interface GushicishipinLiuyanDao extends BaseMapper<GushicishipinLiuyanEntity> {

   List<GushicishipinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
