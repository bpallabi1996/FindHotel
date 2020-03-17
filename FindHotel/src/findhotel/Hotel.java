/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findhotel;

/**
 *
 * @author DHIRENDRA
 */
public class Hotel {
    String hotelName;
    private int regularWeekDay;
    private int regularWeekEnd;
    private int rewardeeWeekDay;
    private int rewardeeWeekEnd;

   public Hotel(String hotelName){
       this.hotelName=hotelName;
   }

    public int getRegularWeekDay() {
        return regularWeekDay;
    }

    public void setRegularWeekDay(int regularWeekDay) {
        this.regularWeekDay = regularWeekDay;
    }

    public int getRegularWeekEnd() {
        return regularWeekEnd;
    }

    public void setRegularWeekEnd(int regularWeekEnd) {
        this.regularWeekEnd = regularWeekEnd;
    }

    public int getRewardeeWeekDay() {
        return rewardeeWeekDay;
    }

    public void setRewardeeWeekDay(int rewardeeWeekDay) {
        this.rewardeeWeekDay = rewardeeWeekDay;
    }

    public int getRewardeeWeekEnd() {
        return rewardeeWeekEnd;
    }

    public void setRewardeeWeekEnd(int rewardeeWeekEnd) {
        this.rewardeeWeekEnd = rewardeeWeekEnd;
    }
    
    public String getHotelName() {
    return hotelName;
    }
    
}
