package com.example.beebuuserver.Common;

import com.example.beebuuserver.Model.User;

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
        {
            return "Ordered!";
        }else if(code.equals("1"))
        {
            return "On the way!";
        }else
        {
            return "Shipped!";
        }
    }
}
