package qzy.com.toolslibrary.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import qzy.com.toolslibrary.R;
import qzy.com.toolslibrary.bean.LiBean;

/**
 * Created by ruzhan on 2017/5/1.
 */

public class TypeCHolder extends RecyclerView.ViewHolder {

  private ImageView iv;
  private TextView tv;

  public TypeCHolder(View itemView) {
    super(itemView);
    iv = (ImageView) itemView.findViewById(R.id.icon_iv);
    tv = (TextView) itemView.findViewById(R.id.title_tv);
  }

  public void bind(int position, LiBean bean) {
    iv.setImageResource(bean.getIcon());
    tv.setText(bean.getText());
  }
}
