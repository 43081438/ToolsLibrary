package qzy.com.toolslibrary.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import qzy.com.toolslibrary.R;
import qzy.com.toolslibrary.adapter.MainAdapter;
import qzy.com.toolslibrary.utils.base.BaseActivity;

/**
 * author : quzongyang
 * e-mail : quzongyang@xiaohe.com
 * time   : 2018/11/15
 * desc   : RecyclerView Demo
 * version: 1.0
 */


public class RecyclerViewSampleActivity  extends BaseActivity {

    @Bind(R.id.swipe_target)
    ListView swipe_target;
    MainAdapter mainAdapter;

    @Override
    protected void onViewCreated() {
        mainAdapter = new MainAdapter(initData());
        swipe_target.setAdapter(mainAdapter);
        swipe_target.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(getActivity(), HeadViewRecyclerViewActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getActivity(), NormalRecyclerViewActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getActivity(), StaggeredGridActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getActivity(), TaoBaoSampleActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(getActivity(), StandardMultiActivity.class));
                        break;
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recycler_sample;
    }

    public List<String> initData(){
        List<String> data = new ArrayList<String>();
        data.add("封装有headView的RecyclerView");
        data.add("封装普通的RecyclerView");
        data.add("RecyclerView瀑布流");
        data.add("RecyclerView仿淘宝复杂界面实现");
        data.add("RecyclerView电商复杂界面");
        return data;
    }
}
