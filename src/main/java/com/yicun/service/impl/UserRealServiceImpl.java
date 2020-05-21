package com.yicun.service.impl;

import com.yicun.entity.UserReal;
import com.yicun.dao.UserRealDao;
import com.yicun.service.UserRealService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserReal)表服务实现类
 *
 * @author makejava
 * @since 2020-02-08 20:02:14
 */
//@Service("userRealService")
@Service
public class UserRealServiceImpl implements UserRealService {
    @Resource
    private UserRealDao userRealDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserReal queryById(Integer id) {
        return this.userRealDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserReal> queryAllByLimit(int offset, int limit) {
        return this.userRealDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<UserReal> queryAll() {
        return this.userRealDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param userReal 实例对象
     * @return 实例对象
     */
    @Override
    public UserReal insert(UserReal userReal) {
        this.userRealDao.insert(userReal);
        return userReal;
    }

    /**
     * 修改数据
     *
     * @param userReal 实例对象
     * @return 实例对象
     */
    @Override
    public UserReal update(UserReal userReal) {
        this.userRealDao.update(userReal);
        return this.queryById(userReal.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userRealDao.deleteById(id) > 0;
    }
}