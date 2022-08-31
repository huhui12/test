package com.itheima;

import java.util.Scanner;

/*品牌型号：商品的名称，String类型。
        尺寸：手机的大小，double类型。
        价格：手机的单价，double类型。
        配置：手机的内存等配置，String类型。*/
public class test08_30 {
    public static void main(String[] args) {
        //总库存数；
        int num;
        //库存总价；
        double Sum;
        String XingH="华为";
        double ChiC=5.5;
        double JiaG=3688.88;
        String PeiZ="8+128G全面流海屏";
        System.out.println("品牌："+XingH);
        System.out.println("尺寸："+ChiC);
        System.out.println("价格："+JiaG);
        System.out.println("配置："+PeiZ);
        System.out.println("请输入华为手机的库存数量:");
        Scanner sc1 = new Scanner(System.in);
        int Count=sc1.nextInt();
        double sum=Count*JiaG;
        System.out.println("库存华为手机的总经额:"+sum);


        String XH="小米";
        double CC=5.0;
        double JG=2988.88;
        String PZ="4+64G全面流海屏";
        System.out.println("品牌："+XH);
        System.out.println("尺寸："+CC);
        System.out.println("价格："+JG);
        System.out.println("配置："+PZ);
        System.out.println("请输入小米手机的库存数量:");
        Scanner sc2= new Scanner(System.in);
        int Count2=sc2.nextInt();
        double sum2=Count2*JG;
        System.out.println("库存小米手机的总经额:"+sum2);

        System.out.println("--------库存清单--------");
        System.out.println("品牌"+"\t"+"尺寸"+"\t"+"价格"+"\t"+"配置"+"\t"+"库存数量"+"\t"+"总价");
        System.out.println(XingH+"\t"+ChiC+"\t"+JiaG+"\t"+PeiZ+"\t"+Count+"\t"+sum);
        System.out.println(XH+"\t"+CC+"\t"+JG+"\t"+PZ+"\t"+Count2+"\t"+sum2);
        System.out.println("-----------------------");
        num=Count+Count2;
        Sum=sum+sum2;
        System.out.println("总库存:"+num);
        System.out.println("库存总价:"+Sum+"￥");
    }
}
