package com.logistics.service.impl;

import com.logistics.service.TrackingService;
import com.logistics.model.TrackingInfo;
import org.springframework.stereotype.Service;

@Service
public class UPSTrackingService implements TrackingService {
    @Override
    public TrackingInfo getTrackingInfo(String trackingNumber) {
        // 调用 UPS API 获取跟踪信息
        // 需要配置 UPS API 凭证
        return null;
    }
}