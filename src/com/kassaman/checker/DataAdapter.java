package com.kassaman.checker;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import com.kassaman.checker.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class DataAdapter extends ArrayAdapter<Data> {

    public DataAdapter(Context context, int resource, int textViewResourceId, List<Data> objects) {
        super(context, resource, textViewResourceId, objects);
        // TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);

        Data data = getItem(position);

        TextView pro = (TextView) v.findViewById(R.id.productTExt);
        pro.setText(data.getProductname());

        TextView num = (TextView) v.findViewById(R.id.numText);
        num.setText(Integer.toString(data.getNumber()) + "��");

        TextView limit = (TextView) v.findViewById(R.id.limitText);

        Calendar cal = data.getDate();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        limit.setText(year + "�N" + (month + 1) + "��" + day + "��");
        
        TextView cou = (TextView) v.findViewById(R.id.countText);
        cou.setText("����"+data.getLimit()+ "��");

        return v;
    }

}
