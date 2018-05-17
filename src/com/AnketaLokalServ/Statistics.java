package com.AnketaLokalServ;

import java.util.ArrayList;
import java.util.List;

public class Statistics{

    private List<Users> userList = new ArrayList<>();



    private static final String TEMPLATE = "<html>" +
            "<head><title>Prog.kiev.ua</title>" +
            "</head><body>" + "<h1>%s</h1>" + "</body></html>";

    public Statistics() {
    }

    public List<Users> getUserList() {
        return userList;
    }

    public String getStats() {

        int maleLoveJava = 0;
        int femaleLoveJava = 0;

        int maleHateJava = 0;
        int femaleHateJava = 0;

        int maleHateSmoke = 0;
        int femaleHateSmoke = 0;

        int maleLoveSmoke = 0;
        int femaleLoveSmoke = 0;

        int maleLoveBeer = 0;
        int femaleLoveBeer = 0;

        int maleHateBeer = 0;
        int femaleHateBeer = 0;


        for (Users user : userList) {
            if (user.getSex().equals("0")) {
                if (user.getJava().equals("1")) femaleLoveJava++;
                else femaleHateJava++;
                if (user.getSmoke().equals("1")) femaleLoveSmoke++;
                else femaleHateSmoke++;
                if (user.getBeer().equals("1")) femaleLoveBeer++;
                else femaleHateBeer++;
            } else {
                if (user.getJava().equals("1")) maleLoveJava++;
                else maleHateJava++;
                if (user.getSmoke().equals("1")) maleLoveSmoke++;
                else maleHateSmoke++;
                if (user.getBeer().equals("1")) maleLoveBeer++;
                else maleHateSmoke++;
            }
        }

        String stats = String.format(TEMPLATE, "maleLoveJava: " + maleLoveJava + "\n")
                + String.format(TEMPLATE, "maleHateJava: " + maleHateJava + "\n")
                + String.format(TEMPLATE, "maleLoveGirls: " + maleLoveSmoke + "\n")
                + String.format(TEMPLATE, "maleHateGirls: " + maleHateSmoke + "\n")
                + String.format(TEMPLATE, "maleLoveBeer: " + maleLoveBeer + "\n")
                + String.format(TEMPLATE, "maleHateBeer: " + maleHateBeer + "\n")
                + String.format(TEMPLATE, "femaleLoveJava: " + femaleLoveJava + "\n")
                + String.format(TEMPLATE, "femaleHateJava: " + femaleHateJava + "\n")
                + String.format(TEMPLATE, "femaleLoveCats: " + femaleLoveSmoke + "\n")
                + String.format(TEMPLATE, "femaleHateCats: " + femaleHateSmoke + "\n")
                + String.format(TEMPLATE, "femaleLoveBeer: " + femaleLoveBeer + "\n")
                + String.format(TEMPLATE, "femaleHateBeer: " + femaleHateBeer + "\n");

        return stats;
    }

}
