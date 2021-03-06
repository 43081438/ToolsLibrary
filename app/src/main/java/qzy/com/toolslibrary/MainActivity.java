package qzy.com.toolslibrary;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import qzy.com.toolslibrary.adapter.MainAdapter;
import qzy.com.toolslibrary.ui.AppResetActivity;
import qzy.com.toolslibrary.ui.AppUpdateActivity;
import qzy.com.toolslibrary.ui.BackgroundActivity;
import qzy.com.toolslibrary.ui.HeadViewRecyclerViewActivity;
import qzy.com.toolslibrary.ui.LoggerActivity;
import qzy.com.toolslibrary.ui.NormalRecyclerViewActivity;
import qzy.com.toolslibrary.ui.PicetureMainActivity;
import qzy.com.toolslibrary.ui.RecordAudio2Activity;
import qzy.com.toolslibrary.ui.RecordAudioActivity;
import qzy.com.toolslibrary.ui.RecyclerViewSampleActivity;
import qzy.com.toolslibrary.ui.SVGActivity;
import qzy.com.toolslibrary.ui.SplashActivity;
import qzy.com.toolslibrary.ui.TabBarActivity;
import qzy.com.toolslibrary.utils.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Bind(R.id.swipe_target)
    ListView swipe_target;
    MainAdapter mainAdapter;

    public static List<String> list = new ArrayList<String>();

    @Override
    protected void onViewCreated() {
        list.add("解决android应用被强杀或应用被回收导致的空指针问题");
        mainAdapter = new MainAdapter(initData());
        swipe_target.setAdapter(mainAdapter);
        swipe_target.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(getActivity(), SVGActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getActivity(), RecyclerViewSampleActivity.class));
                        break;

                    case 2:
                        startActivity(new Intent(getActivity(), RecordAudioActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getActivity(), RecordAudio2Activity.class));
                        break;
                    case 4:
                        startActivity(new Intent(getActivity(), PicetureMainActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(getActivity(), TabBarActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(getActivity(), AppUpdateActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(getActivity(), BackgroundActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(getActivity(), LoggerActivity.class));
                        break;
                    case 9:
                        startActivity(new Intent(getActivity(), AppResetActivity.class));
                        break;
                }
            }
        });
    }

    @Override
    protected void protectApp() {
        Toast.makeText(getApplicationContext(),"应用被回收重启走流程",Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, SplashActivity.class));
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    public List<String> initData(){
        List<String> data = new ArrayList<String>();
        data.add("svg图形TextView");
        data.add("RecyclerView");
        data.add("仿微信录制语音（1）");
        data.add("仿微信录制语音（2）");
        data.add("图片(裁剪压缩)、视频(录制)、音频选择器");
        data.add("TabBar支持网络图片");
        data.add("app更新下载安装");
        data.add("背景工具");
        data.add("Logger 日志库");
        data.add("内存回收app重启");
        return data;
    }
}
