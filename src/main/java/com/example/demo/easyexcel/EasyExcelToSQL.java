package com.example.demo.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class EasyExcelToSQL {

    // MySQL 表名
    private static final String TABLE_NAME = "kehuxinxi";

    // 批量插入的每批次大小

    private static String SQL_FILE_PATH = "";

    public static void main(String[] args) {
        // CSV 文件路径
        String csvFilePath = "E:\\kehuxinxi.xlsx";

        // 读取 CSV 文件并生成 SQL 语句
        generateInsertSql(csvFilePath);
    }

    /**
     * 读取 CSV 文件并生成批量 INSERT 语句
     */
    private static void generateInsertSql(String csvFilePath) {
        // 创建或覆盖 SQL 文件
        // 使用 EasyExcel 读取 CSV 文件，并指定编码为 UTF-8
        AtomicInteger a = new AtomicInteger(11111);
        EasyExcel.read(new File(csvFilePath), kehuxinxiDTO.class, new PageReadListener<kehuxinxiDTO>(dataList -> {
                    SQL_FILE_PATH = "E:\\SQL\\kehuxinxi\\" + a.get() + "---" + UUID.randomUUID() + ".sql";
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(SQL_FILE_PATH))) {
                        // 每次读取一批数据后，生成批量 INSERT 语句并写入文件
                        try {
                            String insertSql = buildBatchInsertSql(dataList);
                            writer.write(insertSql);
                            writer.newLine();  // 换行
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("SQL 文件生成成功: " + SQL_FILE_PATH);
                        a.getAndIncrement();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.err.println("生成 SQL 文件时发生错误: " + e.getMessage());
                    }
                }, 200000)).charset(StandardCharsets.UTF_8)  // 指定编码为 UTF-8
                .sheet().headRowNumber(1)  // 如果第一行是表头，设置 headRowNumber 为 1
                .doRead();


    }


    /**
     * 根据数据列表生成批量 INSERT 语句
     */
    private static synchronized String buildBatchInsertSql(List<kehuxinxiDTO> dataList) {
        // 构建列名部分
        StringBuilder columns = new StringBuilder();
        columns.append("INSERT INTO ").append(TABLE_NAME).append(" (");

        // 根据 DTO 字段顺序构建列名
        columns.append("xuhao,shangbaoriqi,dengjiriqi,dengjizhe,kehuxingming,kehudianhua,quyu,chengshi,loupanmingcheng,dizhi,fangwuleixing,huxing,xiaoshoufenbu,shichangbumen,yewuyuan,qitayewuyuan,paidanriqi,shejishi,kehujingli,fengongsi,zigongsi,bumen,laiyuan,laiyuanmingxi,qifanghuoxianfang,kehudengji,jiaofangriqi,dingjin,shejifei,beizhu,fenleibaobiao,shangbaozhuangtai,mianji,shigonghetong,hetongriqi,hetonghaoma,gongchengbianhao,jianli,xiangmujingli,kaigongriqi,jungongriqi,shijikaigongriqi,shijijungongriqi,gongchengzaojia,yusuanjia,yiqi,erqi,sanqi,siqi,guanlifei,shuijin,fucaifei,zhucaifei,rengongfei,wangluojianli,yonghuming,mima,gongchengbaoxiudan,baoxiudanhao,baoxiushijian,baoxiujieshushijian,baoxiushuoming,gongchengzhuangtai,gongchengjindu,jungongjiaofang,shifoushenhe,shenheshijian,kehuxuqiu,youhuijine,youhuixinxi,juzhudizhi,youbian,tuijiangongdi,tuijianshuoming,shejifendan,fengge,huifangshijian,huifangneirong,shujufenlei,xiangjingjiezhang,yewuhuifang,zhidao,zhuli,chunsheji,fuwuka,yuqijixiao,shijijixiao,shenhezhuangtai,banbao,kehujibie,gongqi,lirun,chanzhi,kehujiezhang,kehujiezhangri,xiangjingjiezhangri,zuizhongyouhui,gongchengbu,zhibaojin,fucaikongzhi,xiaoshougongsi,tongbubiaozhi,zengsong,wanchengshijian,shifoushouhui,laiyuanfandian,wuqi,guhua,yaochi,zhuangxiushijian,yusuanfenlei,zengsongchengben,tuidanriqi,kouchue,yejizhesuanbili,shangbaochengben,shifoujiti,jitishijian,cailiaocaigoushuie,yusuanyuan,neikongyuan,xindizhi,shifoufendan,shejishifakuan,yewuyuanfakuan,qitafakuan,yusuanleixing,mobanbianhao,zhijiefeichengbi,xiadanjiangfa,zengxiangjiti,shuidianguangpanbianhao,kongqijiancebianhao,xuancaiyuan,xuancaizhuangtai,baoxiudayin,baoxiudayinriqi,NCtongbu,huijiyuan,kuaididizhi,yueyujing,zhucaichengben,baoxiukatupian,gudingkaigongriqi,gudingjungongriqi");
        // 添加右括号
        columns.append(") VALUES ");

        // 构建值部分
        StringBuilder values = new StringBuilder();
        for (int i = 0; i < dataList.size(); i++) {
            kehuxinxiDTO data = dataList.get(i);
            // 拼接每个字段的值
            try {
                values.append("(")
                .append(safeValue(data.getXuhao()))
                .append(", ").append(safeValue(data.getShangbaoriqi()))
                .append(", ").append(safeValue(data.getDengjiriqi()))
                .append(", ").append(safeValue(data.getDengjizhe()))
                .append(", ").append(safeValue(data.getKehuxingming()))
                .append(", ").append(safeValue(data.getKehudianhua()))
                .append(", ").append(safeValue(data.getQuyu()))
                .append(", ").append(safeValue(data.getChengshi()))
                .append(", ").append(safeValue(data.getLoupanmingcheng()))
                .append(", ").append(safeValue(data.getDizhi()))
                .append(", ").append(safeValue(data.getFangwuleixing()))
                .append(", ").append(safeValue(data.getHuxing()))
                .append(", ").append(safeValue(data.getXiaoshoufenbu()))
                .append(", ").append(safeValue(data.getShichangbumen()))
                .append(", ").append(safeValue(data.getYewuyuan()))
                .append(", ").append(safeValue(data.getQitayewuyuan()))
                .append(", ").append(safeValue(data.getPaidanriqi()))
                .append(", ").append(safeValue(data.getShejishi()))
                .append(", ").append(safeValue(data.getKehujingli()))
                .append(", ").append(safeValue(data.getFengongsi()))
                .append(", ").append(safeValue(data.getZigongsi()))
                .append(", ").append(safeValue(data.getBumen()))
                .append(", ").append(safeValue(data.getLaiyuan()))
                .append(", ").append(safeValue(data.getLaiyuanmingxi()))
                .append(", ").append(safeValue(data.getQifanghuoxianfang()))
                .append(", ").append(safeValue(data.getKehudengji()))
                .append(", ").append(safeValue(data.getJiaofangriqi()))
                .append(", ").append(safeValue(data.getDingjin()))
                .append(", ").append(safeValue(data.getShejifei()))
                .append(", ").append(safeValue(data.getBeizhu()))
                .append(", ").append(safeValue(data.getFenleibaobiao()))
                .append(", ").append(safeValue(data.getShangbaozhuangtai()))
                .append(", ").append(safeValue(data.getMianji()))
                .append(", ").append(safeValue(data.getShigonghetong()))
                .append(", ").append(safeValue(data.getHetongriqi()))
                .append(", ").append(safeValue(data.getHetonghaoma()))
                .append(", ").append(safeValue(data.getGongchengbianhao()))
                .append(", ").append(safeValue(data.getJianli()))
                .append(", ").append(safeValue(data.getXiangmujingli()))
                .append(", ").append(safeValue(data.getKaigongriqi()))
                .append(", ").append(safeValue(data.getJungongriqi()))
                .append(", ").append(safeValue(data.getShijikaigongriqi()))
                .append(", ").append(safeValue(data.getShijijungongriqi()))
                .append(", ").append(safeValue(data.getGongchengzaojia()))
                .append(", ").append(safeValue(data.getYusuanjia()))
                .append(", ").append(safeValue(data.getYiqi()))
                .append(", ").append(safeValue(data.getErqi()))
                .append(", ").append(safeValue(data.getSanqi()))
                .append(", ").append(safeValue(data.getSiqi()))
                .append(", ").append(safeValue(data.getGuanlifei()))
                .append(", ").append(safeValue(data.getShuijin()))
                .append(", ").append(safeValue(data.getFucaifei()))
                .append(", ").append(safeValue(data.getZhucaifei()))
                .append(", ").append(safeValue(data.getRengongfei()))
                .append(", ").append(safeValue(data.getWangluojianli()))
                .append(", ").append(safeValue(data.getYonghuming()))
                .append(", ").append(safeValue(data.getMima()))
                .append(", ").append(safeValue(data.getGongchengbaoxiudan()))
                .append(", ").append(safeValue(data.getBaoxiudanhao()))
                .append(", ").append(safeValue(data.getBaoxiushijian()))
                .append(", ").append(safeValue(data.getBaoxiujieshushijian()))
                .append(", ").append(safeValue(data.getBaoxiushuoming()))
                .append(", ").append(safeValue(data.getGongchengzhuangtai()))
                .append(", ").append(safeValue(data.getGongchengjindu()))
                .append(", ").append(safeValue(data.getJungongjiaofang()))
                .append(", ").append(safeValue(data.getShifoushenhe()))
                .append(", ").append(safeValue(data.getShenheshijian()))
                .append(", ").append(safeValue(data.getKehuxuqiu()))
                .append(", ").append(safeValue(data.getYouhuijine()))
                .append(", ").append(safeValue(data.getYouhuixinxi()))
                .append(", ").append(safeValue(data.getJuzhudizhi()))
                .append(", ").append(safeValue(data.getYoubian()))
                .append(", ").append(safeValue(data.getTuijiangongdi()))
                .append(", ").append(safeValue(data.getTuijianshuoming()))
                .append(", ").append(safeValue(data.getShejifendan()))
                .append(", ").append(safeValue(data.getFengge()))
                .append(", ").append(safeValue(data.getHuifangshijian()))
                .append(", ").append(safeValue(data.getHuifangneirong()))
                .append(", ").append(safeValue(data.getShujufenlei()))
                .append(", ").append(safeValue(data.getXiangjingjiezhang()))
                .append(", ").append(safeValue(data.getYewuhuifang()))
                .append(", ").append(safeValue(data.getZhidao()))
                .append(", ").append(safeValue(data.getZhuli()))
                .append(", ").append(safeValue(data.getChunsheji()))
                .append(", ").append(safeValue(data.getFuwuka()))
                .append(", ").append(safeValue(data.getYuqijixiao()))
                .append(", ").append(safeValue(data.getShijijixiao()))
                .append(", ").append(safeValue(data.getShenhezhuangtai()))
                .append(", ").append(safeValue(data.getBanbao()))
                .append(", ").append(safeValue(data.getKehujibie()))
                .append(", ").append(safeValue(data.getGongqi()))
                .append(", ").append(safeValue(data.getLirun()))
                .append(", ").append(safeValue(data.getChanzhi()))
                .append(", ").append(safeValue(data.getKehujiezhang()))
                .append(", ").append(safeValue(data.getKehujiezhangri()))
                .append(", ").append(safeValue(data.getXiangjingjiezhangri()))
                .append(", ").append(safeValue(data.getZuizhongyouhui()))
                .append(", ").append(safeValue(data.getGongchengbu()))
                .append(", ").append(safeValue(data.getZhibaojin()))
                .append(", ").append(safeValue(data.getFucaikongzhi()))
                .append(", ").append(safeValue(data.getXiaoshougongsi()))
                .append(", ").append(safeValue(data.getTongbubiaozhi()))
                .append(", ").append(safeValue(data.getZengsong()))
                .append(", ").append(safeValue(data.getWanchengshijian()))
                .append(", ").append(safeValue(data.getShifoushouhui()))
                .append(", ").append(safeValue(data.getLaiyuanfandian()))
                .append(", ").append(safeValue(data.getWuqi()))
                .append(", ").append(safeValue(data.getGuhua()))
                .append(", ").append(safeValue(data.getYaochi()))
                .append(", ").append(safeValue(data.getZhuangxiushijian()))
                .append(", ").append(safeValue(data.getYusuanfenlei()))
                .append(", ").append(safeValue(data.getZengsongchengben()))
                .append(", ").append(safeValue(data.getTuidanriqi()))
                .append(", ").append(safeValue(data.getKouchue()))
                .append(", ").append(safeValue(data.getYejizhesuanbili()))
                .append(", ").append(safeValue(data.getShangbaochengben()))
                .append(", ").append(safeValue(data.getShifoujiti()))
                .append(", ").append(safeValue(data.getJitishijian()))
                .append(", ").append(safeValue(data.getCailiaocaigoushuie()))
                .append(", ").append(safeValue(data.getYusuanyuan()))
                .append(", ").append(safeValue(data.getNeikongyuan()))
                .append(", ").append(safeValue(data.getXindizhi()))
                .append(", ").append(safeValue(data.getShifoufendan()))
                .append(", ").append(safeValue(data.getShejishifakuan()))
                .append(", ").append(safeValue(data.getYewuyuanfakuan()))
                .append(", ").append(safeValue(data.getQitafakuan()))
                .append(", ").append(safeValue(data.getYusuanleixing()))
                .append(", ").append(safeValue(data.getMobanbianhao()))
                .append(", ").append(safeValue(data.getZhijiefeichengbi()))
                .append(", ").append(safeValue(data.getXiadanjiangfa()))
                .append(", ").append(safeValue(data.getZengxiangjiti()))
                .append(", ").append(safeValue(data.getShuidianguangpanbianhao()))
                .append(", ").append(safeValue(data.getKongqijiancebianhao()))
                .append(", ").append(safeValue(data.getXuancaiyuan()))
                .append(", ").append(safeValue(data.getXuancaizhuangtai()))
                .append(", ").append(safeValue(data.getBaoxiudayin()))
                .append(", ").append(safeValue(data.getBaoxiudayinriqi()))
                .append(", ").append(safeValue(data.getNCtongbu()))
                .append(", ").append(safeValue(data.getHuijiyuan()))
                .append(", ").append(safeValue(data.getKuaididizhi()))
                .append(", ").append(safeValue(data.getYueyujing()))
                .append(", ").append(safeValue(data.getZhucaichengben()))
                .append(", ").append(safeValue(data.getBaoxiukatupian()))
                .append(", ").append(safeValue(data.getGudingkaigongriqi()))
                .append(", ").append(safeValue(data.getGudingjungongriqi()))
                .append(")");
            } catch (NumberFormatException e) {
                System.err.println("序号：" + data.getXuhao());
            }
            // 如果不是最后一个元素，添加逗号分隔符
            if (i < dataList.size() - 1) {
                values.append(", ");
            }
        }

        // 返回完整的 SQL 语句
        return columns.toString() + values.toString() + ";";
    }

    /**
     * 处理值的安全性，确保字符串被正确转义，数值和布尔值直接返回
     *
     * @param value 要处理的值
     * @return 安全的值
     */
    private static String safeValue(Object value) {
        if (value == null) {
            return "NULL";
        } else if (value instanceof String) {
            return "'" + escapeSql((String) value) + "'";
        } else if (value instanceof Boolean) {
            return ((Boolean) value) ? "1" : "0";
        } else {
            return value.toString();
        }
    }

    /**
     * 转义 SQL 字符串中的特殊字符
     *
     * @param str 要转义的字符串
     * @return 转义后的字符串
     */
    private static String escapeSql(String str) {
        if (str == null) {
            return "NULL";
        }
        return str.replace("'", "''"); // 简单的 SQL 转义，实际应用中应使用 PreparedStatement
    }


}
