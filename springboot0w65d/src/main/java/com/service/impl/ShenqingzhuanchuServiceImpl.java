package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShenqingzhuanchuDao;
import com.entity.ShenqingzhuanchuEntity;
import com.service.ShenqingzhuanchuService;
import com.entity.vo.ShenqingzhuanchuVO;
import com.entity.view.ShenqingzhuanchuView;

@Service("shenqingzhuanchuService")
public class ShenqingzhuanchuServiceImpl extends ServiceImpl<ShenqingzhuanchuDao, ShenqingzhuanchuEntity> implements ShenqingzhuanchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingzhuanchuEntity> page = this.selectPage(
                new Query<ShenqingzhuanchuEntity>(params).getPage(),
                new EntityWrapper<ShenqingzhuanchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingzhuanchuEntity> wrapper) {
		  Page<ShenqingzhuanchuView> page =new Query<ShenqingzhuanchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingzhuanchuVO> selectListVO(Wrapper<ShenqingzhuanchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingzhuanchuVO selectVO(Wrapper<ShenqingzhuanchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingzhuanchuView> selectListView(Wrapper<ShenqingzhuanchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingzhuanchuView selectView(Wrapper<ShenqingzhuanchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
