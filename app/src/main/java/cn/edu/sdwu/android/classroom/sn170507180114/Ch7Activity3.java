package cn.edu.sdwu.android.classroom.sn170507180114;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Ch7Activity3 extends AppCompatActivity {
    private ArrayList list;
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch7_3);

        //准备数据
        list=new ArrayList();
        HashMap hashMap=new HashMap();
        hashMap.put("n","goods1");
        hashMap.put("price","50");
        hashMap.put("img",R.drawable.a);
        list.add(hashMap);
        hashMap=new HashMap();
        hashMap.put("n","goods2");
        hashMap.put("price","300");
        hashMap.put("img",R.drawable.a);
        list.add(hashMap);
        hashMap=new HashMap();
        hashMap.put("n","goods3");
        hashMap.put("price","500");
        hashMap.put("img",R.drawable.a);
        list.add(hashMap);
        //实例化适配器
        simpleAdapter=new SimpleAdapter(this,list,R.layout.layout_goods,new String[]{"name","price","a"},new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_a});
        //设置到listview
        ListView listView=(ListView)findViewById(R.id.ch7_3_lv);
        listView.setAdapter(simpleAdapter);
        //设置刷新
        //simpleAdapter.notifyDataSetChanged();
    }
}
