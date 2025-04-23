package com.dao;

import com.entity.GushicishipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GushicishipinView;

/**
 * 古诗词视频 Dao 接口
 *
 * @author 
 */
public interface GushicishipinDao extends BaseMapper<GushicishipinEntity> {

   List<GushicishipinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
