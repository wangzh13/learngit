package com.wzh.rochang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        List<String> skuCodeList = new ArrayList<>();
        skuCodeList.add("1");
        List<Long> partnerIdList = new ArrayList<>();
        partnerIdList.add(1L);
        Map ss = test.validList(skuCodeList,partnerIdList,null);
        System.out.println(ss.size());
        System.out.println(ss.get("type"));
        System.out.println(ss.get("code"));
        System.out.println(ss.get("number"));
    }

    public Map validList(List<String> skuCodeList,List<Long> partnerIdList,List<Long> wareBrandIdList) {
        int i = 0;
        List s = new ArrayList();
        String type = "";
        if (skuCodeList != null && skuCodeList.size() != 0) {
            i++;
            s = skuCodeList;
            type = "skuCodeList";
        }
        if (partnerIdList != null && partnerIdList.size() != 0) {
            i++;
            s = partnerIdList;
            type = "partnerIdList";
        }
        if (wareBrandIdList != null && wareBrandIdList.size() != 0) {
            i++;
            s = wareBrandIdList;
            type = "wareBrandIdList";
        }
        Map<String, Object> result = new HashMap<>();
        result.put("number", i);
        result.put("type", type);
        result.put("code", s);
        return result;
    }
}
