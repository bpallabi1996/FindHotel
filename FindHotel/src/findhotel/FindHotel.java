/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findhotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DHIRENDRA
 */
public class FindHotel {

    /**
     * @param args the command line arguments
     */
    private static Hotel x, y, z;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        //setting values for green valley
        x = new Hotel("Green Valley");
        x.setRegularWeekDay(1100);
        x.setRegularWeekEnd(900);
        x.setRewardeeWeekDay(800);
        x.setRewardeeWeekEnd(800);

        //setting values for blue hills
        y = new Hotel("Blue Hills");
        y.setRegularWeekDay(2200);
        y.setRegularWeekEnd(1500);
        y.setRewardeeWeekDay(1000);
        y.setRewardeeWeekEnd(400);

        //setting values for red river   
        z = new Hotel("Red River");
        z.setRegularWeekDay(1600);
        z.setRegularWeekEnd(600);
        z.setRewardeeWeekDay(1100);
        z.setRewardeeWeekEnd(500);

        int index = s.indexOf(":");
        String type = s.substring(0, index);

        int cost_x = 0, cost_y = 0, cost_z = 0;
        int day_index_start = 0, day_index_end = 0;

        while (day_index_start != -1) {
        day_index_start = s.indexOf("(", day_index_start + 1);
        day_index_end = s.indexOf(")", day_index_end + 1);

        if (day_index_start != -1) {
        String day = s.substring(day_index_start + 1, day_index_end);
        if (day.equalsIgnoreCase("sun") || day.equalsIgnoreCase("sat")) {
        if (type.equalsIgnoreCase("regular")) {
        cost_x += x.getRegularWeekEnd();
        cost_y += y.getRegularWeekEnd();
        cost_z += z.getRegularWeekEnd();
        } else {
        cost_x += x.getRewardeeWeekEnd();
        cost_y += y.getRewardeeWeekEnd();
        cost_z += z.getRewardeeWeekEnd();
        }
        } else {
        if (type.equalsIgnoreCase("regular")) {
        cost_x += x.getRegularWeekDay();
        cost_y += y.getRegularWeekDay();
        cost_z += z.getRegularWeekDay();
        } else {
        cost_x += x.getRewardeeWeekDay();
        cost_y += y.getRewardeeWeekDay();
        cost_z += z.getRewardeeWeekDay();
        }
        }
        }
        }
        System.out.println(cost_x);
        System.out.println(cost_y);
        System.out.println(cost_z);

        String result = min(cost_x, cost_y, cost_z);
        System.out.println(result);
        }

        //implementing the min method
        private static String min(int a, int b, int c) {
        if (a < b && a < c) {
        return x.getHotelName();
        } else if (b < a && b < c) {
        return y.getHotelName();
        } else if (c < a && c < b) {
        return z.getHotelName();
        } else if (a == b || b == c) {
        return y.getHotelName();
        } else if (c == a) {
        return z.getHotelName();
        } else {
        return x.getHotelName();
        }
    }
    
}
