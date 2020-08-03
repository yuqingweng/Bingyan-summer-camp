package com.example.bingyantest;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<Test> mTestList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView testImage;
        TextView testName;

        public ViewHolder(View view) {
            super(view);
            testImage = (ImageView) view.findViewById(R.id.test_image);
            testName = (TextView) view.findViewById(R.id.testname);
        }

    }

    public TestAdapter(List<Test> testList) {
        mTestList = testList;
    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Test test= mTestList.get(position);
        holder.testImage.setImageResource(test.getImageId());
        holder.testName.setText(test.getName());
    }

    @Override
    public int getItemCount() {
        return mTestList.size();
    }
}





































