package com.example.demo.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class kehuxinxiDTO {

    @ExcelProperty("xuhao")
    private Integer xuhao; // int

    @ExcelProperty("shangbaoriqi")
    private String shangbaoriqi; // varchar(25)

    @ExcelProperty("dengjiriqi")
    private String dengjiriqi; // varchar(25)

    @ExcelProperty("dengjizhe")
    private String dengjizhe; // varchar(20)

    @ExcelProperty("kehuxingming")
    private String kehuxingming; // varchar(40)

    @ExcelProperty("kehudianhua")
    private String kehudianhua; // varchar(50)

    @ExcelProperty("quyu")
    private String quyu; // varchar(10)

    @ExcelProperty("chengshi")
    private String chengshi; // varchar(10)

    @ExcelProperty("loupanmingcheng")
    private String loupanmingcheng; // varchar(100)

    @ExcelProperty("dizhi")
    private String dizhi; // varchar(200)

    @ExcelProperty("fangwuleixing")
    private String fangwuleixing; // varchar(50)

    @ExcelProperty("huxing")
    private String huxing; // varchar(50)

    @ExcelProperty("xiaoshoufenbu")
    private String xiaoshoufenbu; // varchar(50)

    @ExcelProperty("shichangbumen")
    private String shichangbumen; // varchar(10)

    @ExcelProperty("yewuyuan")
    private String yewuyuan; // varchar(20)

    @ExcelProperty("qitayewuyuan")
    private String qitayewuyuan; // varchar(20)

    @ExcelProperty("paidanriqi")
    private String paidanriqi; // varchar(25)

    @ExcelProperty("shejishi")
    private String shejishi; // varchar(20)

    @ExcelProperty("kehujingli")
    private String kehujingli; // varchar(20)

    @ExcelProperty("fengongsi")
    private String fengongsi; // varchar(50)

    @ExcelProperty("zigongsi")
    private String zigongsi; // varchar(50)

    @ExcelProperty("bumen")
    private String bumen; // varchar(10)

    @ExcelProperty("laiyuan")
    private String laiyuan; // varchar(10)

    @ExcelProperty("laiyuanmingxi")
    private String laiyuanmingxi; // varchar(200)

    @ExcelProperty("qifanghuoxianfang")
    private String qifanghuoxianfang; // varchar(10)

    @ExcelProperty("kehudengji")
    private String kehudengji; // varchar(20)

    @ExcelProperty("jiaofangriqi")
    private String jiaofangriqi; // varchar(25)

    @ExcelProperty("dingjin")
    private BigDecimal dingjin; // decimal(18, 2)

    @ExcelProperty("shejifei")
    private BigDecimal shejifei; // decimal(18, 2)

    @ExcelProperty("beizhu")
    private String beizhu; // varchar(400)

    @ExcelProperty("fenleibaobiao")
    private String fenleibaobiao; // varchar(20)

    @ExcelProperty("shangbaozhuangtai")
    private String shangbaozhuangtai; // varchar(10)

    @ExcelProperty("mianji")
    private BigDecimal mianji; // decimal(18, 2)

    @ExcelProperty("shigonghetong")
    private String shigonghetong; // varchar(10)

    @ExcelProperty("hetongriqi")
    private String hetongriqi; // varchar(25)

    @ExcelProperty("hetonghaoma")
    private String hetonghaoma; // varchar(100)

    @ExcelProperty("gongchengbianhao")
    private String gongchengbianhao; // varchar(50)

    @ExcelProperty("jianli")
    private String jianli; // varchar(20)

    @ExcelProperty("xiangmujingli")
    private String xiangmujingli; // varchar(20)

    @ExcelProperty("kaigongriqi")
    private String kaigongriqi; // varchar(25)

    @ExcelProperty("jungongriqi")
    private String jungongriqi; // varchar(25)

    @ExcelProperty("shijikaigongriqi")
    private String shijikaigongriqi; // varchar(25)

    @ExcelProperty("shijijungongriqi")
    private String shijijungongriqi; // varchar(25)

    @ExcelProperty("gongchengzaojia")
    private BigDecimal gongchengzaojia; // decimal(18, 2)

    @ExcelProperty("yusuanjia")
    private BigDecimal yusuanjia; // decimal(18, 2)

    @ExcelProperty("yiqi")
    private BigDecimal yiqi; // decimal(18, 2)

    @ExcelProperty("erqi")
    private BigDecimal erqi; // decimal(18, 2)

    @ExcelProperty("sanqi")
    private BigDecimal sanqi; // decimal(18, 2)

    @ExcelProperty("siqi")
    private BigDecimal siqi; // decimal(18, 2)

    @ExcelProperty("guanlifei")
    private BigDecimal guanlifei; // decimal(18, 2)

    @ExcelProperty("shuijin")
    private BigDecimal shuijin; // decimal(18, 2)

    @ExcelProperty("fucaifei")
    private BigDecimal fucaifei; // decimal(18, 2)

    @ExcelProperty("zhucaifei")
    private BigDecimal zhucaifei; // decimal(18, 2)

    @ExcelProperty("rengongfei")
    private BigDecimal rengongfei; // decimal(18, 2)

    @ExcelProperty("wangluojianli")
    private String wangluojianli; // varchar(50)

    @ExcelProperty("yonghuming")
    private String yonghuming; // varchar(50)

    @ExcelProperty("mima")
    private String mima; // varchar(50)

    @ExcelProperty("gongchengbaoxiudan")
    private String gongchengbaoxiudan; // varchar(50)

    @ExcelProperty("baoxiudanhao")
    private String baoxiudanhao; // varchar(50)

    @ExcelProperty("baoxiushijian")
    private String baoxiushijian; // varchar(25)

    @ExcelProperty("baoxiujieshushijian")
    private String baoxiujieshushijian; // varchar(25)

    @ExcelProperty("baoxiushuoming")
    private String baoxiushuoming; // varchar(200)

    @ExcelProperty("gongchengzhuangtai")
    private String gongchengzhuangtai; // varchar(50)

    @ExcelProperty("gongchengjindu")
    private String gongchengjindu; // varchar(10)

    @ExcelProperty("jungongjiaofang")
    private String jungongjiaofang; // varchar(25)

    @ExcelProperty("shifoushenhe")
    private String shifoushenhe; // varchar(10)

    @ExcelProperty("shenheshijian")
    private String shenheshijian; // varchar(10)

    @ExcelProperty("kehuxuqiu")
    private String kehuxuqiu; // varchar(200)

    @ExcelProperty("youhuijine")
    private BigDecimal youhuijine; // decimal(18, 2)

    @ExcelProperty("youhuixinxi")
    private String youhuixinxi; // varchar(2000)

    @ExcelProperty("juzhudizhi")
    private String juzhudizhi; // varchar(200)

    @ExcelProperty("youbian")
    private String youbian; // varchar(50)

    @ExcelProperty("tuijiangongdi")
    private String tuijiangongdi; // varchar(10)

    @ExcelProperty("tuijianshuoming")
    private String tuijianshuoming; // varchar(200)

    @ExcelProperty("shejifendan")
    private BigDecimal shejifendan; // decimal(18, 1)

    @ExcelProperty("fengge")
    private String fengge; // varchar(20)

    @ExcelProperty("huifangshijian")
    private String huifangshijian; // varchar(25)

    @ExcelProperty("huifangneirong")
    private String huifangneirong; // varchar(1000)

    @ExcelProperty("shujufenlei")
    private String shujufenlei; // varchar(10)

    @ExcelProperty("xiangjingjiezhang")
    private String xiangjingjiezhang; // varchar(2)

    @ExcelProperty("yewuhuifang")
    private String yewuhuifang; // varchar(10)

    @ExcelProperty("zhidao")
    private String zhidao; // varchar(400)

    @ExcelProperty("zhuli")
    private String zhuli; // varchar(10)

    @ExcelProperty("chunsheji")
    private String chunsheji; // varchar(10)

    @ExcelProperty("fuwuka")
    private String fuwuka; // varchar(50)

    @ExcelProperty("yuqijixiao")
    private BigDecimal yuqijixiao; // decimal(18, 2)

    @ExcelProperty("shijijixiao")
    private BigDecimal shijijixiao; // decimal(18, 2)

    @ExcelProperty("shenhezhuangtai")
    private String shenhezhuangtai; // varchar(10)

    @ExcelProperty("banbao")
    private BigDecimal banbao; // decimal(18, 2)

    @ExcelProperty("kehujibie")
    private String kehujibie; // varchar(10)

    @ExcelProperty("gongqi")
    private Integer gongqi; // int

    @ExcelProperty("lirun")
    private BigDecimal lirun; // decimal(18, 2)

    @ExcelProperty("chanzhi")
    private BigDecimal chanzhi; // decimal(18, 2)

    @ExcelProperty("kehujiezhang")
    private String kehujiezhang; // varchar(10)

    @ExcelProperty("kehujiezhangri")
    private String kehujiezhangri; // varchar(25)

    @ExcelProperty("xiangjingjiezhangri")
    private String xiangjingjiezhangri; // varchar(25)

    @ExcelProperty("zuizhongyouhui")
    private BigDecimal zuizhongyouhui; // decimal(18, 2)

    @ExcelProperty("gongchengbu")
    private String gongchengbu; // varchar(50)

    @ExcelProperty("zhibaojin")
    private BigDecimal zhibaojin; // decimal(18, 2)

    @ExcelProperty("fucaikongzhi")
    private BigDecimal fucaikongzhi; // decimal(18, 2)

    @ExcelProperty("xiaoshougongsi")
    private String xiaoshougongsi; // varchar(50)

    @ExcelProperty("tongbubiaozhi")
    private String tongbubiaozhi; // varchar(2)

    @ExcelProperty("zengsong")
    private String zengsong; // varchar(200)

    @ExcelProperty("wanchengshijian")
    private String wanchengshijian; // varchar(25)

    @ExcelProperty("shifoushouhui")
    private String shifoushouhui; // varchar(10)

    @ExcelProperty("laiyuanfandian")
    private Integer laiyuanfandian; // int

    @ExcelProperty("wuqi")
    private BigDecimal wuqi; // decimal(18, 2)

    @ExcelProperty("guhua")
    private String guhua; // varchar(100)

    @ExcelProperty("yaochi")
    private String yaochi; // varchar(10)

    @ExcelProperty("zhuangxiushijian")
    private String zhuangxiushijian; // varchar(20)

    @ExcelProperty("yusuanfenlei")
    private String yusuanfenlei; // varchar(10)

    @ExcelProperty("zengsongchengben")
    private BigDecimal zengsongchengben; // decimal(18, 2)

    @ExcelProperty("tuidanriqi")
    private String tuidanriqi; // varchar(25)

    @ExcelProperty("kouchue")
    private BigDecimal kouchue; // decimal(18, 2)

    @ExcelProperty("yejizhesuanbili")
    private BigDecimal yejizhesuanbili; // decimal(18, 4)

    @ExcelProperty("shangbaochengben")
    private BigDecimal shangbaochengben; // decimal(18, 2)

    @ExcelProperty("shifoujiti")
    private String shifoujiti; // varchar(10)

    @ExcelProperty("jitishijian")
    private String jitishijian; // varchar(25)

    @ExcelProperty("cailiaocaigoushuie")
    private BigDecimal cailiaocaigoushuie; // decimal(18, 2)

    @ExcelProperty("yusuanyuan")
    private String yusuanyuan; // varchar(10)

    @ExcelProperty("neikongyuan")
    private String neikongyuan; // varchar(10)

    @ExcelProperty("xindizhi")
    private String xindizhi; // varchar(200)

    @ExcelProperty("shifoufendan")
    private String shifoufendan; // varchar(10)

    @ExcelProperty("shejishifakuan")
    private BigDecimal shejishifakuan; // decimal(18, 2)

    @ExcelProperty("yewuyuanfakuan")
    private BigDecimal yewuyuanfakuan; // decimal(18, 2)

    @ExcelProperty("qitafakuan")
    private String qitafakuan; // varchar(200)

    @ExcelProperty("yusuanleixing")
    private String yusuanleixing; // varchar(20)

    @ExcelProperty("mobanbianhao")
    private String mobanbianhao; // varchar(20)

    @ExcelProperty("zhijiefeichengbi")
    private BigDecimal zhijiefeichengbi; // decimal(18, 2)

    @ExcelProperty("xiadanjiangfa")
    private BigDecimal xiadanjiangfa; // decimal(18, 2)

    @ExcelProperty("zengxiangjiti")
    private BigDecimal zengxiangjiti; // decimal(18, 2)

    @ExcelProperty("shuidianguangpanbianhao")
    private String shuidianguangpanbianhao; // varchar(50)

    @ExcelProperty("kongqijiancebianhao")
    private String kongqijiancebianhao; // varchar(50)

    @ExcelProperty("xuancaiyuan")
    private String xuancaiyuan; // varchar(30)

    @ExcelProperty("xuancaizhuangtai")
    private String xuancaizhuangtai; // varchar(20)

    @ExcelProperty("baoxiudayin")
    private String baoxiudayin; // varchar(10)

    @ExcelProperty("baoxiudayinriqi")
    private String baoxiudayinriqi; // varchar(25)

    @ExcelProperty("NCtongbu")
    private String NCtongbu; // varchar(20)

    @ExcelProperty("huijiyuan")
    private String huijiyuan; // varchar(50)

    @ExcelProperty("kuaididizhi")
    private String kuaididizhi; // varchar(500)

    @ExcelProperty("yueyujing")
    private String yueyujing; // varchar(30)

    @ExcelProperty("zhucaichengben")
    private BigDecimal zhucaichengben; // decimal(18, 2)

    @ExcelProperty("baoxiukatupian")
    private String baoxiukatupian; // text - 使用String表示

    @ExcelProperty("gudingkaigongriqi")
    private String gudingkaigongriqi; // varchar(25)

    @ExcelProperty("gudingjungongriqi")
    private String gudingjungongriqi; // varchar(25)
}