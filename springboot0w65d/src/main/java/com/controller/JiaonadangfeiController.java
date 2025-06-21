package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaonadangfeiEntity;
import com.entity.view.JiaonadangfeiView;

import com.service.JiaonadangfeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 缴纳党费
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
@RestController
@RequestMapping("/jiaonadangfei")
public class JiaonadangfeiController {
    @Autowired
    private JiaonadangfeiService jiaonadangfeiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaonadangfeiEntity jiaonadangfei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiaonadangfei.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("dangzhibu")) {
			jiaonadangfei.setDangzhibumingcheng((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaonadangfeiEntity> ew = new EntityWrapper<JiaonadangfeiEntity>();
		PageUtils page = jiaonadangfeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaonadangfei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaonadangfeiEntity jiaonadangfei, 
		HttpServletRequest request){
        EntityWrapper<JiaonadangfeiEntity> ew = new EntityWrapper<JiaonadangfeiEntity>();
		PageUtils page = jiaonadangfeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaonadangfei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaonadangfeiEntity jiaonadangfei){
       	EntityWrapper<JiaonadangfeiEntity> ew = new EntityWrapper<JiaonadangfeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaonadangfei, "jiaonadangfei")); 
        return R.ok().put("data", jiaonadangfeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaonadangfeiEntity jiaonadangfei){
        EntityWrapper< JiaonadangfeiEntity> ew = new EntityWrapper< JiaonadangfeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaonadangfei, "jiaonadangfei")); 
		JiaonadangfeiView jiaonadangfeiView =  jiaonadangfeiService.selectView(ew);
		return R.ok("查询缴纳党费成功").put("data", jiaonadangfeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaonadangfeiEntity jiaonadangfei = jiaonadangfeiService.selectById(id);
        return R.ok().put("data", jiaonadangfei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaonadangfeiEntity jiaonadangfei = jiaonadangfeiService.selectById(id);
        return R.ok().put("data", jiaonadangfei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaonadangfeiEntity jiaonadangfei, HttpServletRequest request){
    	jiaonadangfei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaonadangfei);
        jiaonadangfeiService.insert(jiaonadangfei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaonadangfeiEntity jiaonadangfei, HttpServletRequest request){
    	jiaonadangfei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaonadangfei);
        jiaonadangfeiService.insert(jiaonadangfei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaonadangfeiEntity jiaonadangfei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaonadangfei);
        jiaonadangfeiService.updateById(jiaonadangfei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaonadangfeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiaonadangfeiEntity> wrapper = new EntityWrapper<JiaonadangfeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("dangzhibu")) {
			wrapper.eq("dangzhibumingcheng", (String)request.getSession().getAttribute("username"));
		}

		int count = jiaonadangfeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
