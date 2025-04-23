
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 古诗词视频
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/gushicishipin")
public class GushicishipinController {
    private static final Logger logger = LoggerFactory.getLogger(GushicishipinController.class);

    @Autowired
    private GushicishipinService gushicishipinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = gushicishipinService.queryPage(params);

        //字典表数据转换
        List<GushicishipinView> list =(List<GushicishipinView>)page.getList();
        for(GushicishipinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GushicishipinEntity gushicishipin = gushicishipinService.selectById(id);
        if(gushicishipin !=null){
            //entity转view
            GushicishipinView view = new GushicishipinView();
            BeanUtils.copyProperties( gushicishipin , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody GushicishipinEntity gushicishipin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,gushicishipin:{}",this.getClass().getName(),gushicishipin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<GushicishipinEntity> queryWrapper = new EntityWrapper<GushicishipinEntity>()
            .eq("gushicishipin_name", gushicishipin.getGushicishipinName())
            .eq("gushicishipin_types", gushicishipin.getGushicishipinTypes())
            .eq("gushicishipin_video", gushicishipin.getGushicishipinVideo())
            .eq("gushicishipin_date", gushicishipin.getGushicishipinDate())
            .eq("zan_number", gushicishipin.getZanNumber())
            .eq("cai_number", gushicishipin.getCaiNumber())
            .eq("gushicishipin_zuozhe", gushicishipin.getGushicishipinZuozhe())
            .eq("gushicishipin_text", gushicishipin.getGushicishipinText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GushicishipinEntity gushicishipinEntity = gushicishipinService.selectOne(queryWrapper);
        if(gushicishipinEntity==null){
            gushicishipin.setInsertTime(new Date());
            gushicishipin.setCreateTime(new Date());
            gushicishipinService.insert(gushicishipin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GushicishipinEntity gushicishipin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,gushicishipin:{}",this.getClass().getName(),gushicishipin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<GushicishipinEntity> queryWrapper = new EntityWrapper<GushicishipinEntity>()
            .notIn("id",gushicishipin.getId())
            .andNew()
            .eq("gushicishipin_name", gushicishipin.getGushicishipinName())
            .eq("gushicishipin_types", gushicishipin.getGushicishipinTypes())
            .eq("gushicishipin_video", gushicishipin.getGushicishipinVideo())
            .eq("gushicishipin_date", gushicishipin.getGushicishipinDate())
            .eq("zan_number", gushicishipin.getZanNumber())
            .eq("cai_number", gushicishipin.getCaiNumber())
            .eq("gushicishipin_zuozhe", gushicishipin.getGushicishipinZuozhe())
            .eq("gushicishipin_text", gushicishipin.getGushicishipinText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GushicishipinEntity gushicishipinEntity = gushicishipinService.selectOne(queryWrapper);
        if("".equals(gushicishipin.getGushicishipinPhoto()) || "null".equals(gushicishipin.getGushicishipinPhoto())){
                gushicishipin.setGushicishipinPhoto(null);
        }
        if("".equals(gushicishipin.getGushicishipinVideo()) || "null".equals(gushicishipin.getGushicishipinVideo())){
                gushicishipin.setGushicishipinVideo(null);
        }
        if("".equals(gushicishipin.getGushicishipinFile()) || "null".equals(gushicishipin.getGushicishipinFile())){
                gushicishipin.setGushicishipinFile(null);
        }
        if(gushicishipinEntity==null){
            gushicishipinService.updateById(gushicishipin);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        gushicishipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<GushicishipinEntity> gushicishipinList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            GushicishipinEntity gushicishipinEntity = new GushicishipinEntity();
//                            gushicishipinEntity.setGushicishipinName(data.get(0));                    //古诗词视频标题 要改的
//                            gushicishipinEntity.setGushicishipinTypes(Integer.valueOf(data.get(0)));   //古诗词类型 要改的
//                            gushicishipinEntity.setGushicishipinPhoto("");//详情和图片
//                            gushicishipinEntity.setGushicishipinVideo(data.get(0));                    //视频 要改的
//                            gushicishipinEntity.setGushicishipinFile(data.get(0));                    //文件 要改的
//                            gushicishipinEntity.setGushicishipinDate(data.get(0));                    //视频时长 要改的
//                            gushicishipinEntity.setZanNumber(Integer.valueOf(data.get(0)));   //赞 要改的
//                            gushicishipinEntity.setCaiNumber(Integer.valueOf(data.get(0)));   //踩 要改的
//                            gushicishipinEntity.setGushicishipinStatusTypes(data.get(0));                    //古诗词视频类型 要改的
//                            gushicishipinEntity.setGushicishipinZuozhe(data.get(0));                    //作者 要改的
//                            gushicishipinEntity.setGushicishipinText(data.get(0));                    //古诗词翻译 要改的
//                            gushicishipinEntity.setGushicishipinContent("");//详情和图片
//                            gushicishipinEntity.setInsertTime(date);//时间
//                            gushicishipinEntity.setCreateTime(date);//时间
                            gushicishipinList.add(gushicishipinEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        gushicishipinService.insertBatch(gushicishipinList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = gushicishipinService.queryPage(params);

        //字典表数据转换
        List<GushicishipinView> list =(List<GushicishipinView>)page.getList();
        for(GushicishipinView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GushicishipinEntity gushicishipin = gushicishipinService.selectById(id);
            if(gushicishipin !=null){


                //entity转view
                GushicishipinView view = new GushicishipinView();
                BeanUtils.copyProperties( gushicishipin , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody GushicishipinEntity gushicishipin, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,gushicishipin:{}",this.getClass().getName(),gushicishipin.toString());
        Wrapper<GushicishipinEntity> queryWrapper = new EntityWrapper<GushicishipinEntity>()
            .eq("gushicishipin_name", gushicishipin.getGushicishipinName())
            .eq("gushicishipin_types", gushicishipin.getGushicishipinTypes())
            .eq("gushicishipin_video", gushicishipin.getGushicishipinVideo())
            .eq("gushicishipin_date", gushicishipin.getGushicishipinDate())
            .eq("zan_number", gushicishipin.getZanNumber())
            .eq("cai_number", gushicishipin.getCaiNumber())
            .eq("gushicishipin_zuozhe", gushicishipin.getGushicishipinZuozhe())
            .eq("gushicishipin_text", gushicishipin.getGushicishipinText())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GushicishipinEntity gushicishipinEntity = gushicishipinService.selectOne(queryWrapper);
        if(gushicishipinEntity==null){
            gushicishipin.setInsertTime(new Date());
            gushicishipin.setCreateTime(new Date());
        gushicishipinService.insert(gushicishipin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
