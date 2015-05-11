package com.xiniunet.surrounding.auth.constans;

/**
 * Created on 2015-05-11.
 *
 * @author 吕浩
 * @since 1.0.0
 */
public class Constants {
    /**
     * 项目路径
     */
    public static String PROJECT_URL;

    /**
     * 产品代码
     */
    public static String PROJECT_CODE;

    public static final String CHILD_URL = "/src/main/webapp";

    public static final String WEB_INFO_URL = "/src/main/webapp/WEB-INF";

    public static final String DEFAULT_WEBX_XML = "/src/main/webapp/WEB-INF/webx.xml";

    public static final String SCREEN_LOCATION = "templates/screen";

    /**
     * 白名单文件夹
     */
    public static String []WHITE_FOLDERS = {"META-INF", "WEB-INF"};

    /**
     * 判断文件夹是否为白名单文件夹
     * @param folderName
     * @return
     */
    public static boolean isWhiteFolder(String folderName) {
        for(String s : WHITE_FOLDERS) {
            if(folderName.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static int getPreUrlLength() {
        return PROJECT_URL.length() + CHILD_URL.length() + 1;
    }
}