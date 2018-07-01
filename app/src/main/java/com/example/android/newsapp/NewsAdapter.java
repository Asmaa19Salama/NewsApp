package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> allNews) {
        super(context, 0, allNews);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleOfArticleView = listItemView.findViewById(R.id.titleOfArticle);
        titleOfArticleView.setText(currentNews.getTitleOfArticle());

        TextView nameOfSectionView = listItemView.findViewById(R.id.nameOfSection);
        nameOfSectionView.setText(currentNews.getNameOfSection());

        String dateObject = currentNews.getDatePublished();
        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(dateObject);
        return listItemView;
    }
}
