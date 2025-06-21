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


import com.dao.ShenqingzhuanruDao;
import com.entity.ShenqingzhuanruEntity;
import com.service.ShenqingzhuanruService;
import com.entity.vo.ShenqingzhuanruVO;
import com.entity.view.ShenqingzhuanruView;

@Service("shenqingzhuanruService")
public class ShenqingzhuanruServiceImpl extends ServiceImpl<ShenqingzhuanruDao, ShenqingzhuanruEntity> implements ShenqingzhuanruService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingzhuanruEntity> page = this.selectPage(
                new Query<ShenqingzhuanruEntity>(params).getPage(),
                new EntityWrapper<ShenqingzhuanruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingzhuanruEntity> wrapper) {
		  Page<ShenqingzhuanruView> page =new Query<ShenqingzhuanruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingzhuanruVO> selectListVO(Wrapper<ShenqingzhuanruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingzhuanruVO selectVO(Wrapper<ShenqingzhuanruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingzhuanruView> selectListView(Wrapper<ShenqingzhuanruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingzhuanruView selectView(Wrapper<ShenqingzhuanruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
