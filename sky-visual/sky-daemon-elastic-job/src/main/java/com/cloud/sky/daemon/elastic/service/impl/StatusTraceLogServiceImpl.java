package com.cloud.sky.daemon.elastic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.sky.daemon.elastic.entity.StatusTraceLog;
import com.cloud.sky.daemon.elastic.mapper.StatusTraceLogMapper;
import com.cloud.sky.daemon.elastic.service.StatusTraceLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 任务轨迹处理
 *
 * @author lishangbu
 * @date 2018/11/22
 */
@Service("statusTraceLogService")
@AllArgsConstructor
public class StatusTraceLogServiceImpl extends ServiceImpl<StatusTraceLogMapper, StatusTraceLog> implements StatusTraceLogService {

}
