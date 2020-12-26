package com.company.week4;

public class methodSample {
    public static void main(String[] args) {

        String doyoungName= "doyoung";
        String illyName= "illy";

        final String doyoungNaverEmail = generateNaverMailByName(doyoungName);
        final String illyNaverEmail = generateNaverMailByName(illyName);

        System.out.println(doyoungNaverEmail);
        System.out.println(illyNaverEmail);

    }

    public static String generateNaverMailByName(String name) {
        return name + "@naver.com";
    }



    //            클래스



}
