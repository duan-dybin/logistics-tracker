package com.logistics.service;

import com.logistics.model.TrackingInfo;

public interface TrackingService {
    TrackingInfo getTrackingInfo(String trackingNumber);
}