package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {

    /**
     * Constructs a new {@link ArticleAdapter}
     *
     * @param context context of the app
     * @param articles the list of articles, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        // Find the TextView with view ID article_title
        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);

        // Set the text of the Title View to the title of the current article
        titleView.setText(currentArticle.getTitle());

        // Find the TextView with view ID article_section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.article_section);

        // Set the text of the Section View to the section of the current article
        sectionView.setText(currentArticle.getSection());

        return listItemView;
    }
}
