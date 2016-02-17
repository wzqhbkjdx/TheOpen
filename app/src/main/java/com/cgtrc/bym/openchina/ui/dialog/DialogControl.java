package com.cgtrc.bym.openchina.ui.dialog;

import android.app.ProgressDialog;

/**
 * Created by BYM on 2016/2/17.
 */
public interface DialogControl {

    public abstract void hideWaitDialog();

    public abstract ProgressDialog showWaitDialog();

    public abstract ProgressDialog showWaitDialog(int resid);

    public abstract ProgressDialog showWaitDialog(String text);
}
