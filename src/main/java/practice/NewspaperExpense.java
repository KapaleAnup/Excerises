package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class NewspaperExpense {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NewspaperExpense npe = new NewspaperExpense();
        Object[][] priceList= {{"TOI", "3", "3", "3", "3", "3","5", "6"},
                {"Hindu", "2.5", "2.5", "2.5", "2.5", "2.5", "4", "4"},
                {"ET", "2", "2", "2", "2", "2", "2", "10"},
                {"BM", "1.5", "1.5", "1.5", "1.5", "1.5", "1.5", "1.5"},
                {"HT", "2", "2", "2", "2", "2", "4", "4"}};
        //npe.parseCSVFile();
        npe.calculateExpenses(priceList, npe.parseCSVFile(), npe.countOfDays(npe.getDaysDetails()));
    }
    public void calculateExpenses(Object[][] priceList, List<String> subscriptionList, Map<String, Integer> daysCount) {
        for(String paper: subscriptionList){
            System.out.println(paper);
            float sum=0;
            for(int i = 0; i<priceList.length; i++) {
                if(priceList[i][0].toString().equalsIgnoreCase(paper)) {
                    for(int j = 1;j<priceList[i].length; j++ )
                        sum+=Float.valueOf(priceList[i][j].toString()) * (int)daysCount.get(DayOfWeek.of(j).toString());
                    //sum+=((float)(priceList[i][j])*(int)(daysCount.get(DayOfWeek.of(j).toString())));
                    break;
                }
            }
            System.out.println(sum);
        }
    }
    public Map<String, Integer> getDaysDetails() {
        Calendar now = Calendar.getInstance();
        now.setFirstDayOfWeek(1);
        Map<String, Integer> daysDetails = new HashMap<String, Integer>();
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int currentDayOfWeek = now.get(Calendar.DAY_OF_WEEK);
        int currentDate = now.get(Calendar.DAY_OF_MONTH);
        int daysInMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        // System.out.println(currentMonth+" "+(currentDayOfWeek)+" "+currentDate);
        now.getFirstDayOfWeek();
        int firstDay = (7 - (currentDate % 7) + currentDayOfWeek) % 7;
        // today=(7-(24%7)+2+1)%8;
        // today=4-(19%8)-2;
        // today=((7-(21%7)+4)%7) +1;
        // System.out.println(today);
        daysDetails.put("firstDay", firstDay);
        daysDetails.put("daysInMonth", daysInMonth);
        System.out.println(daysDetails);
        return daysDetails;
    }
    public Map<String, Integer> countOfDays(Map<String, Integer> daysDetails){
        //System.out.println(DayOfWeek.of(daysDetails.get("firstDay")));
        // System.out.println(Month.of(currentMonth));
        Map<String, Integer> daysCount = new HashMap<String, Integer>();
        for (int i = 1; i <= daysDetails.get("daysInMonth"); i++) {
            String day = DayOfWeek.of((daysDetails.get("firstDay") + i - 2) % 7 + 1).toString();
            try {
                Integer count = daysCount.get(day);
                daysCount.put(day, count + 1);
                // System.out.println(day+" "+daysCount.get(day));
            } catch (NullPointerException npe) {
                daysCount.put(day, 1);
                // System.out.println(day+" "+daysCount.get(day));
            }
        }
        System.out.println(daysCount);
        return daysCount;
    }
    public List<String> parseCSVFile(){
        String csvFile = "src/main/resources/subscriptions.csv";
        String line = "";
        String csvSplitBy = ",";
        List<String> subscriptions = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                subscriptions = Arrays.asList(line.split(csvSplitBy));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(subscriptions);
        return subscriptions;
    }
}