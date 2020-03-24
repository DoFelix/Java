import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Felix {
    public static void main(String[] args) {

        String[] aphorisms = new String[9];
        aphorisms[0] = "听人说话说完再插嘴，自己说话想清楚了再说，语速要慢，内容要有条理清楚，要细致";
        aphorisms[1] = "少说，多干，多想，女孩子不喜欢话多的男生";
        aphorisms[2] = "不要成为一个可怜的人，因为可怜之人必有可恨处，所以也不要轻易可怜别人";
        aphorisms[3] = "每天阳光点，远离负能量，多点正能量，嘴角微微上扬，做最帅的自己";
        aphorisms[4] = "时刻保持自身环境整洁，坚持锻炼身体，不要等受欺负了或需要的时候拿不出手";
        aphorisms[5] = "不要冲动，不要冲动，不要冲动,不要冲动，不要冲动，不要冲动";
        aphorisms[6] = "对自己要有信心，自己对自己都没有信心，你还能干成啥？";
        aphorisms[7] = "对待别人要细心耐心关心，特别是异性";
        aphorisms[8] = "忌说脏话，生活要有品位，要有节奏，有茶有酒有人生，有慢有紧有规律";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("-------------------------------------");
        try {
            Calendar cal = Calendar.getInstance();
            //获取当前年份
            int year = cal.get(Calendar.YEAR);
            int zhou = year - 1995;
            //计算周岁
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            System.out.println("日期：" + year + "-" + month + "-" + day);
            //如果当前日期大于 09 26则
            Date birthday = sdf.parse(year + "-09-26 00:00:00");
            Date d2 = sdf.parse(year + "-" + month + "-" + day + " 00:00:00");
            int between = daysBetween(birthday, d2);
            double days = 365.25 * zhou + between;
            System.out.println(days);

            /**
             * 若所的“余数”小于此生物钟的半周期数，那么此生物钟运转在高潮期；
             * 若大于半周期数，则运行在低潮区；
             * 若接近半周期数或整周期数以及“余数”为零者，为临界期。
             */
            // 三高标志
            boolean flag = false;
            boolean high = false;
            boolean low = false;
            double zhi = days % 33;
            double qing = days % 28;
            double ti = days % 23;
            System.out.print("智力（16.5）： " + zhi);

            if (zhi < 16.5 && zhi != 0) {
                System.out.println(" 智力上升期 ===>巅峰时适合学习 注意要有目的性的去学习");
                flag = true;
            } else if (zhi > 16.5) {
                System.out.println(" 智力下降期 ===>巅峰时适合学习 注意要有目的性的去学习");
                flag = false;
            } else if (zhi == 16.5) {
                System.out.println(" 巅峰临界期，即将开始下降 ===>巅峰时适合学习 注意要有目的性的去学习");
                high = true;
            } else if (zhi == 0) {
                System.out.println(" 低谷临界期，即将开始上升 ===>巅峰时适合学习 注意要有目的性的去学习");
                low = true;
            }


            System.out.print("情绪（14）： " + qing);
            if (qing < 14 && qing != 0) {
                flag = true;
                System.out.println(" 情绪上升期 ===>巅峰时多于朋友沟通，触发生活灵感");
            } else if (qing > 14) {
                System.out.println(" 情绪下降期 ===>巅峰时多于朋友沟通，触发生活灵感");
                flag = false;
            } else if (qing == 14) {
                System.out.println(" 巅峰临界期，即将开始下降 ===>巅峰时多于朋友沟通，触发生活灵感");
                high = true;
            } else if (qing == 0) {
                System.out.println(" 低谷临界期，即将开始上升 ===>巅峰时多于朋友沟通，触发生活灵感");
                low = true;
            }


            System.out.print("体能（11.5）： " + ti);
            if (ti < 11.5 && ti != 0) {
                flag = true;
                System.out.println(" 体能上升期 ===>巅峰时适合做重复性工作");
            } else if (ti > 11.5) {
                System.out.println(" 体能下降期 ===>巅峰时适合做重复性工作");
                flag = false;
            } else if (ti == 11.5) {
                System.out.println(" 巅峰临界期，即将开始下降 ===>巅峰时适合做重复性工作");
                high = true;
            } else if (ti == 0) {
                System.out.println(" 低谷临界期，即将开始上升 ===>巅峰时适合做重复性工作");
                low = true;
            }

            System.out.println("-------------------------------------");
            System.out.println("overall===> " + flag);
            System.out.println("high===>" + high);
            System.out.println("low===>" + low);
            if (flag) {
                System.out.println("总体趋势上升~~！ 可以放心但是要稳住！！");
            } else {
                System.out.println("注意：有下降的趋势~~！ 注意自己的下降期，请务必小心！！");
            }

            if (high == true) {
                System.out.println("今天三高呀~~！ 好日子！！");
            }

            if (low == true) {
                System.out.println("今天三低呀~~！ 小心点！！");
            }
            System.out.println("-------------------------------------");
            Random random = new Random();
            int num = random.nextInt(9);
            System.out.println("幸运数字" + num);
            System.out.println("今日名言：" + aphorisms[num]);
            System.out.println("体验你价值的不是你能做多少 而是你能做什么");
            System.out.println("为了6,7月跟高的追求 你今晚想好要做什么了吗？");
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public static int daysBetween(Date smdate, Date bdate) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        smdate = sdf.parse(sdf.format(smdate));

        bdate = sdf.parse(sdf.format(bdate));

        Calendar cal = Calendar.getInstance();

        cal.setTime(smdate);

        long time1 = cal.getTimeInMillis();

        cal.setTime(bdate);

        long time2 = cal.getTimeInMillis();

        long between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));

    }

}
