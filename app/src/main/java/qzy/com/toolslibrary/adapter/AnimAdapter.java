package qzy.com.toolslibrary.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import qzy.com.toolslibrary.R;
import qzy.com.toolslibrary.base.BaseApplication;
import qzy.com.toolslibrary.bean.Anim;
import qzy.com.utilslib.recyclerAdapter.BaseRecyclerAdapter;

/**
 * 作者：quzongyang
 *
 * 创建时间：2018/2/5
 *
 * 类描述：
 */

public class AnimAdapter  extends BaseRecyclerAdapter<Anim> {

    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.widget_anim, parent, false);
        return new ViewHolder(layout);
    }

    @Override
    public void onBind(RecyclerView.ViewHolder viewHolder, int RealPosition, Anim data) {
        ViewHolder holder = (ViewHolder) viewHolder;
        holder.animName.setText(data.name);
        Glide.with(BaseApplication.getContext()).load(data.resourceId).into(holder.animRes);
    }


    class ViewHolder extends Holder {

        @Bind(R.id.animRes)
        ImageView animRes;
        @Bind(R.id.animName)
        TextView animName;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
