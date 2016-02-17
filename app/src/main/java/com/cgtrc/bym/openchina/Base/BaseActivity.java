package com.cgtrc.bym.openchina.Base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.cgtrc.bym.openchina.interf.BaseViewInterface;
import com.cgtrc.bym.openchina.ui.dialog.DialogControl;
import com.cgtrc.bym.openchina.utils.TDevice;

import butterknife.ButterKnife;

/**
 * Created by BYM on 2016/2/17.
 */
public class BaseActivity extends AppCompatActivity implements DialogControl, View.OnClickListener, BaseViewInterface {

    public static final String INTENT_ACTION_EXIT_APP = "INTENT_ACTION_EXIT_APP";

    private boolean _isVisible;
    private ProgressDialog _waitDialog;

    protected LayoutInflater mInflater;
    protected ActionBar mActionBar;
    private TextView mTvActionTitle;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TDevice.hideSoftKeyboard(getCurrentFocus());
        ButterKnife.reset(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void hideWaitDialog() {

    }

    @Override
    public ProgressDialog showWaitDialog() {
        return null;
    }

    @Override
    public ProgressDialog showWaitDialog(int resid) {
        return null;
    }

    @Override
    public ProgressDialog showWaitDialog(String text) {
        return null;
    }

    @Override
    public void onClick(View v) {

    }
}
