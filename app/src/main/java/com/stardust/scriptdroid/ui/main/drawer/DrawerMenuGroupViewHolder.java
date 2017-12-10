package com.stardust.scriptdroid.ui.main.drawer;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.stardust.scriptdroid.R;
import com.stardust.scriptdroid.ui.widget.BindableViewHolder;

/**
 * Created by Stardust on 2017/12/10.
 */

public class DrawerMenuGroupViewHolder extends BindableViewHolder<DrawerMenuItem> {

    private TextView mTextView;

    public DrawerMenuGroupViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.title);
    }

    @Override
    public void bind(DrawerMenuItem data, int position) {
        mTextView.setText(data.getTitle());
        int padding = itemView.getResources().getDimensionPixelOffset(R.dimen.divider_drawer_menu_group);
        itemView.setPadding(0, position == 0 ? 0 : padding, 0, 0);
    }
}
