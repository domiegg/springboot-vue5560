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

import com.entity.ShenqingzhuanruEntity;
import com.entity.view.ShenqingzhuanruView;

import com.service.ShenqingzhuanruService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请转入
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-07 13:25:02
 */
@RestController
@RequestMapping("/shenqingzhuanru")
public class ShenqingzhuanruController {
    @Autowired
    private ShenqingzhuanruService shenqingzhuanruService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingzhuanruEntity shenqingzhuanru,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shenqingzhuanru.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingzhuanruEntity> ew = new EntityWrapper<ShenqingzhuanruEntity>();
		PageUtils page = shenqingzhuanruService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingzhuanru), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingzhuanruEntity shenqingzhuanru, 
		HttpServletRequest request){
        EntityWrapper<ShenqingzhuanruEntity> ew = new EntityWrapper<ShenqingzhuanruEntity>();
		PageUtils page = shenqingzhuanruService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingzhuanru), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingzhuanruEntity shenqingzhuanru){
       	EntityWrapper<ShenqingzhuanruEntity> ew = new EntityWrapper<ShenqingzhuanruEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingzhuanru, "shenqingzhuanru")); 
        return R.ok().put("data", shenqingzhuanruService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingzhuanruEntity shenqingzhuanru){
        EntityWrapper< ShenqingzhuanruEntity> ew = new EntityWrapper< ShenqingzhuanruEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingzhuanru, "shenqingzhuanru")); 
		ShenqingzhuanruView shenqingzhuanruView =  shenqingzhuanruService.selectView(ew);
		return R.ok("查询申请转入成功").put("data", shenqingzhuanruView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingzhuanruEntity shenqingzhuanru = shenqingzhuanruService.selectById(id);
        return R.ok().put("data", shenqingzhuanru);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingzhuanruEntity shenqingzhuanru = shenqingzhuanruService.selectById(id);
        return R.ok().put("data", shenqingzhuanru);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingzhuanruEntity shenqingzhuanru, HttpServletRequest request){
    	shenqingzhuanru.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingzhuanru);
        shenqingzhuanruService.insert(shenqingzhuanru);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingzhuanruEntity shenqingzhuanru, HttpServletRequest request){
    	shenqingzhuanru.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingzhuanru);
        shenqingzhuanruService.insert(shenqingzhuanru);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenqingzhuanruEntity shenqingzhuanru, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingzhuanru);
        shenqingzhuanruService.updateById(shenqingzhuanru);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingzhuanruService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShenqingzhuanruEntity> wrapper = new EntityWrapper<ShenqingzhuanruEntity>();
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

		int count = shenqingzhuanruService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
