package com.frgp.f1telemetry.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CreateFileUtil {
    /**
     * 生成.json格式文件
     */
    public static boolean createJsonFile(String jsonString, String fileName) {
        // 标记文件生成是否成功
        boolean flag = true;

        // 拼接文件完整路径
        String fullPath = fileName + ".json";

        // 生成json格式文件
        try {
            // 保证创建一个新文件
            File file = new File(fullPath);
//            if (!file.getParentFile().exists()) { // 如果父目录不存在，创建父目录
//                boolean flag_mkdirs = file.getParentFile().mkdirs();
//            }
            if (!file.exists()) { // 如果已存在,删除旧文件
                boolean flag_newFile = file.createNewFile();
            }

            // 将格式化后的字符串写入文件
            Writer write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            write.write(jsonString);
            write.flush();
            write.close();
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }

        // 返回是否成功的标记
        return flag;
    }

}