package cn.edu.sdwu.android.classroom.sn170507180114;


import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

import static android.view.View.X;


public class Ch6Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch6_1);

        //获取数组资源
        Resources resources=getResources();

        //整型数组
        int[] intArr=resources.getIntArray(R.array.inArr);
        for(int i=0;i<intArr.length;i++){
            Log.i(Ch6Activity1.this.toString(),intArr[i]+"");
        }
        //字符串数组
        String[] strArr=resources.getStringArray(R.array.strArr);
        for(int i=0;i<intArr.length;i++){
            Log.i(Ch6Activity1.this.toString(),strArr[i]);
        }

        //普通类型数组
        TypedArray typedArray=resources.obtainTypedArray(R.array.commanArr);
        ImageView imageView=(ImageView)findViewById(R.id.ch6_iv);
        int resId=typedArray.getResourceId(0,0);
        imageView.setImageResource(resId);

        String str=typedArray.getString(1);
        Log.i(Ch6Activity1.this.toString(),str);

        //注册上下文菜单
        XmlPullParser xmlPullParser=resources.getXml(R.xml.words);
        try{
            while (xmlPullParser.getEventType()!=XmlPullParser.END_DOCUMENT){
                if(xmlPullParser.getEventType()==XmlPullParser.START_TAG){
                    //判断一下是否是word元素（words）直接路过
                    if(xmlPullParser.getName().equals("word")){
                        String word=xmlPullParser.getAttributeValue(0);
                        Log.i(Ch6Activity1.class.toString(),word);
                    }
                }
                xmlPullParser.next();
            }
        }catch (Exception e){
            Log.e(Ch6Activity1.class.toString(),e.toString());
        }

    }



}
