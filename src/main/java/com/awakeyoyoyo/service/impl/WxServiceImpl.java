package com.awakeyoyoyo.service.impl;

import com.awakeyoyoyo.common.ServerResponse;
import com.awakeyoyoyo.entity.WXsession;
import com.awakeyoyoyo.service.IWxService;
import com.awakeyoyoyo.utils.HttpUtils;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service("iWxService")
public class WxServiceImpl implements IWxService {
    private static final String APPID = "wxeb6a51df550649e7";
    private static final String SECRET = "b7c8b6424d67634f5ef27e1bb64fd78c";
    private static final String LOGINURL="https://api.weixin.qq.com/sns/jscode2session";


    @Override
    public Map<String,String> Wxlogin(String js_code) {
        // ?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
        System.out.println("js_code="+js_code);
        System.out.println("appid="+APPID);
        System.out.println("cecret="+SECRET);
        String params="appid="+APPID+"&secret="+SECRET+"&js_code="+js_code+"&grant_type=authorization_code";
        String jsonResult=HttpUtils.SendGet(LOGINURL,params);
        System.out.println(jsonResult);
        //已经拿到了返回的json数据
        //GSON处理一哈
        Gson gson = new Gson();
        WXsession wxsession = gson.fromJson(jsonResult, WXsession.class);
        Map<String,String> reslutMap=new HashMap<String, String>();
        System.out.println("wx!!!openid="+wxsession.getOpenid());
        reslutMap.put("open_id",wxsession.getOpenid());
        return reslutMap;
    }
}
