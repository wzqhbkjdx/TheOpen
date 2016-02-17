package com.cgtrc.bym.openchina.Base;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;

import com.cgtrc.bym.openchina.AppContext;
import com.cgtrc.bym.openchina.interf.BaseFragmentInterface;

/**
 * Created by BYM on 2016/2/17.
 */
public class BaseFragment extends Fragment implements View.OnClickListener, BaseFragmentInterface{

    public static final int STATE_NONE = 0;
    public static final int STATE_REFRESH = 1;
    public static final int STATE_LOADMORE = 2;
    public static final int STATE_NOMORE = 3;
    public static final int STATE_PRESSNONE = 4;// 正在下拉但还没有到刷新的状态
    public static int mState = STATE_NONE;

    protected LayoutInflater mInflater;

    public AppContext getApplication() {
        return (AppContext) getActivity().getApplication();
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {

    }
}
