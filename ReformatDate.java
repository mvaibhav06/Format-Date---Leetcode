public class ReformatDate {

    public static String formatDate(String date){String[] temp = date.split(" ");
        String day = temp[0].substring(0, temp[0].length()-2);
        int intDay = Integer.parseInt(day);
        if (intDay<10){
            day = "0" + intDay;
        }
        String month = "";
        String inp = temp[1];
        if (inp.equals("Jan")){
            month += "01";
        } else if (inp.equals("Feb")) {
            month += "02";
        }else if (inp.equals("Mar")) {
            month += "03";
        }else if (inp.equals("Apr")) {
            month += "04";
        }else if (inp.equals("May")) {
            month += "05";
        }else if (inp.equals("Jun")) {
            month += "06";
        }else if (inp.equals("Jul")) {
            month += "07";
        }else if (inp.equals("Aug")) {
            month += "08";
        }else if (inp.equals("Sep")) {
            month += "09";
        }else if (inp.equals("Oct")) {
            month += "10";
        }else if (inp.equals("Nov")) {
            month += "11";
        }else {
            month += "12";
        }

        String out = temp[2] + "-" + month + "-" + day;
        return out;

    }

    public static void main(String[] args) {
        String date = "26th May 1960";
        System.out.println(formatDate(date));
    }
}
