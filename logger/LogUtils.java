package com.unikve.codelibraryproject.logger;

import com.unikve.codelibraryproject.logger.helper.Logger;
import com.unikve.codelibraryproject.logger.helper.SystemUtil;

/**
 * Custom logger implementation, example uses below: <br/>
 * //Example 1<br/>
 * LogUtils.d("12345");
 * <br/>
 * //Example 2<br/>
 * LogUtils.d("12%s3%d45", "a", 0);
 * <br/>
 * //Example 3<br/>
 * LogUtils.d(new NullPointerException("12345"));
 * <br/>
 * //example 4<br/>
 * Person person = new Person();
 * person.setAge(11);
 * person.setName("pengwei");
 * person.setScore(37.5f);
 * LogUtils.d(person);
 * <br/>
 * //Example 5<br/>
 * String json = "{'a':'b','c':{'aa':234,'dd':{'az':12}}}";
 * LogUtils.json(json);
 * List<Person> list1 = new ArrayList<>();
 * for(int i = 0; i < 4; i++){
 * list1.add(person);
 * }
 * LogUtils.d(list1); <br/>
 * //example 6<br/>
 * LogUtils.d(null); <br/>
 * <p/>
 * //example 7<br/>
 * double[][] doubles = {{1.2, 1.6, 1.7, 30, 33},
 * {1.2, 1.6, 1.7, 30, 33},
 * {1.2, 1.6, 1.7, 30, 33},
 * {1.2, 1.6, 1.7, 30, 33}};
 * LogUtils.d(doubles);
 * <br/>
 * <p/>
 * //example 8 <br/>
 * LogUtils.v("12345"); <br/>
 * LogUtils.i("12345"); <br/>
 * LogUtils.w("12345"); <br/>
 * LogUtils.e("12345"); <br/>
 * LogUtils.wtf("12345"); <br/>
 */
public final class LogUtils {

    public static final String COPY_SUCCESS = "Copied to clipboard.";
    public static final String COPY = "Copy";
    public static final String CANCEL = "Cancel";

    private static Logger logger;

    static {
        logger = new Logger();
    }

    /**
     *
     */
    public static boolean DEBUG = true;

    public static String configTagPrefix = "";

    /**
     * @param msg
     * @param args
     */
    public static void v(String msg, Object... args) {
        logger.v(SystemUtil.getStackTrace(), msg, args);
    }

    public static void v(Object object) {
        logger.v(SystemUtil.getStackTrace(), object);
    }


    /**
     * @param msg
     * @param args
     */
    public static void d(String msg, Object... args) {
        logger.d(SystemUtil.getStackTrace(), msg, args);
    }

    public static void d(Object object) {
        logger.d(SystemUtil.getStackTrace(), object);
    }

    /**
     * @param msg
     * @param args
     */
    public static void i(String msg, Object... args) {
        logger.i(SystemUtil.getStackTrace(), msg, args);
    }

    public static void i(Object object) {
        logger.i(SystemUtil.getStackTrace(), object);
    }

    /**
     * @param msg
     * @param args
     */
    public static void w(String msg, Object... args) {
        logger.w(SystemUtil.getStackTrace(), msg, args);
    }

    public static void w(Object object) {
        logger.w(SystemUtil.getStackTrace(), object);
    }

    /**
     * @param msg
     * @param args
     */
    public static void e(String msg, Object... args) {
        logger.e(SystemUtil.getStackTrace(), msg, args);
    }

    public static void e(Object object) {
        logger.e(SystemUtil.getStackTrace(), object);
    }

    /**
     * @param msg
     * @param args
     */
    public static void wtf(String msg, Object... args) {
        logger.wtf(SystemUtil.getStackTrace(), msg, args);
    }

    public static void wtf(Object object) {
        logger.wtf(SystemUtil.getStackTrace(), object);
    }

    /**
     * @param json
     */
    public static void json(String json) {
        logger.json(SystemUtil.getStackTrace(), json);
    }

}