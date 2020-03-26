package com.wzh.rochang;

import java.util.ArrayList;
import java.util.LinkedList;

public class shuxue {

    public static void main(String[] args) {
//        shuxue shuxue = new shuxue();
//        LinkedList<xiangshu> list1 = shuxue.duoxiangshi(5,2,7);
//        LinkedList<xiangshu> list2 = shuxue.duoxiangshi(3,6,5);
//        LinkedList<xiangshu> list3 = new LinkedList();
//        LinkedList<xiangshu> list4 = new LinkedList();
//        for (xiangshu xiangshu:list1) {
//            for (xiangshu xiangshu1:list2) {
//                xiangshu xiangshu2 = new xiangshu();
//                int h = xiangshu.getIndex()+xiangshu1.getIndex();
//                int w = xiangshu.getXishu() * xiangshu1.getXishu();
//                xiangshu2.setIndex(h);
//                xiangshu2.setXishu(w);
//                list3.add(xiangshu2);
//            }
//        }
//        ArrayList list5 = new ArrayList();
//        ArrayList list6 = new ArrayList();
//        for (int r=0;r<list3.size();r++) {
//            if(!list5.contains(list3.get(r).getIndex())){
//                list5.add(list3.get(r).getIndex());
//            };
//        }
//
//        for (int r=0;r<list3.size();r++) {
//            if(!list6.contains(list3.get(r).getIndex())){
//                list6.add(list3.get(r).getIndex());
//            };
//        }
//        for (int r=0;r<list3.size();r++) {
//            for (int z=0;z<list5.size();z++){
//                if (list3.get(r)==list5.get(z)) {
//                    xiangshu xiangshu7 = new xiangshu();
//                    int j = list3.get(r).getXishu() + list3.get(z).getXishu();
//                    int l = list3.get(r).getIndex();
//                    xiangshu7.setIndex(l);
//                    xiangshu7.setXishu(z);
//                    list4.add(xiangshu7);
//                }
//            }
//        }
//        for (xiangshu xiangshu6:list4) {
//            System.out.println(xiangshu6.getXishu()+"我是几平方"+xiangshu6.getIndex());
//        }
        shuxue shuxue = new shuxue();
        shuxue.sdsds();
    }

    public LinkedList<xiangshu> duoxiangshi(int xishu1, int xishu2, int xishu3){
        LinkedList list = new LinkedList();
        xiangshu xiangshu1 =new xiangshu();
        xiangshu1.setXishu(xishu1);
        xiangshu1.setIndex(2);
        list.add(xiangshu1);
        xiangshu xiangshu2 =new xiangshu();
        xiangshu2.setXishu(xishu2);
        xiangshu2.setIndex(1);
        list.add(xiangshu2);
        xiangshu xiangshu3 =new xiangshu();
        xiangshu3.setXishu(xishu3);
        xiangshu3.setIndex(0);
        list.add(xiangshu3);
        return list;
    }

    public void sdsds(Object... param){
        for (Object o :
                param) {
            System.out.println(param);
        }
    }
}
