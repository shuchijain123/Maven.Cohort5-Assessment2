package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    HashMap<Integer,String> mymap = new HashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    Integer monthNumber;
    String monthName= "January";



    public MonthConversion(Integer monthNumber, String monthName) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
    }
    public MonthConversion() {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
    }

    public Integer getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(Integer monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public void add(Integer monthNumber, String monthName) {


      mymap.put(monthNumber,monthName);



    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String mName = "";

        if (isValidNumber(monthNumber)) {

            mName = mymap.get(monthNumber);

        } else {
            //throw new NullPointerException();
            mName=null;



        }
        return mName;

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        Integer mvalue= 0;
        if(isValidMonth(monthName)) {


            for (Integer key : mymap.keySet()) {


                if (mymap.get(key).equals(monthName)) {

                    mvalue = key;

                }




            }
        }

        return mvalue;




    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {



        Boolean ans =true;

        for (Integer key : mymap.keySet()) {


            if (mymap.containsKey(monthNumber)) {

               ans = true;

            }
            else
            {
                ans = false;
            }



        }

        return ans;


    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {


        Boolean ans =true;

        for (String value : mymap.values()) {


            if (mymap.containsValue(monthName)) {

                ans = true;

            }
            else
            {
                ans = false;
            }



        }

        return ans;


    }


    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return mymap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

        if(mymap.containsKey(monthNumber)) {
            mymap.replace(monthNumber, monthName);
        } else {
            mymap.put(monthNumber, monthName);
        }

    }
}
