package com.logistics.controller;

import com.logistics.model.ApiResponse;
import com.logistics.model.TrackingInfo;
import com.logistics.service.TrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/tracking")
public class TrackingController {
    
    @Autowired
    private Map<String, TrackingService> trackingServices;
    
    @GetMapping("/{carrier}/{trackingNumber}")
    public ApiResponse<TrackingInfo> getTrackingInfo(
            @PathVariable String carrier,
            @PathVariable String trackingNumber) {
        try {
            TrackingService service = trackingServices.get(carrier.toLowerCase());
            if (service == null) {
                return ApiResponse.error(400, "不支持的物流商: " + carrier);
            }
            TrackingInfo info = service.getTrackingInfo(trackingNumber);
            return ApiResponse.success(info);
        } catch (Exception e) {
            return ApiResponse.error(500, "查询失败: " + e.getMessage());
        }
    }
}