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

import com.entity.ShenqingzhuanchuEntity;
import com.entity.view.ShenqingzhuanchuView;

import com.service.ShenqingzhuanchuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请转出
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
@RestController
@RequestMapping("/shenqingzhuanchu")
public class ShenqingzhuanchuController {
    @Autowired
    private ShenqingzhuanchuService shenqingzhuanchuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingzhuanchuEntity shenqingzhuanchu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shenqingzhuanchu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingzhuanchuEntity> ew = new EntityWrapper<ShenqingzhuanchuEntity>();
		PageUtils page = shenqingzhuanchuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingzhuanchu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingzhuanchuEntity shenqingzhuanchu, 
		HttpServletRequest request){
        EntityWrapper<ShenqingzhuanchuEntity> ew = new EntityWrapper<ShenqingzhuanchuEntity>();
		PageUtils page = shenqingzhuanchuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingzhuanchu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingzhuanchuEntity shenqingzhuanchu){
       	EntityWrapper<ShenqingzhuanchuEntity> ew = new EntityWrapper<ShenqingzhuanchuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingzhuanchu, "shenqingzhuanchu")); 
        return R.ok().put("data", shenqingzhuanchuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingzhuanchuEntity shenqingzhuanchu){
        EntityWrapper< ShenqingzhuanchuEntity> ew = new EntityWrapper< ShenqingzhuanchuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingzhuanchu, "shenqingzhuanchu")); 
		ShenqingzhuanchuView shenqingzhuanchuView =  shenqingzhuanchuService.selectView(ew);
		return R.ok("查询申请转出成功").put("data", shenqingzhuanchuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingzhuanchuEntity shenqingzhuanchu = shenqingzhuanchuService.selectById(id);
        return R.ok().put("data", shenqingzhuanchu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingzhuanchuEntity shenqingzhuanchu = shenqingzhuanchuService.selectById(id);
        return R.ok().put("data", shenqingzhuanchu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingzhuanchuEntity shenqingzhuanchu, HttpServletRequest request){
    	shenqingzhuanchu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingzhuanchu);
        shenqingzhuanchuService.insert(shenqingzhuanchu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingzhuanchuEntity shenqingzhuanchu, HttpServletRequest request){
    	shenqingzhuanchu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingzhuanchu);
        shenqingzhuanchuService.insert(shenqingzhuanchu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenqingzhuanchuEntity shenqingzhuanchu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingzhuanchu);
        shenqingzhuanchuService.updateById(shenqingzhuanchu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingzhuanchuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShenqingzhuanchuEntity> wrapper = new EntityWrapper<ShenqingzhuanchuEntity>();
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

		int count = shenqingzhuanchuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
