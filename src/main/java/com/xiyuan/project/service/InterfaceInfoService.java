package com.xiyuan.project.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiyuan.project.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.xiyuan.project.model.entity.InterfaceInfo;
import com.xiyuan.project.model.vo.InterfaceInfoVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author xiyuan
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-12-08 23:03:26
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 获取查询条件
     *
     * @param interfaceInfoQueryRequest
     * @return
     */
    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);


    /**
     * 分页获取接口封装
     *
     * @param interfaceInfoPage
     * @return
     */
    Page<InterfaceInfoVO> getInterfaceInfoVOPage(Page<InterfaceInfo> interfaceInfoPage);
    /**
     * 获取接口封装
     *
     * @param interfaceInfo
     * @return
     */
    InterfaceInfoVO getInterfaceInfoVO(InterfaceInfo interfaceInfo);
}
