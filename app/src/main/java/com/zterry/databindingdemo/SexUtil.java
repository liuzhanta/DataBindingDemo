package com.zterry.databindingdemo;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2017/6/23 下午5:04
 */

public class SexUtil {

    public static String getSex(String sex)
    {
        if ("female".equals(sex)) {
            return "女";
        }else{
            return "男";
        }
    }
}
