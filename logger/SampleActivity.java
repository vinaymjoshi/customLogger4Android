package com.unikve.codelibraryproject.logger;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinay on 17-Aug-15.
 */
public class SampleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
    }
    class Person
    {
        private int Age;
        private String name;
        private float score;

        public float getScore() {
            return score;
        }

        public void setScore(float score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }
    }
}
