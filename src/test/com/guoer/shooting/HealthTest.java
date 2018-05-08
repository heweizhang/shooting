package com.guoer.shooting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthTest extends BaseUnitTest {
    @Test
    public void crateTest() {
        List<Participator> list = new ArrayList<>();
        list.addAll(getParList(1l, "1,2", 1));
        list.addAll(getParList(1l, "2,3", 2));
        list.addAll(getParList(1l, "3,4", 3));
        System.out.println("-----end----");
        System.out.println(list.size());
    }

    /**
     * roleType 查询kwhealth_cates 组织人:1  主讲人：2  销售员：3
     *
     * @return
     */
    private List<Participator> getParList(Long atvid, String ids, int type) {
        String[] idsStrArr = ids.split(",");
        System.out.println("-----idsStrArr.length----:" + idsStrArr.length);
        Participator participator;
        List<Participator> list = new ArrayList<>();
        String roleName = "";
        for (int i = 0; i < idsStrArr.length; i++) {
            participator = new Participator();
            participator.setEmpid(Long.parseLong(idsStrArr[i]));
            switch (type) {
                case 1:
                    roleName = "组织人";
                    break;
                case 2:
                    roleName = "主讲人";
                    break;
                case 3:
                    roleName = "销售员";
                    break;
            }
            participator.setRoletype(type);
            participator.setRolename(roleName);
            participator.setAtvid(atvid);
            participator.setStatus(new Byte("1"));
            participator.setRemark("");
            participator.setCreated(0l);
            participator.setCreatedms(0);
            participator.setUpdated(0l);
            participator.setUpdatedms(0);
            list.add(participator);
        }
        return list;
    }

    @Test
    public void lambForEachTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("13");
        StringBuilder sb = new StringBuilder();
        list.forEach(s -> sb.append(s).append(","));
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("lambForEachTest:" +  sb.toString());

    }
}
