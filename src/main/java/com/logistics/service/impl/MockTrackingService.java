package com.logistics.service.impl;

import com.logistics.model.TrackingInfo;
import com.logistics.model.TrackingEvent;
import com.logistics.service.TrackingService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service("ups")
public class MockTrackingService implements TrackingService {
    @Override
    public TrackingInfo getTrackingInfo(String trackingNumber) {
        TrackingInfo info = new TrackingInfo();
        info.setTrackingNumber(trackingNumber);
        info.setCarrier("UPS");
        info.setStatus("运输中");
        
        List<TrackingEvent> events = new ArrayList<>();
        
        // 创建第一个事件
        TrackingEvent event1 = new TrackingEvent();
        event1.setTimestamp(LocalDateTime.now());
        event1.setCountry("中国");
        event1.setCity("上海");
        event1.setDescription("包裹已发出");
        events.add(event1);
        
        // 创建第二个事件
        TrackingEvent event2 = new TrackingEvent();
        event2.setTimestamp(LocalDateTime.now().minusDays(1));
        event2.setCountry("中国");
        event2.setCity("广州");
        event2.setDescription("包裹已到达分拣中心");
        events.add(event2);
        
        // 创建第三个事件

        TrackingEvent event3 = new TrackingEvent();
        event3.setTimestamp(LocalDateTime.now().minusDays(1));
        event3.setCountry("西班牙");
        event3.setCity("马德里");
        event3.setDescription("包裹已到达分拣中心");
        events.add(event3);
        
        // 创建更多国际物流事件
        TrackingEvent event4 = new TrackingEvent();
        event4.setTimestamp(LocalDateTime.now().minusDays(2));
        event4.setCountry("法国");
        event4.setCity("巴黎");
        event4.setDescription("包裹已到达转运中心");
        events.add(event4);

        TrackingEvent event5 = new TrackingEvent();
        event5.setTimestamp(LocalDateTime.now().minusDays(3));
        event5.setCountry("德国");
        event5.setCity("法兰克福");
        event5.setDescription("包裹正在清关中");
        events.add(event5);

        TrackingEvent event6 = new TrackingEvent();
        event6.setTimestamp(LocalDateTime.now().minusDays(4));
        event6.setCountry("意大利");
        event6.setCity("米兰");
        event6.setDescription("包裹已送达当地配送中心");
        events.add(event6);

        TrackingEvent event7 = new TrackingEvent();
        event7.setTimestamp(LocalDateTime.now().minusDays(5));
        event7.setCountry("英国");
        event7.setCity("伦敦");
        event7.setDescription("包裹正在派送中");
        events.add(event7);

        TrackingEvent event8 = new TrackingEvent();
        event8.setTimestamp(LocalDateTime.now().minusDays(6));
        event8.setCountry("荷兰");
        event8.setCity("阿姆斯特丹");
        event8.setDescription("包裹已到达分拣中心");
        events.add(event8);

        TrackingEvent event9 = new TrackingEvent();
        event9.setTimestamp(LocalDateTime.now().minusDays(7));
        event9.setCountry("比利时");
        event9.setCity("布鲁塞尔");
        event9.setDescription("包裹已完成安检");
        events.add(event9);

        TrackingEvent event10 = new TrackingEvent();
        event10.setTimestamp(LocalDateTime.now().minusDays(8));
        event10.setCountry("瑞士");
        event10.setCity("苏黎世");
        event10.setDescription("包裹已入库");
        events.add(event10);

        TrackingEvent event11 = new TrackingEvent();
        event11.setTimestamp(LocalDateTime.now().minusDays(9));
        event11.setCountry("奥地利");
        event11.setCity("维也纳");
        event11.setDescription("包裹已到达转运中心");
        events.add(event11);

        TrackingEvent event12 = new TrackingEvent();
        event12.setTimestamp(LocalDateTime.now().minusDays(10));
        event12.setCountry("葡萄牙");
        event12.setCity("里斯本");
        event12.setDescription("包裹已完成称重");
        events.add(event12);

        TrackingEvent event13 = new TrackingEvent();
        event13.setTimestamp(LocalDateTime.now().minusDays(11));
        event13.setCountry("瑞典");
        event13.setCity("斯德哥尔摩");
        event13.setDescription("包裹已通过海关检查");
        events.add(event13);

        info.setEvents(events);
        return info;
    }
}