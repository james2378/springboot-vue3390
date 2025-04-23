package com.dao;

import com.entity.GushicishipinCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GushicishipinCollectionView;

/**
 * 古诗词视频收藏 Dao 接口
 *
 * @author 
 */
public interface GushicishipinCollectionDao extends BaseMapper<GushicishipinCollectionEntity> {

   List<GushicishipinCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
