package com.yicun.service;

import com.yicun.entity.UserReal;
import java.util.List;

/**
 * (UserReal)表服务接口
 *
 * @author makejava
 * @since 2020-02-08 20:02:13
 */
public interface UserRealService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserReal queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserReal> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<UserReal> queryAll();

    /**
     * 新增数据
     *
     * @param userReal 实例对象
     * @return 实例对象
     */
    UserReal insert(UserReal userReal);

    /**
     * 修改数据
     *
     * @param userReal 实例对象
     * @return 实例对象
     */
    UserReal update(UserReal userReal);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}