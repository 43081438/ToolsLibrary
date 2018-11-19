package qzy.com.toolslibrary.ui.fragment.taobao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qzy.com.toolslibrary.R;


/**
 * @author Smile Wei
 * @since 2017/3/2.
 */

public class NavHelpFragment extends Fragment {

    public static NavHelpFragment newInstance() {
        NavHelpFragment fragment = new NavHelpFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_navigation_help, container, false);
    }
}
