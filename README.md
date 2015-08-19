<h4> Integration Steps </h4>
Step1: Copy and paste the “logger” package into your app main package. Once copied, fix the package name errors if any by updating the root package name of your app in logger files.

Step 2: Set LogUtils.DEBUG=true or false in your application. Usually set it to true while developmnet is going on and false when your app is ready to publish.

Step 3: Following are some example uses:

    //Example 1
    LogUtils.d("12345");
    //Example 2
    LogUtils.d("12%s3%d45", "a", 0);
    //Example 3
    LogUtils.d(new NullPointerException("12345"));
    //example 4
    Person person = new Person();
    person.setAge(11);
    person.setName("pengwei");
    person.setScore(37.5f);
    LogUtils.d(person);
    //Example 5
    String json = "{'a':'b','c':{'aa':234,'dd':{'az':12}}}";
    LogUtils.json(json);
    List<Person> list1 = new ArrayList<>();
    for(int i = 0; i < 4; i++){
        list1.add(person);
    }
    LogUtils.d(list1);
    //example 6
    LogUtils.d(null);
    //example 7
    double[][] doubles = {{1.2, 1.6, 1.7, 30, 33},
            {1.2, 1.6, 1.7, 30, 33},
            {1.2, 1.6, 1.7, 30, 33},
            {1.2, 1.6, 1.7, 30, 33}};
    LogUtils.d(doubles);
    //example 8
    LogUtils.v("12345");
    LogUtils.i("12345");
    LogUtils.w("12345");
    LogUtils.e("12345");
    LogUtils.wtf("12345");

That's it! check your logcat to see how it goes.

<h4>Credits:</h4>
This custom logger is based on open source project <a href="https://android-arsenal.com/details/1/2194">here</a>

