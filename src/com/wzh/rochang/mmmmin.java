package com.wzh.rochang;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mmmmin {
    public static void main(String[] args) {

        List<Long> skuWareIdList = new ArrayList<>();

        List<Long> noCacheWebWareIdList = new ArrayList<>();
        List<Long> noCacheMobileWareIdList = new ArrayList<>();
        Map<Long,String> wareWebDetailCaches = new HashMap<>();
        Map<Long,String> wareMobileDetailCaches = new HashMap<>();

        for (Long wareId:skuWareIdList){
            String wareWebDetailCache = null;
            String wareMobileDetailCache = "1111";
            if (wareWebDetailCache==null&&wareWebDetailCache.equals("")){
                noCacheWebWareIdList.add(wareId);
            }else if (wareWebDetailCache!=null&&!wareWebDetailCache.equals("")){
                wareWebDetailCaches.put(wareId,wareWebDetailCache);
            }
            if (wareMobileDetailCache==null){
                noCacheMobileWareIdList.add(wareId);
            }else if (wareMobileDetailCache!=null&&!wareMobileDetailCache.equals("")){
                wareMobileDetailCaches.put(wareId,wareMobileDetailCache);
            }
        }
    }
}
